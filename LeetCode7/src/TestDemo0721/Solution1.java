package TestDemo0721;

import java.util.Arrays;

public class Solution1 {
    /**
     * 绝对差值和：|nums1[i]-nums2[i]|-|nums1[j]-nums[i]|的差值最大化，这样才能找到
     * 要将nums1中要替换的某个特定的值，然后才能保证nums1和nums2相对应的差值和最小
     */
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        final int MOD=1000000007;
        int n=nums1.length;
        //int[] rec = Arrays.copyOf(nums1, n);
        int[] rec=new int[n];
        System.arraycopy(nums1,0,rec,0,n);
        Arrays.sort(rec);
        int sum=0,maxn=0;
        for(int i=0;i<n;i++){
            int diff=Math.abs(nums1[i]-nums2[i]);
            sum=(sum+diff)%MOD;
            int j=binarySearch(rec,nums2[i]);
            if(j<n){
                maxn=Math.max(maxn,diff-(rec[i]-nums2[i]));
            }
            if(j>0){
                maxn=Math.max(maxn,diff-(nums2[i]-rec[j-1]));
            }

        }
        return (sum-maxn+MOD)%MOD;
    }
    private int binarySearch(int[] rec,int target){
        int low=0;
        int high=rec.length-1;
        if(rec[high]<target){
            return high+1;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(rec[mid]<target){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }


    public static void main(String[] args) {
        int[] nums1={1,7,5};
        int[] nums2={2,3,5};
        Solution1 s=new Solution1();
        System.out.println(s.minAbsoluteSumDiff(nums1, nums2));

    }
}
