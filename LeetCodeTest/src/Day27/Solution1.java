package Day27;

public class Solution1 {
    /**
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     */
    //解法1：先进行异或，然后计算异或的字符串中有多少个数字为1
    public static  int hammingDistance(int x, int y){
        int s=x^y;
        String ss=Integer.toBinaryString(s);
        int count=0;
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    //解法2：直接使用内置位计算api
    public static int hammingDistance1(int x,int y){
        return Integer.bitCount(x^y);

    }
    //解法3：统计1的个数的时候，使用&
    public static int hammingDistance2(int x,int y){
        int s=x^y;
        int count=0;
        while(s!=0){
            count+=(s&1);
            s=s>>1;
        }
        return count;

    }
    //解法4：使用公式f(x)=x*(x-1)
    public static int hammingDistance4(int x,int y){
        int s=x^y;
        int count=0;
        while(s!=0){
            s=s&(s-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x=1;
        int y=4;
        System.out.println(hammingDistance4(x, y));

    }



}
