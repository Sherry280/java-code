package Day29;

import java.util.HashSet;

public class Remove {
    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     */
    public static  int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set.size();


    }


    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,5,5};
        System.out.println(removeDuplicates(arr));


    }
}
