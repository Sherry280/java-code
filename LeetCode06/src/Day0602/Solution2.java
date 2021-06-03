package Day0602;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    /**
     *哈希表+前缀
     * 给定一个二进制数组 nums，找到含有相同数量的0和1的最长连续子数组，并返回该子数组的长度。
     */
    public static int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int maxLength=0;
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        map.put(count,-1);
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(num==1){
                count++;
            }else{
                count--;
            }
            if(map.containsKey(count)){
                int prevIndex=map.get(count);
                maxLength=Math.max(maxLength,i-prevIndex);
            }else{
                map.put(count,i);
            }
        }
        return maxLength;


    }

    public static void main(String[] args) {
        int[] nums={0,1,0,1,0,0,0,0,1};
        System.out.println(findMaxLength(nums));

    }



}
