package Day28;

public class HuiWen {
    public static  boolean isPalindrome(int x) {
        //怎样将一个整数转为字符串
        String result="";
        while (x!=0){
            result=result+x%10;
            x=x/10;

        }
//       Integer s=x;
//        String s1 = s.toString();

        //result为逆序x的字符串
        int i=0;
        int j=result.length()-1;
        while (i<j){
            if(result.charAt(i)!=result.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;


    }

    public static void main(String[] args) {
        int x=12321;
        System.out.println(isPalindrome(x));
    }
}
