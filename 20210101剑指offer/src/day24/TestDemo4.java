package day24;

import java.util.Arrays;

public class TestDemo4 {
    /**
     * 微信红包：找到数组里面得某个值超过数组长度一半
     */

    //方法1：
    public static int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int a=gifts[n/2];
        int num=0;
        for(int i=0;i<n;i++){
            if(gifts[i]==a){
                num++;
            }
        }
        return num<=n/2?0:a;
    }
    //方法2：
    public static int getValue2(int[] gifts,int n){
        if(gifts.length<n){
            return 0;
        }
        if(gifts.length==0){
            return 0;
        }
        int count=0;
        int tmp=0;
        for(int i=0;i<n;i++){
            if(count==0){
                tmp=gifts[i];
                count=1;
            }else{
                if(tmp==gifts[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }
        int size=0;
        for(int i=0;i<n;i++){
            if(tmp==gifts[i]){
                size++;
            }
        }
        return (size>n/2)?tmp:0;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,3};
        int n=5;
        System.out.println(getValue2(a, n));


    }
}
