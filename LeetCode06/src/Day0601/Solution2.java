package Day0601;

import java.util.Arrays;

public class Solution2 {
    /**
     * 给你一个下标从0开始的正整数数组 candiesCount ，其中 candiesCount[i]
     * 表示你拥有的第 i 类糖果的数目。同时给你一个二维数组 queries ，
     * 其中 queries[i] = [favoriteTypei, favoriteDayi, dailyCapi] 。
     *
     *
     */
        public static  boolean[] canEat(int[] candiesCount, int[][] queries) {

            // 1. 定义一个数组存储若想吃到类型i的糖果，之前需要吃到多少其他类型的
            long[] candiesTotal = new long[candiesCount.length];
            candiesTotal[0] = 0;
            for(int i = 1; i < candiesCount.length; i++) {
                candiesTotal[i] = candiesCount[i - 1] + candiesTotal[i - 1];
            }

            // 2. 计算queries每一组数据可以吃掉的糖果数量范围[min, max]
            // candiesTotal[favoriteTypei] 若在这个范围内即为true，相反为false
            boolean[] ans = new boolean[queries.length];
            for(int j = 0; j < queries.length; j++) {
                int type = queries[j][0];
                long min = queries[j][1] + 1;
                long max = (long)(queries[j][1] + 1) * queries[j][2]; // 此处一定注意要提前用(long)进行强转，否则会数值溢出
                if(candiesTotal[type] + candiesCount[type] >= min && candiesTotal[type] < max) {
                    ans[j] = true;
                }
                else {
                    ans[j] = false;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] candiate={7,4,5,3,8};
        int[][] queries={{0,2,2},{4,2,4},{2,13,10000000}};
        System.out.println(Arrays.toString(canEat(candiate, queries)));
    }
    }
