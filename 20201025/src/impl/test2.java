package impl;

import java.util.Scanner;

public class test2 {


    
    //给定一个浮点数，要求得到该浮点数的个位数。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();//输入一个浮点类型的数字
        String x=String.valueOf(a);//把a以字符串的形式进行输出
        String[] sp=x.split("\\.");//以标点符号进行划分的时候，为什么要加转义字符
        System.out.println(sp[0].charAt(sp[0].length()-1));

    }








    //1. 问题：KiKi今年5岁了，已经能够认识100以内的非负整数，并且并且能够进行 100 以内的非负整数的加法计算。
    // 不过，BoBo老师发现KiKi在进行大于等于100的正整数的计算时，规则如下：
    //1.只保留该数的最后两位，例如：对KiKi来说1234等价于34；
    //2.如果计算结果大于等于 100， 那么KIKI也仅保留计算结果的最后两位，如果此两位中十位为0，则只保留个位。
    //例如：45+80 = 25;
    //要求给定非负整数 a和 b，模拟KiKi的运算规则计算出 a+b 的值。
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=100){
            a%=100;
        }
        if(b>=100){
            b%=100;
        }
        int c=a+b;
        if(c>=100){
            c%=100;
        }
        System.out.println(c);
    }






}
