package day12;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        long a=Long.parseLong(s1);
        long a2=Long.parseLong(s2);
        long c=a+a2;




    }

    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a='a';

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    if(i%2==0||i==n-1){
                        System.out.print(a);
                    }

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }


}
