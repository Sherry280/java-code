package Day0601;

public class Solution1 {
    /**
     * 判断国际象棋棋盘上每个格子的颜色
     * 给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标。
     */
    public static boolean squareIsWhite(String coordinates) {
        char x=coordinates.charAt(0);
        char y=coordinates.charAt(1);
        if(x%2!=0&&y%2!=0){
            return false;
        }
        if(x%2==0&&y%2==0){
            return false;
        }
        return true;

    }
     //判断字符串分割成两部分后，是否相似
    public static boolean halvesAreAlike(String s) {
        // aeiou
        s=s.toLowerCase();
        String s1 = s.substring(0, s.length() / 2);
        int s1Sum=0;
        String s2 = s.substring(s.length() / 2 + 1);
        int s2Sum=0;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
               s1Sum++;
            }
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                s2Sum++;
            }
        }
        return s1Sum==s2Sum;



    }

    public static void main(String[] args) {
        String s="tkPAdxpMfJilteOrItiv";
        System.out.println(halvesAreAlike(s));
        //System.out.println(squareIsWhite(s));
    }



}
