package Day0712;

import java.util.Arrays;

public class BrrowIceCream {
    /**
     * 排序+贪心
     * 用固定数目的现金可以买到最多数量的雪糕是多少？
     */
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int c:costs){
            int coin=c;
            if(coin<=coins){
                coins-=coin;
                count++;
            }else{
                break;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] costs={1,3,2,4,1};
        int coins=7;
        System.out.println(maxIceCream(costs, coins));


    }
}
