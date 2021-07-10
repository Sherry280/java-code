package Day0706;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    /**
     * 和相同的二元字数组
     * 利用哈希表存储前缀和
     */
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        Map<Integer,Integer> cnt=new HashMap<>();
        int ret=0;
        for(int num:nums){
            cnt.put(sum,cnt.getOrDefault(sum,0)+1);
            sum+=num;
            ret+=cnt.getOrDefault(sum-goal,0);
        }
        return ret;

    }

    public static void main(String[] args) {
        int[] nums={2,5,8,4,3,2};
        int goal=2;
        System.out.println(numSubarraysWithSum(nums, goal));

    }
}
