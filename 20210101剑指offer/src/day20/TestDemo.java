package day20;

import java.util.Arrays;

public class TestDemo {
    /**
     * @param
     */
    public static  int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        //数组排序，采用Arrays的sort方法
        int ans = gifts[n / 2];// 理论上超过半数的数字
        int num = 0;// 遍历数组，进行统计
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] == ans) {
                num++;
            }
        }
        return num <= n / 2 ? 0 : ans;
    }

    public int getValue2(int[] gifts, int n) {
        if (gifts.length < n)
            return 0;
        if (gifts.length == 0) {
            return 0;
        }
        int count = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                temp = gifts[i];
                count = 1;
            } else {

            }


        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array={1,2,4,5,55,9};
        int n=6;
        System.out.println(getValue(array, n));
    }

}
