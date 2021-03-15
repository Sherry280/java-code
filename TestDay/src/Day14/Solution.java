package Day14;

import java.util.Scanner;

public class Solution {
    /**
     * 1-N中的1的个数
     */
    public static int NumberOf1Between1AndN_Solution(int n) {
        int num=0;
        while(n!=0){
            num+=(n%10==1)?1:0;
            n/=10;
        }
        return num;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            count+=NumberOf1Between1AndN_Solution(i);
        }
        System.out.println(count);

    }







    /**
     * 连续子数组的最大和
     *入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     */
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        } else {
            int total = array[0];
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (total >= 0) {
                    total += array[i];
                } else {
                    total = array[i];
                }

                if (total > max) {
                    max = total;
                }
            }
            return max;

        }
    }
    public static void main1(String[] args) {
        int[] array={-1,-3,8,-7,9,-3};
        System.out.println(FindGreatestSumOfSubArray(array));

    }
}
