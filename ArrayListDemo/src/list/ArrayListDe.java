
package list;
import java.util.ArrayList;
import java.util.List;


public class ArrayListDe {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("我是");
        list.add("中国人");
        list.add(3,"吃了吗");
        System.out.println(list);

        String s=list.get(2);//得到下标为2的内容
        System.out.println(s);

        list.set(4,"好的");//将下标为4的内容修改为好的
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.isEmpty());//返回是否是一个空的线性表
        System.out.println(list.size());

        System.out.println(list.contains("中国人"));
        System.out.println(list.contains("我是"));
        System.out.println(list.indexOf("我是"));//返回线性表中第一个遇到我是的下标
        System.out.println(list.lastIndexOf("我是"));//返回线性表中最后一个遇到我是的下标
        System.out.println(list.indexOf("中国人"));









    }
}
