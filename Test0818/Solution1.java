package Test0813.Test0818;

import java.util.Arrays;

public class Solution1 {
    /**
     *
     */
    



    /**
     *数组中最长连续子序列
     * 连续的子序列可以不用相邻
     */
    public int MLS(int[] arr) {
        Arrays.sort(arr);
        int largest=0;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]-arr[i-1]==1){
                count++;
            }else{
                count=1;
            }
            largest=Math.max(largest,count);
        }
        return largest;

    }
}
