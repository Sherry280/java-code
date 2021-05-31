package Day29;

public class Solution4 {
    /**
     * 将灯泡进行翻转和目标target的值一样：
     * 进行翻转的时候：初始状态都是关闭，0000...，然后开始选择反转的第一个数字的时候，怎么选择呢？
     *
     */
    public static  int minFlips(String target) {
       int sum=0;
       char prev='0';
       int n=target.length();
       for(int i=0;i<n;i++){
           char c=target.charAt(i);
           if(c!=prev){
               sum++;
               prev=c;
           }
       }
       return sum;

    }

    public static void main(String[] args) {
        String target="0100";
        System.out.println(minFlips(target));

    }
}
