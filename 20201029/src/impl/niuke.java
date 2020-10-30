package impl;

import java.util.Scanner;

public class niuke {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            String ss = sc.next();
            System.out.println(s.toLowerCase());
            System.out.println(ss.toLowerCase());
        }




//        double r=sc.nextDouble();
//        final  double a=3.1415926;
//        double v=(4*a*Math.pow(r,3))/3;
//        System.out.println(String.format("%.3f",v));


    }

        //根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
    public static void main7(String[] args) {
        // System.out.println("circumference=+"+String.format("%.2f",len)+
        // " area="+String.format("%.2f",area));
        //    }
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double l=a+b+c;
        double p=(double)(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("circumference="+String.format("%.2f",l)+" area="+String.format("%.2f",s));
    }

    public static void main6(String[] args) {
        // 问题：计算BMI指数（身体质量指数）。是用体重公斤数除以身高米数平方得出的数字
        //一行，两个整数，分别表示体重（公斤），身高（厘米），中间用一个空格分隔。
//        Scanner scan =new Scanner(System.in);
//        double weight =scan.nextInt();
//        double height =scan.nextInt();
//        double BIM = weight/Math.pow(height/100,2);
//        System.out.printf("%.2f ",BIM);

        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
        double tall=sc.nextDouble();
        double t=tall/100;

        //double bim=weight/tall*Math.pow(10,2);
        double bim=weight/(t*t);
        System.out.println(String.format("%.2f",bim));



//        int tall=sc.nextInt();
//        int weight=sc.nextInt();
//         float aver=(float)weight/(tall*tall);
//        System.out.println(String.format("%.2f",aver));







    }


    //依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            float a=sc.nextFloat();
            float b=sc.nextFloat();
            float c=sc.nextFloat();

            float sum=a+b+c;
            float avg=sum/3;
            System.out.printf("%.2f",sum);
            System.out.printf(" ");
            System.out.printf("%.2f",avg);


            //System.out.println(sum+" "+avg);


        }



    }



    public static void main4(String[] args){
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
