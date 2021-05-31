package Day29;

import java.util.Scanner;

public class Solution3 {
    /**
     * 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
     * 整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4x
     */
    public static boolean isPowerOfFour(int n) {
        return n>0&&(n&(n-1))==0&&(0xaaaaaaaa&n)==0;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(isPowerOfFour(n));
        }

    }
}
