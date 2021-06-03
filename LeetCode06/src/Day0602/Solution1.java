package Day0602;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，编写一个函数来判断该数组是否含有同时满足下述条件的连续子数组：
     * 子数组大小 至少为 2 ，且子数组元素总和为 k 的倍数。
     * 如果存在，返回 true ；否则，返回 false 。
     * 如果存在一个整数 n ，令整数 x 符合 x = n * k ，则称 x 是 k 的一个倍数。
     *
     * 哈希表+前缀和：
     */

    public static boolean checkSubarraySum2(int[] nums,int k){
        //数组的长度
        int m = nums.length;
        //数组的长度最小为2
        if (m < 2) {
            return false;
        }
        //存储的是每个余数第一次出现的下标，map来维护数组中各个数字的下标
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        //记录的是数组的前缀和
        int remainder = 0;
        //2  3  4  6  8    k=2
        for (int i = 0; i < m; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;

    }
    public static  boolean checkSubarraySum(int[] nums, int k) {
        int m = nums.length;
        if (m < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < m; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                int prevIndex = map.get(remainder);
                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6};
        int k=4;
        System.out.println(checkSubarraySum(nums, k));

    }
}
