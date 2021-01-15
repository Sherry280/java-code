package day15;

import java.util.Scanner;

public class TestDemo1 {
    
    /**
     * 两个数相加，不使用其他运算符
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=a^b;
        int n=(a&b)<<1;
        int sum=m+n;
        System.out.println(sum);

    }
}
