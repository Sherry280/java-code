package Day26;

public class Solution3 {
    /**
     * 统计从1-n中1出现的次数
     */
    public static int countDigitOne1(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=countIntegerOne(i);
        }
        return sum;
    }
    public static int countIntegerOne(int n){
        int num=0;
        while(n!=0){
            num+=(n%10==1)?1:0;
            n/=10;
        }
        return num;

    }

    public static void main(String[] args) {
        int n=12;
        System.out.println(countDigitOne1(n));

    }

}
