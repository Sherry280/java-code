package Day0611;

public class Solution1 {
    /**
     * 完全平方数
     * 动态规划
     */
    public static int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i-j*j]+1,dp[i]);
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n=18;
        System.out.println(numSquares(n));

    }
}
