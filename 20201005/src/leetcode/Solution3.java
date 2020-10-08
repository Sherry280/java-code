package leetcode;

public class Solution3 {
    /**
      * @Description: 将数组分为和相等的三部分
      * @Param: 思路：1.先累加看是否能被3整除，如果能够整除，则可以分为3部分；如果不能被3整除，则返回false;
     *               2.遍历数组相加到SUM/3处，然后在+1表示找到了第二部分；
     *               3.找到两段后就返回ture，并且相加时，i的下标控制必须在数组元素的倒数第二个，可以保证分为三部分
      * @return:
      * @Auther: xingyuyu
      * @Date: 2020/10/8
      */


    public static boolean canThreePartsEquals(int[] A){
        int sum=0;
        for(int num:A){
            sum+=num;
        }
        if(sum%3!=0){
            return false;
        }

        sum/=3;
        int curSum=0,cnt=0;
        for(int i=0;i<A.length-1;i++){
            curSum+=A[i];
            if(curSum==sum){
                cnt++;
                if(cnt==2){
                    return true;
                }
                curSum=0;//将cursum置为0，是因为，要不然第二次累加的时候会加上第一次curSum的结果，所以要让他从0开始累加
            }
        }
        return false;


    }

    public static void main(String[] args) {
        int[] str={1,2,3,-3,3,4,-1};
        int[] a={2,3,0,6,7,9};
        int[] b={0};

        System.out.println(canThreePartsEquals(str));
        System.out.println(canThreePartsEquals(a));
        System.out.println(canThreePartsEquals(b));


    }
}
