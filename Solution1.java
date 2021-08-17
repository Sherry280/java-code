package Test0813.Test0817;

import java.util.Arrays;

public class Solution1 {
    /**
     * 给定一个无序数组arr，返回数组能够构成的连续子序列最长的长度
     * @param arr
     * @return
     */
    public int MLS(int[] arr) {
        int largest=1;
        int count=1;
        Arrays.sort(arr);
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
    /**
     * 学生的出勤记录
     * @param s 学生出勤标记的字符串
     */
    public static boolean checkRecord(String s) {
        char[] chars = s.toCharArray();
        //计算A的数量，要小于等于2
        int countA=0;
        for(char c:chars){
            if(c=='A'){
                countA++;
            }
        }
       boolean countL=false;
        for(int i=chars.length-1;i>=chars.length-3;i--){
            if(chars[i]=='L'&&chars[i-1]=='L'&&chars[i-2]=='L'){
                countL=true;
            }
        }
        if(countA<2&&!countL){
            return true;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {
        String s="PPPLLAP";
        System.out.println(checkRecord(s));
    }
    /**
     *所有蚂蚁掉下来前的最后一刻
     * 思路：1.相当于左边的蚂蚁走到板的右边掉下去；2.右边的蚂蚁走到板的左边掉下去
     *
     */
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax=0;
        for(int l:left){
            leftMax=Math.max(l,leftMax);
        }
        int rightMax=0;
        for(int r:right){
            rightMax=Math.max(n-r,rightMax);
        }
        return Math.max(leftMax,rightMax);

    }



    /**
     *找到给定字符串中最大的奇数，“52347”，不用进行截取
     * 思路：首先从最后一位进行判断。若是奇数，直接返回，否则判断倒数第二位
     */
    public String largestOddNumber(String num) {
        int n=num.length()-1;
        String s="";
        for(int i=n;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                //substring不包括右边界，所以截取的时候，0到i+1；
               s=num.substring(0,i+1);
            return s;
            }
        }
        return "";
    }

}
