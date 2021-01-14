package day5;

import java.util.*;

public class comWord {
    /**
     * 计算n个数字中出现次数大于等于n/2的数字
     * 3 9 3 2 5 6 7 3 2 3 3 3
     * 输出：3
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        //Integer i = Integer.valueOf(s1.toString());
        //int arr=Integer.parseInt(s1.toString());
        int[] array=new int[s1.length];
        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(s1[i]);

        }
        //现在进行遍历整个数组，判断哪个数字出现的次数大于等于n/2
        Map<Integer,Integer> map=new HashMap<>();

        int count=1;
//        for(int i=0;i<array.length;i++){
//            count=++map(array[i]);
//            if(count>array.length/2){
//                System.out.println(count);
//            }
//        }

        //int a=array[0];
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array.length;j++){
//                if(array[i]==array[i]){
//                    count++;
//                }else {
//                    count=0;
//                    break;
//                }
//            }
//            map.put(array[i],count-1);
//
//        }
//        System.out.println(map);













//        int a=array[0];
//        int count=0;
//        for(int j=1;j<array.length;j++){
//            if(a==array[j]){
//                count++;
//            }else if(count>0){
//                count--;
//            }else{
//                a=array[j];
//            }
//        }
//        System.out.println(a);




    }


    static StringBuffer operate(StringBuffer x, StringBuffer y)
    {
        x.append(y);//x=AB
        y=x;//y=AB
        return y;
    }
    public static void main3(String[] args) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        System.out.println(operate(a, b));//返回的是y的值，必须要有接受的地方，才能进行显示
        System.out.println(a+"."+b);
    }


    public static void main2(String[] args) {
        int x,y;
        x=5>>2;
        System.out.println(x);
        y=x>>>2;
        System.out.println(y);
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String ss="";

        Set<Character> set=new TreeSet<>();
        for(char ch:s2.toCharArray()){
            set.add(ch);
        }

        //遍历s2中的所有字符，寻找s1是否在s2中包含
        for(int i=0;i<s2.length();i++){
            if(!set.contains(s1.charAt(i))){
                ss+=s1.charAt(i);//将s1中不包含s2的部分拿出来
            }
        }
        System.out.println(ss);
//They are students.
//
//
// aeiou
    }
}
