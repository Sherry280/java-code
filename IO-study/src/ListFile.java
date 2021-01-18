import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFile {
    public static void main(String[] args) {
        //将文件夹遍历
        File dir=new File("D:\\mp3\\mp3");
        List<File> file=listDir2(dir);
        //assert file != null;
        file.stream().forEach(System.out::println);


    }
    public static List<File> listDir(File dir){
        List<File> list=new ArrayList<>();
        if(dir.isFile()){//效率不太高：如果是文件，返回的list只有一个元素
            list.add(dir);
        }else if(dir.isDirectory()){//如果是文件夹
            File[] children=dir.listFiles();
            if(children!=null){
                for(File child:children){
                    List<File> files=listDir(child);
                    list.addAll(files);
                }
            }

        }
        return list;

    }
    public static List<File> listDir2(File dir){
        List<File> list=new ArrayList<>();
      if(dir.isDirectory()){//传进来得肯定是目录，所以可以不要
          //如果是目录，获取目录下一级的子文件、子文件夹
          File[] children=dir.listFiles();
          if(children!=null){
              for(File child:children){
                  //如果要添加文件夹得话，就这样进行操作
                  list.add(child);

                  if(child.isDirectory()) {
                      list.addAll(listDir2(child));
                  }
//                  }else{
//                      list.add(child);
//                  }
              }
          }
      }
      return list;
    }
}
