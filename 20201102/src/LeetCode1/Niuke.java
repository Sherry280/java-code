package LeetCode1;

import java.util.Arrays;
import java.util.Scanner;

public class Niuke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split(" ");
        int[] array=new int[s.length];
        int sum=0;
        for(int i=0;i<s.length;i++){
            array[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(array);

        //现在进行吧中间的数字相加
        for(int i=1;i<array.length-1;i++){
            sum+=array[i];
        }
        double aver=(double)(sum/(array.length-2));
        System.out.printf("%.2f",aver);









    }
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();//3
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int m=1;m<i;m++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

        public static void main2(String[] args) {
            Scanner sc = new Scanner(System.in);
            int length;
            while(sc.hasNext()){
                length = sc.nextInt();
                for(int i = 1; i <= length; i++){
                    for(int j = 0; j < length - i; j++){
                        System.out.print("  ");
                    }
                    for(int t = 0; t < i; t++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
            }

        }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                //打印空格
                for (int j = 0; j <n-i; j++) {
                    System.out.print("  ");
                }
                //打印*
                for (int m = 0; m <i; m++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }

        }


//    public static void main1(String[] args) {
//        //学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
//        Scanner sc=new Scanner(System.in);
//        String score=sc.nextLine();
//
//        String[] s=score.split(";");
//    }
    }
}
