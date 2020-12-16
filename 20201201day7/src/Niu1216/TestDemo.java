package Niu1216;

import java.util.Scanner;

public class TestDemo {
    /**
     * 打印杨辉三角
     *     1
     *     1    1
     *     1    2    1
     *     1    3    3    1
     *     1    4    6    4    1
     *     1    5   10   10    5    1
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        YangHuiSanjiao(n);

    }

    private static void YangHuiSanjiao(int n) {
        int[][] array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    array[i][0]=1;
                    array[i][j]=1;
                }else{
                    array[i][j]=array[i-1][j-1]+array[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){

                System.out.print(String.format("%5d",array[i][j]));
                if(i==j){
                    System.out.println();
                }
//                if((j+1)%n==0){
//                    System.out.println();
//                }

            }

        }
    }
}
