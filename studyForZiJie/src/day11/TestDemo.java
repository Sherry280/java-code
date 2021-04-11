package day11;

public class TestDemo {
    /**
     * 字符串逆转
     */
    public String LeftRotateString(String str,int n) {
        if(n>str.length()){
            n%=(str.length());
        }
        String s1 = str.substring(0, n);
        String s2=str.substring(n+1);
        String ss=s2+s1;
        return ss;
    }
    public static void main(String[] args) {

    }
}
