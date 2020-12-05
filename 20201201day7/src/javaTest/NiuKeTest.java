package javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class NiuKeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] array=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int a=0,b=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    a=i;
                    b=j;

                }
            }
        }
        System.out.print(a+" "+b);


    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] array=new int[n*m];
        for(int i=0;i<n*m;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n*m;i++){
            System.out.print(array[i]+" ");
            if((i+1)%m==0){
                System.out.println();
            }
        }

        //把所有数字放进数组中
//        int nn=array.length/n;
//        for(int i=0;i<nn;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(array[j]+" ");
//            }
//            System.out.println();
//        }
    }
}
