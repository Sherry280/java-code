package LeetCode1;

import java.util.Scanner;

public class TestDemo1 {
    //打印一个菱形金字塔
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int m=1;m<=i+1;m++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            //打印下边的菱形
            for(int s=0;s<n;s++){
                for(int k=1;k<=n;k++){
                    System.out.print(" ");
                }
                for(int x=0;x<n-s;x++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }




    //打印一个反转的金字塔
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                //先打印空格
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                //打印*
                for(int m=0;m<n-i;m++){
                    System.out.print("* ");
                }
                System.out.println();
            }



        }

    }




    //打印一个正立的金字塔三角形
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            //n=5;
            for(int i=1;i<=n;i++){
                //打印空格
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");

                }
                //System.out.println();
                //打印*
                for(int m=1;m<=i;m++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
