package Day0607;

public class Solution1 {
    /**
     * 给你一个整数数组 nums 和一个整数 target 。
     * 向数组中的每个整数前添加 '+' 或 '-' ，然后串联起所有整数，可以构造一个 表达式 ：
     * 例如，nums = [2, 1] ，可以在 2 之前添加 '+' ，在 1 之前添加 '-'
     * 然后串联起来得到表达式 "+2-1" 。
     * 返回可以通过上述方法构造的、运算结果等于 target 的不同 表达式 的数目。
     */

    public static int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(Math.abs(target)>Math.abs(sum)){
            return 0;
        }
        int len=nums.length;
        int t=2*sum+1;
        int[][] dp=new int[len][t];

        //进行初始化
        if(nums[0]==0){
            dp[0][sum]=2;
        }else{
            //相当于将数组下标向右移动，使下标不为负数
            //进行初始化的时候，看着表格初始化第一行数据
            dp[0][sum+nums[0]]=1;
            dp[0][sum-nums[0]]=1;
        }
        //进行计算表中第二行开始的各项数据：
//        for(int i=1;i<len;i++){//行，第一行已经初始化过了
//            for(int j=0;j<t;j++){//列
//                //
//                int l=(j-nums[i])>=0?j-nums[i]:0;
//                int r=(j+nums[i])<t?j+nums[i]:0;
//                dp[i][j]=dp[i-1][l]+dp[i-1][r];
//            }
//        }

        for(int i=1;i<len;i++){
            for(int j=-sum;j<=sum;++j){
                if(j+nums[i]>sum){
                    dp[i][j+sum]=dp[i-1][j-nums[i]+sum];
                }else if(j-nums[i]<-sum){
                    dp[i][j+sum]=dp[i-1][j+nums[i]+sum];
                }else{
                    dp[i][j+sum]=dp[i-1][j-nums[i]+sum]+dp[i-1][j+nums[i]+sum];
                }
            }
        }

        return dp[len-1][sum+target];


    }
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int target=3;
        System.out.println(findTargetSumWays(nums,target));

    }
}
