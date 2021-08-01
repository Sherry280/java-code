package Test0726;

import java.util.Arrays;
import java.util.Stack;

public class Solution3 {
    /**
     * 滑动窗口中选出最大的值，窗口向下移动
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        //窗子的大小为k，那么输出的数字总共有nums.length-k+1个
        int n=nums.length-k+1;
        int[] ret=new int[n];
        //使用两个栈存放
        Stack<Integer> stackJin=new Stack<>();
        Stack<Integer> stackChu=new Stack<>();

        for(int a:nums){
            stackJin.push(a);
        }
        int i=n;
        int max=0;
        int a=stackJin.pop();
        int b=stackJin.pop();
        int c=stackJin.pop();
        while(i>0&&!stackJin.empty()){
            max=Max(a,b,c);
            stackChu.push(max);
            a=b;
            b=c;
            c=stackJin.pop();
            i--;

        }
        for(int j=0;j<n;j++){
            ret[j]=stackChu.pop();
        }
        return ret;


    }

    public static void main(String[] args) {
        int[] ret={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(ret, k)));

    }
    public static int Max(int a,int b,int c){
        int max=a;
        int ret=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(max>c){
            ret=max;
        }else{
            ret=c;
        }
        return ret;
    }
}
