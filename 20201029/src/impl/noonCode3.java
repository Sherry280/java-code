package impl;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class noonCode3 {
    //给定一个整数数组 nums 和一个目标值 target，
    // 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new TreeMap<>();
        //进行遍历，将数组nums中的值全部放进map中
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int x=target-n;
            if(map.containsKey(x)){
                int key=map.get(x);
                return new int[]{key,i};
            }
            map.put(n,i);
        }
        return new int[]{0,0};


    }

    public static void main(String[] args) {
        int[] nums={1,4,5,7,8,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }




}
