package LeetCode;

import java.util.Scanner;

public class CodeFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        String p=((c>=65&&c<=90)||(c>=97&&c<=122))?"Yes":"No";
        System.out.println(p);
    }


    public static void main1(String[] args) {
        //多组输入，每组输入仅一行，包括n，h和m（均为整数）。输入数据保证m <= n * h。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//总共牛奶的总总数
        int h=sc.nextInt();//分钟
        int m=sc.nextInt();//剩余的牛奶数量
        int f=m%h==0?m/h:m/h+1;
        System.out.println(n-f);

    }




}
