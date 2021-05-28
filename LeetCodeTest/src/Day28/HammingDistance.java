package Day28;

public class HammingDistance {
    /**
     * 求出汉明距离的总和
     */
    public static long totalHammingDistance(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               sum+=hammingDistance(nums[i],nums[j]);
           }
        }
        return sum;

    }
    public static long hammingDistance(int x,int y){
        long a=x^y;
        long count=0;
        while(a!=0){
            a=a&(a-1);
            count++;

        }
        return count;
    }
    //方法2：
    public static int totalHammingDistance2(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=0;i<30;i++){
            int c=0;
            for(int val:nums){
                c+=(val>>i)&1;
            }
            count+=c*(n-c);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={4,14,2};
        System.out.println(totalHammingDistance2(nums));
    }



}
