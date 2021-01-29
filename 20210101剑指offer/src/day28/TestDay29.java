package day28;

import java.util.Scanner;
import java.util.concurrent.Phaser;

public class TestDay29 {
    /**
     * 数字和为sum的方法数
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            


        }
    }
    /**
     * 年会抽奖
     */
    public static int JieCheng(int n){
        if(n==1){
            return 1;
        }
        return n*(n-1);
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int i = JieCheng(n);


            double d=1.0/i;
            //System.out.printf(".2f",d);
            //System.out.println("%");
            System.out.println(String.format(".2f",d*100)+"%");
        }
    }
}
