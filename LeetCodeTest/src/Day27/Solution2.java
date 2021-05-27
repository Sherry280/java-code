package Day27;

public class Solution2 {
    /**
     * 给你两个二进制字符串，返回它们的和（用二进制表示）。
     * 输入为 非空 字符串且只包含数字 1 和 0。
     */

    //方法1:直接让二进制进行计算
    public static String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuffer sb=new StringBuffer();
        //先循环相加两个字符串长度相同的低位部分
        while(i>=0&&j>=0){
            int sum=carry;
            //减去0相当于将字符串的结果转为整数，那么一个字符减去'a'就相当于得到的是和a之相差的结果，为整数
            sum+=a.charAt(i--)-'0';
            sum+=b.charAt(j--)-'0';
            carry=sum/2;
            sb.append(sum%2);
        }
        //a比b长的话
        while(i>=0){
            int sum=(carry+a.charAt(i--)-'0');
            carry=sum/2;
            sb.append(sum%2);
        }
        //b比a长的话
        while(j>=0){
            int sum=(carry+b.charAt(j--)-'0');
            carry=sum/2;
            sb.append(sum%2);
        }
        //如果进位carry不等于0
        if(carry==1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String a="11";
        String b="1";
        System.out.println(addBinary(a, b));

    }
}
