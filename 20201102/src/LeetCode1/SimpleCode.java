package LeetCode1;

import java.util.Scanner;

public class SimpleCode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()){
            //输入进行计算的表达式
            String s=sc.nextLine();
            //将表达式按照运算符进行分割
            String[] str=s.split("[+\\-*/]");

            //分割后的情况进行判断
            if(str.length<2){
                System.out.println("“Invalid operation!");
            }else{
                //进行表达式的计算
                double a=Double.parseDouble(str[0]);
                double b=Double.parseDouble(str[1]);
                String  opt=s.substring(str[0].length(),str[0].length()+1);

                switch(opt){
                    case "+":
                        System.out.printf("%.4f+%.4f=%.4f\n",a,b,a+b);
                        break;
                    case "-":
                        System.out.printf("%.4f-%.4f=%.4f\n",a,b,a-b);
                        break;
                    case "*":
                        System.out.printf("%.4f*%.4f=%.4f\n",a,b,a*b);
                        break;
                    default:
                        if(b==0){
                            System.out.println("Wrong!Division by zero!");
                        }else {
                            System.out.printf("%.4f/%.4f=%.4f\n", a, b, a / b);
                            break;
                        }
                }

            }

        }
    }




    public static void main1(String[] args) {


        //KiKi想获得某年某月有多少天，请帮他编程实现。输入年份和月份，计算这一年这个月有多少天。
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextDouble()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = b * b - 4 * a * c;
            double e = Math.sqrt(d);
            double x1, x2;
            double s, x;
            s = -b / (2 * a);
            x = Math.sqrt(-d) / (2 * a);
            if (a == 0) {
                System.out.println("Not quadratic equation");
            } else {
                if (d == 0) {
                    x1 = -b / (2 * a);
                    System.out.printf("x1=x2=%.2f\n", x1);
                } else if (d > 0) {
                    x1 = (b - e) / (-2 * a);
                    x2 = (b + e) / (-2 * a);
                    System.out.printf("x1=%.2f", x1);
                    System.out.print(";");
                    System.out.printf("x2=%.2f", x2);
                    System.out.print("\n");
                } else {
                    System.out.printf("x1=%.2f", s);
                    System.out.print("-");
                    System.out.printf("%.2f", x);
                    System.out.printf("i;x2=%.2f", s);
                    System.out.print("+");
                    System.out.printf("%.2f", x);
                    System.out.print("i");
                    System.out.print("\n");
                }
            }

        }
    }








}
