package Day0622;

public class Solution2 {
    /**
     * 二进制中1的个数
     */
    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>>1;
        }
        return count;
//        int i = Integer.bitCount(n);
//        return i;

    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(hammingWeight(n));

    }
}
