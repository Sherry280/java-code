package LeetCode1;

import java.util.Scanner;

public class SimpleCode {
    public static void main(String[] args) {
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
