package Day0616;

public class Solution1 {
    /**
     * 取石头游戏
     * 每次只能从行的开始或者结尾处开始取石头
     */
    public static boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=piles[i];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                dp[i][j]=Math.max(piles[i]-dp[i+1][j],piles[j]-dp[i][j-1]);
            }
        }
        return dp[0][n-1]>0;

    }
    public static void main(String[] args) {
        int[] piles={1,5,9,5};
        System.out.println(stoneGame(piles));
    }
}
