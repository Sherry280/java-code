package Day0605;

import java.util.Arrays;

public class Solution3 {
    /**
     * 将一个含有2n个元素的数组进行拆分成n对，然后计算出min（a，b）的最大的和
     *
     */
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int i=0;
       while(i<nums.length){
           sum+=nums[i];
           i+=2;
       }
       return sum;

    }

    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        System.out.println(arrayPairSum(nums));

    }



}
