package Test09.Test0910;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1 {


    /**
     * 数组中最长连续子序列
     * [1,2,3,4,100,200]
     */
    public int MaxLength(int[] arr){
        //不进行排序，使用set进行存储
        if(arr.length==0||arr==null){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int e:arr){
            set.add(e);
        }
        int longest=0;
        //找到set中元素的最小的一个
        for(int a:arr){
            if(set.contains(a-1)){
                continue;
            }
            int currNum=a;
            int count=0;
            while(set.contains(a+1)){
                currNum++;
                count++;
            }
            longest=Math.max(longest,count);


        }
        return longest;
    }
    public int MLS(int[] arr) {
        if(arr.length==0||arr==null){
            return 0;
        }
        Arrays.sort(arr);
        int count=arr[0];
        int longest=1;

        for(int i=1;i<arr.length;i++){
            //遇到重复的元素,直接跳过
            if(arr[i]==arr[i-1]){
                continue;
            }
           if(arr[i]-arr[i-1]==1){
               count++;
           }else{
               //遇到数字和当前值相等，或者遇到的数字比当前的数字小
               count=1;
           }
           longest=Math.max(longest,count);

        }
        return longest;
    }

    /**
     *[10,20,30,40,5,60]
     * 最大升序子数组的和
     */
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];

            }else{
                sum=nums[i];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
