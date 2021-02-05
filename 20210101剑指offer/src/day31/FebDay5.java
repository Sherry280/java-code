package day31;

public class FebDay5 {
    /**
     * 2021/2/5
     * 买股票问题
     *
     * dpl[i]表示到i位置最大的收益;计算最大收益:用minI取得最大收益时较小值的位置
     *     //若arr[i+1]>arr[i],则dpl[i+1]=dp[i] 或者=arr[i+1]-arr[minI]
     *     //若arr[i+1]<arr[i],dpl[i+1]=dp[i],若arr[i+1]<arr[minI],
     *     则更新minI为arr[i+1]
     *     //再从右往左扫描计算dpr[i],同理
     */
    public  static int calculateMax(int[] prices) {
        if(prices == null || prices.length < 2 || prices.length > 100){
            return 0;
        }
        int len = prices.length;
        int[] dpl = new int[len];
        dpl[0] = 0;
        int minI = 0;

        for(int i=1; i<len; i++){   //从左到右扫描一遍填充dpl数组
            if(prices[i]>prices[i-1]){
                dpl[i] = Math.max(prices[i]-prices[minI],dpl[i-1]);
            } else{
                dpl[i] = dpl[i-1];
                if(prices[i]<prices[minI])
                    minI = i;
            }
        }

        int[] dpr = new int[len];
        dpr[len-1] = 0;
        int maxI = len-1;
        for(int i=len-2; i>=0; i--){//从右到左扫描一遍填充dpr数组
            if(prices[i]<prices[i+1]){
                dpr[i] = Math.max(prices[maxI]-prices[i], dpr[i+1]);
            } else{
                dpr[i] = dpr[i+1];
                if(prices[i]>prices[maxI]){
                    maxI = i;
                }
            }
        }

        int res = 0;
        for(int i=0; i<len; i++){ //比较得出最大值
            res = Math.max(dpl[i]+dpr[i], res);
        }
        return res;



    }

    public static void main(String[] args) {
        int[] array={1,4,6,8,6,8};
        System.out.println(calculateMax(array));

    }
    /**
     * 百万富翁问题
     */
    public static void main1(String[] args) {
        //System.out.println(300);
        long sumStrange=0;
        for(int i=1;i<=30;i++){
            sumStrange+=Math.pow(2,(i-1));
        }
        System.out.println(300+" "+sumStrange);

    }
}
