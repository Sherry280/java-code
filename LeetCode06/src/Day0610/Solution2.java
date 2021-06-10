package Day0610;

public class Solution2 {
    /**
     * 键盘上只有两个键，只能进行一次复制或者进行粘贴
     * 输出打印n个字符的最小步数
     * 使用的是：分解质数的方法
     */
    public static int minSteps(int n) {
        if(n==1){
            return 0;
        }
        int res=0;
        int i=2;
        while(n>1){
            while(n%i==0){
               res+=i;
               n/=i;

            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=15;
        System.out.println(minSteps(n));

    }
}
