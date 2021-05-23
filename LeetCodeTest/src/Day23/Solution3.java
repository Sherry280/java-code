package Day23;

import java.util.Arrays;

public class Solution3 {
    /**
     * 简单字符压缩
     * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，
     * 则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）
     *
     */
    public static  String compressString(String S) {
        //思路：stringbuilder用来返回最后的字符串；
        //如果当前的i已经走到最后一个字符或者当前字符和下一个字符不相等的时候：sb中添加字符，count计数为0

        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i< S.length();i++){
            count++;
            if(i+1>=S.length()||S.charAt(i)!=S.charAt(i+1)){
                sb.append(S.charAt(i)).append(count);
                count=0;
            }
        }
        String res=sb.toString();
        return res.length()>=S.length()?S:res;

    }

    public static void main(String[] args) {
        String s="aaabbccff";
        String s1 = compressString(s);
        System.out.println(s1);

    }




}
