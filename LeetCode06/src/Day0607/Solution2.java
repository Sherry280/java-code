package Day0607;

public class Solution2 {
    /**
     * 子数组的最大累加和
     * 动态规划：
     */

    public static int maxsumofSubarray (int[] arr) {
        int[] maxSum=new int[arr.length];
        maxSum[0]=arr[0];
        int ret=0;
        for(int i=1;i<arr.length;i++){
            maxSum[i]=Math.max(maxSum[i-1]+arr[i],arr[i]);
            ret=Math.max(ret,maxSum[i]);
        }
        return ret;


    }
    public static void main(String[] args) {
        int[] arr={1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray(arr));

    }
}
