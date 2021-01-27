package day26;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class TestNiuKe {
    /**
     * 统计票数
     *输入候选人的人数n，
     * 第二行输入n个候选人的名字（均为大写字母的字符串），
     * 第三行输入投票人的人数，
     * 第四行输入投票。
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
            sc.nextLine();//这一行的代码作用是：接受\n，否则下一句代码nextLine的作用就是接受这个\n
            String s=sc.nextLine();
            String[] array=s.split(" ");
            for(int i=0;i<array.length;i++){
                map.put(array[i],0);
            }
            map.put("Invalid",0);
            int m=sc.nextInt();
            sc.nextLine();
            String ss=sc.nextLine();
            String[] array1=ss.split(" ");
            for(String a:array1){
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String> set=map.keySet();
            for(String b:set){
                System.out.println(b+":"+map.get(b));
            }


        }

    }
    /**
     * 给定一个正整数n，将其转换成十进制的数字
     * 然后计算各个位置的数字之和，并计算各个位置的数字的平方和
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int sum1=0;
            int sum2=0;
            int m=n*n;
            while(n!=0){
                sum1+=(n%10);
                n/=10;
            }
            while(m!=0){
                sum2+=(m%10);
                m/=10;
            }
            System.out.println(sum1+" "+sum2);
        }



    }
}
