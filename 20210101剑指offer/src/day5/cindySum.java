package day5;

import java.util.Scanner;

public class cindySum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            int n4=sc.nextInt();

            int a=(n1+n3)/2;
            float b=(n2+n4)/2f;
            float c=(n4-n2)/2f;

            if((a-(n1+n3)/2)!=0){
                System.out.print("No");
                return;
            }
            if((b-(n2+n4)/2)!=0||(b-(n3-n1)/1)!=0){
                System.out.print("No");
                return;
            }
            if((c-(n4-n2)/2)!=0){
                System.out.print("No");
                return;
            }
            System.out.println((int)a+" "+(int)b+" "+(int)c);


        }

    }
}
