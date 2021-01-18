import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    /**
     * 文件复制
     */
    public static void main(String[] args) throws IOException {
        File input=new File("D:\\mp3\\mp3");
        File output=new File("d:/mp33");

        if(!output.exists()){
            output.createNewFile();
        }
        //定义输入、输出流
        FileInputStream fis=new FileInputStream(input);
        FileOutputStream fos=new FileOutputStream(output);
        long start=System.currentTimeMillis();
        byte[] bytes=new byte[1024*8];
        int len;
        //每次输入流执行到byte[] 的内容，就是复制的内容
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);//bytes长度不一定都放满了
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        fis.close();
        fos.close();

        //可以使用缓冲输入流、缓冲输出流来进行复制




    }
}
