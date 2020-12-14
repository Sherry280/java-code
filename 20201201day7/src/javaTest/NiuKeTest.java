package javaTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class NiuKeTest {
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
        int[][] array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||j==0){
                    array[i][j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    /**
     * 矩阵进行转换，行行交换或者列列进行交换
     * 创建一个类，将三个属性进行包装起来，然后再进行调用
     * @param args
     */
    public static void main5(String[] args) {
         class ope{
            String t;
            int a;
            int b;
            public ope(String t,int a,int b){
                this.t=t;
                this.a=a;
                this.b=b;
            }
        }
       Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int m=sc.nextInt();
        int[][] array=new int[n][m];
        int k;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();
            }
        }
        k=sc.nextInt();//进行要转换的次数
        LinkedList<ope> opes=new LinkedList<>();
        for (int i = 0; i < k; i++) {
            //最后一行传进来的数据
            opes.add(new ope(sc.next(),sc.nextInt(),sc.nextInt()));
        }

        for(ope ope:opes) {
            if (ope.t.equals("r")) {//进行行交换
                int tmp = 0;
                for (int i = 0; i < m; i++) {
                    tmp = array[ope.a - 1][i];
                    array[ope.a - 1][i] = array[ope.b - 1][i];
                    array[ope.b - 1][i] = tmp;
                }
            }
            if (ope.t.equals("c")) {//代表列列进行交换
                int tmp = 0;
                for (int i = 0; i < n; i++) {
                    tmp = array[i][ope.a - 1];
                    array[i][ope.a - 1] = array[i][ope.b - 1];
                    array[i][ope.b - 1] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }




        

    public static void main3(String[] args) {
        QuickSort q=new QuickSort();
        long[] array={9,6,56,45,34,7,6,77};
        q.quickSort(array);

    }
    public static void main4(String[] args) {
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
