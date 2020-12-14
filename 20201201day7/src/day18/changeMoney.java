package day18;

import java.util.Scanner;

public class changeMoney {
    /**
     * 找出字符串中G和c出现比例最高的字串
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] ss=s.split(" ");
        int[] array=new int[ss.length];
        for(int i=0;i<ss.length-1;i++) {
            int parseInt = Integer.parseInt(ss[i]);
            array[i]=parseInt;
        }

        int max=0;
        int m=0;
        int num=sc.nextInt();
        for(int i=0;i<array.length-num+1;i++){
            int count=0;
            for(int j=i;j<i+num;j++){
                if(array[j]=='C'||array[j]=='G'){
                    count++;
                }

            }
            if(count>max){
                max=count;
                m=i;
            }

        }
        for(int i=0;i<num;i++){
            System.out.print(array[m+i]);
        }




    }

    /**
     * 交钱计划，30天
     * @param args
     */
    public static void main1(String[] args) {
        int f=10;
        System.out.print(f*30);
        int q=2;
        int sum= (int) Math.pow(2,30);
        System.out.println(sum);
    }
}
