package Test0807;

import java.util.Arrays;

public class Solution {
    /**
     * 返回一个数组中等差数列的个数
     * 思路：只要前三个数字构成等差数列，那么再加一个数字是否构成等差数列，只需要判断后三个即可
     * 只有两种情况：增加一个数字长度+1或者缩进
     */
    public static int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int n=nums.length;
       int ans=0;
       for(int i=0;i<=n-3;i++){
           for(int j=i+2;j<n;j++){
               if((nums[j]-nums[j-1])==(nums[j-1]-nums[j-2])){
                   ans++;
               }else{
                   break;
               }
           }
       }
       return ans;


    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(numberOfArithmeticSlices(array));

    }
}
