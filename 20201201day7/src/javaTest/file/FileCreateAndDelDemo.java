package javaTest.file;

import java.io.*;

public class FileCreateAndDelDemo {
    /**
     * 字节流，文件复制
     * 利用字节流复制文本文件
     * @param args
     */
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("FileCopyDemo2.java"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("newFileCopyDemo2.dat"));

            String line=null;

            do {
                line=br.readLine();
                if(null!=line){
                    bw.write(line);
                }
            } while(line!=null);
            br.close();
            bw.close();
            System.out.println("The file was copyed!");


        }catch (IOException e){
            e.printStackTrace();

        }
    }
    /**
     * 字节流，文件复制
     */
    public static void main3(String[] args) throws IOException {
        String byteFilename = "byteFile.dat";
        String copyFilename = "copyByteFile.dat";
        //创建文件输入流对象
        FileInputStream fn = new FileInputStream(byteFilename);
        //创建文件输出流对象
        FileOutputStream fout = new FileOutputStream(copyFilename);

        //字节缓冲区
        byte[] buffer = new byte[512];
        int count = 0;
        do {
            count = fn.read(buffer);
            if (count != -1) {
                fout.write(buffer);//写入输出流
            }
        }while(count!=-1);
            fn.close();//关闭输入流
            fout.close();//关闭输出流
            System.out.println("Copyfile from"+byteFilename+"to"+copyFilename);

    }


            /**
             * 文件遍历
             * @param args
             */
            public static void main2 (String[]args){
                //获取users目录对象
                File file = new File("C:\\users");
                //如果文件或者目录存在
                if (file.exists()) {

                    String[] files = file.list();
                    // //获取目录下的文件和目录的名称
                    for (String fileName : files) {
                        System.out.println(fileName);
                    }
                    System.out.println("_______________");

                    //获取文件列表
                    File[] subFiles = file.listFiles();
                    for (File f : subFiles) {
                        //如果是目录
                        if (f.isDirectory()) {
                            System.out.println("|-" + f.getName());

                        } else {
                            //如果是文件
                            System.out.println("-" + f.getName());
                        }
                    }


                } else {
                    System.out.println("There is no files and dirs!");
                }

            }


            public static void main1 (String[]args){
                //创建一个文件类型的对象
                File file = new File("hello.txt");
                File dir = new File("d://creatDir");
                System.out.println("文件是否存在" + file.exists());
                System.out.println("文件夹是否存在" + dir.exists());

                if (!file.exists()) {
                    try {
                        //如果文件不存在则创建一个新的文件
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (!dir.exists()) {
                    //如果文件夹不存在则创建一个文件夹
                    dir.mkdir();
                }
                System.out.println("文件是否存在" + file.exists());
                System.out.println("文件夹是否存在" + dir.exists());
                System.out.println("文件的绝对路径是:" + file.getAbsolutePath());
                System.out.println("文件夹的绝对路径是" + dir.getAbsolutePath());

                //删除文件
                file.delete();
                System.out.println("文件是否存在：" + file.exists());

            }
        }

