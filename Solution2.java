package Test09.Test0927;

import java.util.Arrays;

public class Solution2 {
    /**
     * 返回拼接后的最短的回文串
     */
    public static String shortestPalindrome (String s) {
        int n=s.length();
        int[] ret=new int[n];
        Arrays.fill(ret,-1);
        for(int i=1;i<n;i++){
            int j=ret[i-1];
            while(j!=-1&&s.charAt(j+1)!=s.charAt(i)){
                j=ret[i];
            }
            if(s.charAt(j+1)==s.charAt(i)){
                ret[i]=j+1;
            }
        }
       int best=-1;
        for(int i=n-1;i>=0;i--){
            while(best!=-1&&s.charAt(best+1)!=s.charAt(i)){
                best=ret[best];
            }
            if(s.charAt(best+1)==s.charAt(i)){
                ++best;
            }
        }
        String add=(best==n-1?"":s.substring(best+1));
        StringBuffer sb=new StringBuffer(add).reverse();
        sb.append(s);
        return  sb.toString();
    }
    /**
     * 找出重复的那个数字 1,2,4,4
     */
    public static int findDuplicate (int[] nums) {
        int i=0;
        int temp=0;
        while(true){
            if(nums[i]==0){
                return temp;
            }
            temp=nums[i];
            nums[i]=0;
            i=temp;
        }
//        int[] ret=new int[n];
//        for(int i=0;i<n;i++){
//            ret[i-'0']++;
//        }


    }
    public static void main(String[] args) {
        String s="aaeceaaa";
        System.out.println(shortestPalindrome(s));

    }
}
