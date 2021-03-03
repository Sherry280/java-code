package Day_Th_2;

public class RemoveAllValue {
    /**
     * 原地移除所有值等于val
     */
    public static  int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4,3,3,8};
        int k=3;
        System.out.println(removeElement(nums, k));

    }
}
