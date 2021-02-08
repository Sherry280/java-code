package FebDay8;

import java.util.Scanner;

public class TestDemo1 {
    //[1,2,3,2,2,2,5,4,2]
    public int MoreThanHalfNum_Solution(int [] array) {
        //遍历这个数组
        int candidate=array[0];
        int time=1;
        for(int i=0;i<array.length;i++){
            if(time==0){
                candidate=array[i];
                time=1;
            }else{
                if(candidate==array[i]){
                    time++;
                }else{
                    time--;
                }
            }
        }
        return candidate;


    }

    /**
     * 数值的k次方
     */
    public static  double Power(double base, int exponent) {
        if(exponent<0){
            base=1/base;
            exponent=-exponent;
        }
        double ret=1.0;
        while(exponent!=0){
            ret*=base;
            exponent--;
        }
        return ret;

    }
    public static void main(String[] args) {
        double base=2.0;
        int x=3;
        System.out.println(Power(base, x));


    }
    /**
     * 剑指offer day1：一个32位的字符串中有多少个1
     * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示
     */
    public static int NumberOf1(int n){
        String s=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            //怎样变成二进制的形成
            String s="";

            while(n!=0){

                s+=(n%2);
                n=n/2;

            }
            //计算s中有多少个1
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}
