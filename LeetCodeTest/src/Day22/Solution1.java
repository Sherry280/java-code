package Day22;

import java.math.BigInteger;

public class Solution1 {
    /**
     * 输入两个字符串，计算他们相加的结果,结果以字符串的形式展示
     */

    //字符串长度越界
    public String addStrings1(String num1, String num2) {
        int n1= Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int sum=n1+n2;
        String s=Integer.toString(sum);
        return s;


    }
    public static  String addStrings(String num1,String num2){
        //设置进位，标记最低位
        int i=num1.length()-1;
        int j=num2.length()-1;
        int jinwei=0;
        StringBuilder sb=new StringBuilder();
        //现在从最低位开始进行相加
        while (i>=0||j>=0||jinwei!=0){
            //若下标小于0，直接将此处的数字置为0；  记得相加的时候要加上进位；
            int n1=i>=0?num1.charAt(i)-'0':0;
            int n2=j>=0?num2.charAt(j)-'0':0;
            int sum=n1+n2+jinwei;
            sb.append(sum%10);
            jinwei=sum/10;
            i--;
            j--;

        }
        sb.reverse();
        return sb.toString();

    }

    public static void main(String[] args) {
        String num1="123456";
        String num2="153";
        System.out.println(addStrings(num1, num2));
    }
}
