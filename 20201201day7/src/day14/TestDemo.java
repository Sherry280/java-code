package day14;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int s=(n-1)*n+1;//5*6+1=31
        String ss="";
        //怎样实现字符串的拼接的？
        for(int i=0;i<n;i++){
            if(i==0) {
                System.out.print(s+"+");
            }
            int a=s+2;
                System.out.print(a+"+");

            if(i==n-1){
                System.out.print(a+2);
            }


        }





    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] array=new int[10];
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }

        String s="";
        for(int i=1;i<10;i++){
            if(array[i]!=0){
                s+=i;
                array[i]--;
                break;
            }
        }
        System.out.println(s);
        System.out.println(Arrays.toString(array));


        for(int i=0;i<10;i++){
            while(array[i]!=0){
                while (array[i]!=0){
                    s+=i;
                    array[i]--;
                }
            }
        }
        System.out.println(s);
        System.out.println(Arrays.toString(array));

        System.out.println(s);



    }
}
