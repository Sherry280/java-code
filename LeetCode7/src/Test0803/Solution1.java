package Test0803;

import java.util.Arrays;

public class Solution1 {
    /**
     *最短无序连续的数组：
     * {2，6，4，8，10，9，15}输出{6，4，8，10，9，15}，因为对后面的一个数组进行排序后
     * 整个数组都变为有序。
     * 思路：
     */
    public static int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int[] ret=new int[n];
        System.arraycopy(nums,0,ret,0,n);
        Arrays.sort(ret);
        int left=0;
        int right=n-1;
        while(left<n-1){
            if(nums[left]!=ret[left]){
                break;

            }
            left++;
        }
        while(0<right){
            if(nums[right]!=ret[right]){
                break;
            }
            right--;
        }
        return (right-left)<=0?0:right-left+1;
//        while(left<right){
//            while(nums[left]==ret[left]){
//                left=left+1;
//                n--;
//            }
//            while(nums[right]==ret[right]){
//                right=right-1;
//                n--;
//            }
//        }
//        return n;

//        int i=0;
//        for(;i<n;i++){
//            if(nums[i]!=ret[i]&&nums[n-1]!=){
//                break;
//            }
//
//        }
//        if(i==n){
//            return 0;
//        }else{
//            return n-i;
//        }


    }

    public static void main(String[] args) {
        int[] array={2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(array));
    }


}
