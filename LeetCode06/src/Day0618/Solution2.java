package Day0618;

public class Solution2 {
    /**
     * 最小好进制数：如果n的k进制的所有位数全为1，则称k是n的一个好进制数
     * 思路：
     */

        public  String smallestGoodBase(String n) {
            long num = Long.parseLong(n);
            int max = (int) (Math.log(num) / Math.log(2)), k;
            for (int i = 2; i <= max; i++) {
                k = (int) Math.pow(num, 1.0 / i);
                if (num == sum(k, i, 1))
                    return Integer.toString(k);
            }
            return Long.toString(num - 1);
        }

        private long sum(long k, long t, long sum) {
            for (int i = 0; i < t; i++) sum = sum * k + 1;
            return sum;
        }

    public static void main(String[] args) {
            Solution2 s2=new Solution2();
            String s="15";
        System.out.println(s2.smallestGoodBase(s));


    }
}
