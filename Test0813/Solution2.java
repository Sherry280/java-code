package Test0813;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    /**
     * 给定一个整数数组和一个整数k，你需要找到该数组中和为k的连续的子数组的个数。
     * 暴力求解：直接列举o(n^3)
     */
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                int sum=0;
                for(int m=j;m<=i;m++){
                    sum+=nums[m];
                }
                if(sum==k){
                    count++;
                }
            }

        }
        return count;

    }
    public static int subarraySum2(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j>=0;j--){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 使用前缀和计算
     */
    public static int subarraySum3(int[] nums, int k) {
        int[] pre=new int[nums.length+1];
        //存储前缀和
        for(int i=0;i<nums.length;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length;i++){
            int other=pre[i]-k;
            if(map.containsKey(other)){
                count+=map.get(other);
            }
            map.put(pre[i],map.getOrDefault(pre[i],0)+1);
        }
        return count;


    }

    /**
     *最大升序子数组的和
     * 思路：1.定义一个变量sum为最大的升序子数组的和；2.递增的时候，sum累加
     * 3.当递减的时候，就将当前元素的值赋给sum；4.max保存当前最大的连续子数组的和
     */
    public static int maxAscendingSum(int[] nums){
        int sum=nums[0];
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,3,4,8,54,32,78,79};
        System.out.println(subarraySum2(nums, 8));
//        System.out.println(maxAscendingSum(nums));
    }



}
