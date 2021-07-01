package Day0630;

public class Solution2 {
    /**
     * 传递信息
     */
    public static int numWays(int n, int[][] relation, int k) {
        int[][] dp=new int[k+1][n];
        dp[0][0]=1;
        for(int i=0;i<k;i++){
            for(int[] edge:relation){
                int src=edge[0];
                int dst=edge[1];
                dp[i+1][dst]+=dp[i][src];
            }
        }
        return dp[k][n-1];


    }
    public static void main(String[] args) {
        int n=5;
        int[][] relation={{0,2},{2,1},{3,4},{2,3},{1,4},{2,0},{0,4}};
        int k=3;
        System.out.println(numWays(n, relation, k));

    }
}
