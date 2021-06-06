package Day0605;

public class Solution4 {
    /**
     * 给定一个字符串数组，由1和0组成，给定两个整数m和n，返回子集的最大子集，
     * 该子集中最多只能包含m个0和n个1
     */
    public  int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < strs.length; i++) {
            int[] cnt = getCnt(strs[i]);
            int zeroCnt = cnt[0];
            int oneCnt = cnt[1];
            for (int j = m; j >= zeroCnt; j--) {
                for (int k = n; k >= oneCnt; k--) {
                    dp[j][k] = Math.max(dp[j-zeroCnt][k-oneCnt] + 1, dp[j][k]);
                }
            }
        }
        return dp[m][n];

    }

    private int[] getCnt(String str) {
        int countOf0 = 0;
        int countOf1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                countOf0++;
            } else {
                countOf1++;
            }
        }
        return new int[]{countOf0, countOf1};
    }


    public static void main(String[] args) {
        String[] strs={"10", "0001", "111001", "1", "0"};
        int m=5;
        int n=3;
        Solution4 s=new Solution4();
        System.out.println(s.findMaxForm(strs, m, n));


    }
}
