package Day0706;

public class Solution1 {
    /**
     *主要元素
     * 数组中占比超过一半的元素称之为主要元素。给你一个 整数 数组，找出其中的主要元素。
     * 若没有，返回 -1
     */
    public static int majorityElement(int[] nums) {
        int candidate=-1;
        int count=0;
        for(int num:nums){
            if(count==0){
                candidate=num;
            }
            if(candidate==num){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        int length=nums.length;
        for(int num:nums){
            if(num==candidate){
                count++;
            }
        }
        return count*2>length?candidate:-1;


    }


    public static void main(String[] args) {
        int[] nums={1,3,2,1,1,1,1,8};
        System.out.println(majorityElement(nums));

    }
}
