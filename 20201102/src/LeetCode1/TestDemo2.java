package LeetCode1;

import java.util.Scanner;

public class TestDemo2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=2*i;j>0;j--){
                System.out.print(" ");
            }
            for(int m=0;m<=n-i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<2*i;j++){
                System.out.print(" ");
            }
            for(int m=n;m>0;m--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
