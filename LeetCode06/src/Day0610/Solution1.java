package Day0610;

public class Solution1 {
    /**
     * 零钱兑换
     * 动态规划II
     * 定义初始状态为dp[0][0]=1;
     */
    public static int change(int amount, int[] coins) {
        int len=coins.length;
        int[][] dp=new int[len+1][amount+1];
        //进行初始化
        for(int i=0;i<=len;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<=amount;i++){
            for(int j=1;j<=len;j++){
                int val=coins[j-1];
                for(int k=0;k*val<=i;k++){
                    dp[j][i]+=dp[j-1][i-val*k];

                }
            }
        }
        return dp[len][amount];
    }


    public static void main(String[] args) {
        int amout=5;
        int[] coins={2,3,5};
        System.out.println(change(amout, coins));

    }
}
