package 网络知识;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8080);
        //端口号已经建立好了

        InputStream inputStream=socket.getInputStream();
        Scanner scanner=new Scanner(inputStream,"UTF-8");

        OutputStream outputStream=socket.getOutputStream();
        Writer writer=new OutputStreamWriter(outputStream,"UTF-8");
        PrintWriter printWriter=new PrintWriter(writer);
        printWriter.printf("你好，我是大美女！\r\n");
        printWriter.flush();

        String message=scanner.nextLine();
        System.out.println(message);

        socket.close();




    }
}
