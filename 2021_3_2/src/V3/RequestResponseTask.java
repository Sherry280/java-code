package V3;

import java.io.*;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RequestResponseTask implements Runnable {
    private static final String DOC_BASE="C:\\JAVA Code\\java实习冲刺班\\2021_3_2";
    private  final Socket socket;

    public RequestResponseTask(Socket socket) {
        this.socket = socket;
    }

    private static final Map<String,String> mineType=new HashMap<>();
    static{
        mineType.put("txt","text/plain");
        mineType.put("html","text/html");
        mineType.put("js","application/javascript");
        mineType.put("jpg","image/jpeg");

    }

    @Override
    public void run() {
        try {
            System.out.println("一条 TCP 连接已经建立");

            //运行HTTP，请求解析-->解析出路径
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            scanner.next();//读取请求行的第二个，是url,所以第一个不保存
            String path = scanner.next();
            scanner.nextLine();//读取出来版本信息，但是不用

            String requestURI=path;
            String queryString="";
            if(path.contains("?")){
                int i=path.indexOf("?");
                requestURI=path.substring(0,i);
                queryString=path.substring(i+1);

            }
            System.out.println(requestURI);
            Map<String,String> headers=new HashMap<>();
            //通过Scanner来获取请求头
            String headerLine;
            while(scanner.hasNextLine()&&!(headerLine=scanner.nextLine()).isEmpty()){
                //通过：进行分割
                String[] part=headerLine.split(":");
                String name=part[0].trim().toLowerCase();//HTTP的head name不区分大小写
                String value=part[1].trim();

                headers.put(name,value);
            }
            //设置默认访问文件
            if(path.equals("/")){
                path="/index.html";
            }
            if(requestURI.equals("/set-cookie")){
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);
                printWriter.printf("HTTP/1.0 307 Temporary Redirect\r\n");
                printWriter.printf("Set-Cookie:username=xiaoxiannv\r\n");
                printWriter.printf("Location:profile\r\n");
                printWriter.printf("\r\n");
                printWriter.flush();

            }else if(requestURI.equals("/profile")){
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String username=null;
                //从cookie中怎样拿到username
                String cookie=headers.getOrDefault("cookie","");
                System.out.println("cookie value:"+cookie);
                for(String cookieKV:cookie.split(";")){
                    if(cookieKV.isEmpty()){
                        continue;
                    }
                    String[] kv=cookieKV.split("=");
                    String cookieName=kv[0];
                    String cookieValue=kv[1];
                    if(cookieName.equals("username")){
                        username=cookieValue;
                    }
                }

                printWriter.printf("HTTP/1.0 200  OK\r\n");
                printWriter.printf("Content-Type:text/html; Charset=utf-8\r\n");
                printWriter.printf("\r\n");
                if(username!=null){
                    printWriter.printf("<h1>当前用户是：%s</h1>",username);
                }else{
                    printWriter.printf("<h1>当前用户需要登陆</h1>");
                }
                printWriter.flush();
            }else if(requestURI.equals("/redirect-to")){
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                printWriter.printf("HTTP/1.0 307  Temporary Redirect\r\n");
                printWriter.printf("Content-Type:text/html; Charset=utf-8\r\n");
                printWriter.printf("Location:/hello.jpg\r\n");
                printWriter.printf("\r\n");

            }else if(requestURI.equals("/goodbye.html")) {
                OutputStream outputStream = socket.getOutputStream();
                Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                PrintWriter printWriter = new PrintWriter(writer);

                String target="世界";
                for(String kv:queryString.split("&")){
                    if(kv.isEmpty()){
                        continue;
                    }
                    String[] part=kv.split("=");

                    String key=URLDecoder.decode(part[0],"UTF-8");
                    String value= URLDecoder.decode(part[1],"UTF-8");
                    if(key.equals("target")){
                        target=value;
                    }

                }

                // 写响应
                // 写响应行
                printWriter.printf("HTTP/1.0 200 OK\r\n");
                // 写响应头
                printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");
                // 写入空行，代表响应头结束
                printWriter.printf("\r\n");
                // 写响应体，html 内容
                printWriter.printf("<h1>再见:%s</h1>",target);
                // 刷新，把数据写入 TCP 发送缓冲区
                printWriter.flush();

            }else {

                String filePath = DOC_BASE + requestURI;//用户请求静态资源的路径
                //0.暂时不考虑文件时目录
                //1.判断该文件是否存在
                File resource = new File(filePath);
                if (resource.exists()) {
                    //读取文件的内容，写入response body
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                    PrintWriter printWriter = new PrintWriter(writer);

                    String contentType = "text/plain";
                    //找到路径对应的后缀（字符串处理）
                    if (path.contains(".")) {
                        int i = path.lastIndexOf(".");
                        String suffix = path.substring(i + 1);
                        contentType = mineType.getOrDefault(suffix, contentType);
                    }

                    //如果contentType是text，代表是文本
                    if (contentType.startsWith("text/")) {
                        contentType = contentType + ";charset=utf-8";

                    }


                    // 写响应
                    // 写响应行
                    printWriter.printf("HTTP/1.0 200 OK\r\n");
                    // 写响应头
                    printWriter.printf("Content-Type:%s\r\n", contentType);
                    // 写入空行，代表响应头结束
                    printWriter.printf("\r\n");
                    printWriter.flush();//否则数据不会被写入发送消息的响应头中

                    //写入response  body
                    try (InputStream resourceInputStream = new FileInputStream(resource)) {
                        byte[] buffer = new byte[1024];
                        while (true) {
                            int len = resourceInputStream.read(buffer);
                            if (len == -1) {
                                break;
                            }
                            outputStream.write(buffer, 0, len);
                        }
                        outputStream.flush();
                    }

                } else {
                    //直接返回404错误
                    // 直接写回响应
                    OutputStream outputStream = socket.getOutputStream();
                    Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
                    PrintWriter printWriter = new PrintWriter(writer);

                    // 写响应
                    // 写响应行
                    printWriter.printf("HTTP/1.0 404 NOT Found\r\n");
                    // 写响应头
                    printWriter.printf("Content-Type: text/html; charset=utf-8\r\n");
                    // 写入空行，代表响应头结束
                    printWriter.printf("\r\n");
                    // 写响应体，html 内容
                    printWriter.printf("<h1>%s:对应的资源不存在</h1>", path);
                    // 刷新，把数据写入 TCP 发送缓冲区
                    printWriter.flush();

//            socket.close();
//            System.out.println("一条 TCP 连接已经释放");
                }
            }
        } catch (IOException exc) {
            // 因为单次的请求响应周期错误，不应该影响其他请求响应周期
            // 所以，我们只做打印，不终止进程
            exc.printStackTrace(System.out);
        }finally {
            try{
                socket.close();
                System.out.println("一条TCP连接已经释放！");
            }catch(IOException exc){
                exc.printStackTrace(System.out);
            }
        }
    }
}
