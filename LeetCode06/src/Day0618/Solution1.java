package Day0618;

public class Solution1 {
    /**
     * 经过K次旋转将 字符串s转换成字符串t
     */
    public static boolean canConvertString(String s, String t, int k) {
        //s和t的长度不一样的时候，直接返回false
        if(s.length()!=t.length()){
            return false;
        }
        //创建一个哈希表存储s和t相同位置字符之间的距离
        int[] dict=new int[26];
        //遍历字符串的每一个字符
        for(int i=0;i<s.length();i++){
            //key保存一个字符要跳的次数
            int key=t.charAt(i)-s.charAt(i);
            key=key>=0?key:key+26;
            if(key!=0){
                //判断哈希表中相同的字符有几个，相同的距离要旋转一圈才能转到
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
