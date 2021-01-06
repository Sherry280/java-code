package day4;

public class is {

    /**
     * 判读一个数是否为平方数
     * 不要求使用sqrt函数
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int left=2;
        int right=(num/2);
        int xx=0;
        while(left<=right){
            int x=(left+right)/2;
            xx=x*x;
            if(xx==num){
                return true;
            }else if(xx>num){
                right=x-1;
            }else{
                left=x+1;
            }

        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(is.isPerfectSquare(77));
    }
}
