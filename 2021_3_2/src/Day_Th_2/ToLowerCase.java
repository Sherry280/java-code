package Day_Th_2;

public class ToLowerCase {
    public static String toLowerCase(String s){
        if(s==null){
            return null;
        }
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='A'&&chars[i]<='Z'){
                chars[i]+=32;
            }
        }
        String ss="";
        for(int i=0;i<chars.length;i++){
            ss+=chars[i];
        }
        return ss;
    }
    public static void main(String[] args) {
        String s="ADRTftge";
        System.out.println(toLowerCase(s));

    }
}
