package List;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListToArray {

    public static void main(String[] args) {
        List<String> list=new ArrayList <>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Object[] objects=list.toArray();
        for(Object o:objects){
            String s=(String)o;
            System.out.println(s.toLowerCase());//转小写
        }

        String[] sArray=new String[5];
        String[] strings=list.toArray(sArray);
        //打印数组，需要使用Arrays.toString
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));
        //strings和sArray 指向同一个对象
        System.out.println(sArray==strings);



        String[] sArray1={"1","2","3","4","5","6","7","8"};
        String[] strings1=list.toArray(sArray1);
        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(sArray1));


//        String[] sArray=new String[1];
//        sArray[0]="hello";
//        String[] strings=list.toArray(sArray);
//        System.out.println(Arrays.toString(strings));
//        System.out.println(Arrays.toString(sArray));


//        String[] strings=list.toArray(new String[0]);
//        for(String s:strings){
//            System.out.println(s);
//        }

    }
}
