package Test0803;

import java.util.Arrays;

public class Solution2 {
    /**
     * 构成有效三角形的个数
     *[2,2,3,4]
     * 思路：排序后，从右往前找，先确定一个边不动，然后从区间最小的边计算起，若最小的边都能和从后往前算的后
     * 两个数字组成三角形，则整个区间都能组成三角形
     */
    public static int triangleNumber2(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int left=j+1,right=n-1,k=j;
                while(left<=right){
                    int mid=(left+right)/2;
                    if(nums[mid]<(nums[i]+nums[j])){
                        k=mid;
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
                ans+=k-j;
            }
        }
        return ans;
    }
    //从右边向左边遍历
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int n=nums.length;
        for(int i=n-1;i>=2;i--){
            int k=0;
            int j=i-1;
            while(k<j){
                if(nums[k]+nums[j]>nums[i]){
                    result+=j-k;
                    j--;
                }else{
                    k++;
                }
            }


        }
        return result;



    }
    public static void main(String[] args) {
        int[] array={2,3,2,4};
        System.out.println(triangleNumber2(array));

    }
}
