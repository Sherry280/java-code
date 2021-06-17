package Day0617;

public class Solution3 {
    /**
     * k次操作转变字符串：需要在K次
     */
    public static boolean canConvertString(String s, String t, int k) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] dict=new int[26];
        for(int i=0;i<s.length();i++){
            int key=t.charAt(i)-s.charAt(i);
            key=key>=0?key:26+key;
            if(key!=0){
                int temp=dict[key]*26+key;
                if(temp>k){
                    return false;
                }
                dict[key]++;
            }

        }
        return true;


    }
    public static void main(String[] args) {
        String s="input";
        String t="ouput";
        int k=10;
        System.out.println(canConvertString(s, t, k));

    }
}
