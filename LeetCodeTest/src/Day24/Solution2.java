package Day24;

import java.util.HashSet;

public class Solution2 {
    /**
     *全字母句 指包含英语字母表中每个字母至少一次的句子。
     * 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。
     *
     */
    public static boolean checkIfPangram2(String s){
        HashSet<Character> set=new HashSet<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            set.add(c);
        }
        if(set.size()<26){
            return false;
        }else{
            return true;
        }
    }


    public static  boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<sentence.length();i++){
            count[sentence.charAt(i)-'a']++;
        }
        for(int a:count){
            if(a==0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s="thequickbrowntoxjumpsoverthelazydog";
        System.out.println(checkIfPangram2(s));

    }

}
