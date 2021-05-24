package Day24;

public class Solution3 {
    /**
     * 两个字符串进行交换，是否能够交换一次就能够使两个字符串相等
     */
    public static  boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.equals(s2)){
            return true;
        }
        int first=-1;
        int second=-1;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(first==-1){
                    first=i;
                }else if(second==-1){
                    second=i;
                }else{
                    return false;
                }
            }
        }
        return second!=-1&&s1.charAt(first)==s2.charAt(second)&&
                s1.charAt(second)==s2.charAt(first);
    }

    public static void main(String[] args) {
        String s1="bank";
        String s2="kanb";
        System.out.println(areAlmostEqual(s1, s2));

    }



}
