package javaTest;

import java.io.File;
import java.io.IOException;

public class FileCreateAndDelDemo {
    /**
     * 字节流，文件复制
     */
    public static void main(String[] args) {
        
    }




    /**
     * 文件遍历
     * @param args
     */
    public static void main2(String[] args) {
        //获取users目录对象
        File file=new File("C:\\users");
        //如果文件或者目录存在
        if(file.exists()){

            String[] files=file.list();
            // //获取目录下的文件和目录的名称
            for(String fileName:files){
                System.out.println(fileName);
            }
            System.out.println("_______________");

            //获取文件列表
            File[] subFiles=file.listFiles();
            for(File f:subFiles){
                //如果是目录
                if(f.isDirectory()){
                    System.out.println("|-"+f.getName());

                }else{
                    //如果是文件
                    System.out.println("-"+f.getName());
                }
            }



        }else{
            System.out.println("There is no files and dirs!");
        }

    }


    public static void main1(String[] args) {
        //创建一个文件类型的对象
        File file=new File("hello.txt");
        File dir=new File("d://creatDir");
        System.out.println("文件是否存在"+file.exists());
        System.out.println("文件夹是否存在"+dir.exists());

        if(!file.exists()){
            try{
                //如果文件不存在则创建一个新的文件
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(!dir.exists()){
            //如果文件夹不存在则创建一个文件夹
            dir.mkdir();
        }
        System.out.println("文件是否存在"+file.exists());
        System.out.println("文件夹是否存在"+dir.exists());
        System.out.println("文件的绝对路径是:"+file.getAbsolutePath());
        System.out.println("文件夹的绝对路径是"+dir.getAbsolutePath());

        //删除文件
        file.delete();
        System.out.println("文件是否存在："+file.exists());

    }
}
