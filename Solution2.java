package Test10.Test1009;

public class Solution2 {
    /**
     * 判断输入三个字符串类型参数的能否构成三角形
     * 都成普通三角形，返回1；
     * 构成等腰三角形，返回2；
     * 构成等边三角形，返回3；
     * 其他类型，返回0
     */
    public int triangleType (String str1, String str2, String str3) {
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)<=0||str1.charAt(i)>9){
                return 0;
            }
        }
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)<=0||str2.charAt(i)>9){
                return 0;
            }
        }
        for(int i=0;i<str3.length();i++){
            if(str3.charAt(i)<=0||str3.charAt(i)>9){
                return 0;
            }
        }
        int s1 = Integer.parseInt(str1);
        int s2=Integer.parseInt(str2);
        int s3=Integer.parseInt(str3);
        if(s1>=Integer.MAX_VALUE||s2>=Integer.MAX_VALUE||s3>=Integer.MAX_VALUE){
            return 0;
        }
        if(s1==s2&&s2==s3){
            return 3;
        }else if(s1==s2||s2==s3){
            return 2;
        }else
        //普通三角形：两边之和大于第三边
        if((s1+s2)>s3||(s2+s3)>s1||(s1+s3)>s2){
            return 1;
        }else {
            return 0;
        }

    }
    public static void main(String[] args) {

    }
}
