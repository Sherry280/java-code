package day13;

import java.util.Scanner;

public class TestDemo12 {
    /**
     * 输出一个打印的正方形
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.next();
        //打印出正方形的第一行
        for(int i=0;i<n;i++){
            System.out.print(a);
        }
        System.out.println();
        //打印出来正方形的中间行
        for(int i=1;i<=Math.ceil(n/2)-2;i++){
            System.out.print(a);
            for(int j=2;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.println(a);
        }
        //System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(a);
        }

    }
}
