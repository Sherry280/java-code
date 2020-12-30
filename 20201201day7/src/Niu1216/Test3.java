package Niu1216;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }


    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long n=sc.nextLong();
            long m=sc.nextLong();
           long c=n*m;
            //最大公约数  辗转相除法
            while(n*m!=0){
                if(n>m){
                    n%=m;
                }else if(n<m){
                    m%=n;
                }else{
                    break;
                }
            }
            long sum=(n==0?m:n);

            long s=sum+c/sum;
            System.out.println(s);
        }
    }
}
