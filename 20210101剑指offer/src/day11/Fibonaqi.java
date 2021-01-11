package day11;

import java.util.Scanner;

public class Fibonaqi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
       if(sc.hasNext()){
           n=sc.nextInt();
        }

        int a=0,b=1,c=1;

        //终止条件就是：出现一个斐波那契数字不再小于n
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        int dis=n-b;
        int dit=c-n;
        System.out.println(Math.min(dis, dit));


    }
}
