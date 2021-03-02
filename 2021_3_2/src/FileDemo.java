import java.io.File;
import java.io.IOException;

public class FileDemo {
    /**
     * 递归打印文件目录列表
     */
    public static void main(String[] args) {
        File file=new File("C:\\python代码\\demo_dir");
        listAllFiles(file);


    }

    private static void listAllFiles(File file) {
        if(file.isDirectory()){
            File[] result=file.listFiles();
            if(result!=null){
                for(File r:result) {
                    listAllFiles(r);
                }
            }
        }else{
            System.out.println(file);
        }
    }

    /**
     * 创建一个
     */
    public static void main3(String[] args) throws IOException {
        String path="C:\\python代码\\";
        String mkdir="demo_dir\\dir1\\dir2\\test.java";
        String pathname=path+mkdir;

        File file=new File(pathname);
        File parentFile = file.getParentFile();
        if(!parentFile.exists()){
            parentFile.mkdirs();
            System.out.println("路径："+parentFile.getAbsolutePath()+"不存在，创建");
        }
        if(!file.exists()){
            file.createNewFile();
        }
    }

    /**
     *创建一个新的文件
     */
    public static void main2(String[] args)  {
        String path="C:\\python代码\\";
        String name="demo1.txt";
        String pathname=path+name;

        File file=new File(pathname);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                //e.printStackTrace();
                System.out.println("文件"+pathname+"创建失败");
            }
        }else{
            System.out.println("文件已经创建，不需要创建");
        }
    }
    public static void main1(String[] args) {
        String path="C:\\python代码\\";
        String name="test.doc";
        String pathname=path+name;

        File file=new File(pathname);
        boolean res=file.exists();
        //我们在检验文件是否存在时，可以自己先创建一个文件夹，方便查看得出的结果
        System.out.println("文件"+pathname+";  "+"文件是否存在："+res);


    }
}
