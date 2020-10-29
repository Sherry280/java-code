package impl;

import java.util.Scanner;

public class niuke {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        float avg=sum/3;
        System.out.printf("%.2f%.2f",sum,avg);



    }


    public static void main3(String[] args){
        Scanner sc=new Scanner(System.in);
        int seconds=sc.nextInt();
        int hour=seconds/3600;
        int m=seconds%3600;
        int minutes=m/60;
        int second=m%60;
        System.out.println(hour+" "+minutes+" "+second);
    }

    public static void main2(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        long sum=(long)(age*(3.156*Math.pow(10,7)));
        //int e=(int)sum;
        System.out.println(sum);

    }

    public static void main1(String[] args) {
        //问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒。
        //31560000
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double d=age*(3.156*Math.pow(10.0,7.0));
        int c= (int) (age*31560000);
        System.out.println(c);
        System.out.println(d);
    }
}
