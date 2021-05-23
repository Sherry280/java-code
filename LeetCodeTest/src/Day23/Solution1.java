package Day23;

public class Solution1 {
    /**
     * 检查数组表示的字符串是否相等
     *给你两个字符串数组 word1 和 word2 。
     * 如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
     */
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //最简单的思路就是遍历数组，将数组中的单词进行拼接，然后判断是否相等
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }

        return sb1.toString().equals(sb2.toString());

    }

    public static void main(String[] args) {
        String[] s1={"a","bc"};
        String[] s2={"ab","c"};
        System.out.println(arrayStringsAreEqual(s1, s2));

    }



}
