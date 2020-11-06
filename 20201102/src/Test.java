import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Integer[] str=new Integer[]{5,8,3,0};
        for(Integer e:str){
            System.out.println(e);
        }







//        List<String> list=new ArrayList<>();
//
//        String[] array={"99","876","543","haha"};
//
//        Collections.addAll(list,array);
//        System.out.println(list);








//        List<String> list=Arrays.asList("99","88","xixi","66");
//        System.out.println(list);





//        List<Short> list=new ArrayList<>();
//        list.add(1);
//        list.add();
//
//        Short[] array=list.toArray(new Short[0]);
//        //new Integer[]中元素的多少自己可以定义，一般从0开始，需要多少开辟多少
//        for(Short in:array){
//            System.out.println(in);
//        }






        //直接调用list.toArray()将其转为数组
        //再调用Arrays.toString()将数组元素打印出来
        //System.out.println(Arrays.toString(list.toArray()));

    }
}
