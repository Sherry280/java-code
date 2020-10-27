package impl;

import java.util.Scanner;

public class tower {
    //问题：KiKi今年5岁了，已经能够认识100以内的非负整数，并且并且能够进行 100 以内的非负整数的加法计算。
    // 不过，BoBo老师发现KiKi在进行大于等于100的正整数的计算时，规则如下：
    //1.       只保留该数的最后两位，例如：对KiKi来说1234等价于34;
    //2.       如果计算结果大于等于 100， 那么KIKI也仅保留计算结果的最后两位，如果此两位中十位为0，则只保留个位。
    //例如：45+80 = 25
    //要求给定非负整数 a和 b，模拟KiKi的运算规则计算出 a+b 的值。
    




    //将一个四位数，反向输出。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            if(n<=9){
                System.out.print(n);
                break;
            }
            System.out.print(n%10);
            n/=10;
        }
    }




    //给定两个整数a和b (－10,000 < a,b < 10,000)，计算a除以b的整数商和余数。
    public static void main7(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a/b+" "+a%b);

    }





    //请计算表达式“(-8+22)×a-10+c÷2”，其中，a = 40，c = 212。
    public static void main6(String[] args) {
        int a=40;
        int c=212;
        System.out.println((-8+22)*a-10+c/2);
    }




    //BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。
    // BoBo出了一个问题给KiKi，输入一个字符，输出该字符相应的ASCII码。

    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        char b=a.charAt(0);//得到输入的第一个字符，让将字符转换成整数

        System.out.println((int)b);
    }





    //输入两个整数，范围-231~231-1，交换两个数并输出。
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(",");

        String x=s[0].substring(2);
        String y=s[1].substring(2);
        System.out.println("a="+y+",b="+x);



    }



    //输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String year=s.substring(0,4);
        String month=s.substring(4,6);
        String date=s.substring(6,8);
        System.out.println("year="+year);
        System.out.println("month="+month);
        System.out.println("date="+date);


    }

    //BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。BoBo出了一个问题给KiKi，
    // 转换以下ASCII码为对应字符并输出他们。
    // 73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116 , 33

    public static void main2(String[] args) {
        int[] array={73,32,99,97,110,32,100,111,32,105,116,33};
       for(int i=0;i<array.length-1;i++){
           System.out.print((char)array[i]);
       }
    }





        public static void 数字转字符(int n){
            //65-90 ABCD
            //97-122  abcd
            if(n>=65&&n<=90){

            }
            if(n>=97&&n<=122){

            }

        }











    //打印出一个三角形的金字塔
    public static void tower(String s,int n){
            for(int i=1;i<=n;i++){

                for(int k=n-i;k>0;k--){
                    System.out.print(" ");
                }
                for(int j=0;j<i;j++){
                    System.out.print(s+" ");
                }
                System.out.println();
            }
        }

    public static void main1(String[] args) {
        tower("1",5);
    }





}
