import java.io.*;

public class FileInput {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\mp3\\mp3");
        //文件输入字节流
        FileInputStream fis=new FileInputStream(file);
        byte[] bytes=new byte[1024];
        //while( i=fis.read(bytes)){

        }

        //3.缓冲流：缓冲字节输入、缓冲字符输入
        //FileInputStream fis=new FileInputStream(file);//文件字节输入流
        //缓冲字节输入流
       // BufferedInputStream bis=new BufferedInputStream(fis);





        File file=new File("E:/tmp/1.txt");
        //把a-z换行输出到某个文件，需要考虑文件是否存在
//        if(!file.exists()){
//            file.createNewFile();
//        }
        //类似输入的几种写法都是ok的
        //new FileWriter()/new FileOutStream()/new BufferedWriter()/new PrintWriter()
//        BufferedWriter bw=new BufferedWriter(new FileWriter(file));
//        bw.write("\n");
        //打印输出流
       // PrintWriter pw=new PrintWriter(new FileWriter(file));
//        PrintWriter pw=new PrintWriter(new FileOutputStream(file));
//
//        //快速打印a-z
//        //int a='a';
//        for(int i='a';i<'z';i++){
//            pw.println((char)i);
//        }
//        pw.flush();






   // }
}
