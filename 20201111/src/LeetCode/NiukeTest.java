package LeetCode;

import java.util.*;

public class NiukeTest {
    //求数n最少走多少步才能变成斐波那契数列

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=buchang(n);
        System.out.println(m);

    }

    public static int buchang(int n){
        List<Integer> list=new ArrayList<Integer>();
        int count=0;
        int[] array=new int[n];
        for(int i=2;i<array.length;i++){
            array[0]=0;
            array[1]=1;
            array[i]=array[i-1]+array[i-2];
            //输入的数字为n，假如n=10，那么对于10以内的每一个斐波那契数字，
            int m=Math.abs(array[i]-n);//每一个斐波那契数字距离n的距离，把这个距离添加到list中
            list.add(m);
        }
         count=Collections.min(list);
        return count;
    }











    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        //String s = sc.nextLine();
        while(sc.hasNext()) {
            set.add(sc.next());
        }
            //String s = sc.nextLine();//输入一行字符串  要是有多行字符怎么办？
            //String[] words = s.split(" ");//用空格将其划分开

            //每一个都是字符串，要对其进行去重操作
            //Set<String> set = new TreeSet<>();
            //Collections.addAll(set, s);
            //把所有的原料字符都放入集合当中，遍历集合中的数据，看有多少个
//            int sum = set.size();
//            System.out.println(sum);

        int sum = set.size();
        System.out.println(sum);

    }




}
