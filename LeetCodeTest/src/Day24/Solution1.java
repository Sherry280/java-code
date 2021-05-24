package Day24;

import java.util.Arrays;

public class Solution1 {
    /**
     *检查某个特定的单词是否为数组中某个单词的前缀
     * 思路： 1.把数组中的单词每个都拿出，一一和检索词进行比较
     *       2.返回值的时候，还要记录一下当有多个单词的前缀都是检索词的时候，返回下标最小的一个数字；
     *
     */

    public static  int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        int[] count=new int[s.length];
        for(int i=0;i<s.length;i++){
            if(s[i].length()>=searchWord.length()){
                //进行相同位置的单词的判断
                boolean b = sameWord(s[i], searchWord);
                if(b){
                    return i+1;
                }
            }
        }
        return -1;
//        Arrays.sort(count);
//        if(count.length<=0){
//            return -1;
//        }else{
//            //怎样让count中存放字符串的下标？
//            return count[count.length-1];
//        }
    }
    private static boolean sameWord(String s1,String s2){
        //s1数组中的某个字符串    s2是检索词
        //以检索单词的长度为基准
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //方法2：直接使用indexOf来判断
    public static  int isPrefixOfWord2(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        int i=0;
        for( i=0;i<s.length;i++){
            if(s[i].indexOf(searchWord)==0){
                break;
            }
        }
        if(i>=s.length){
            return -1;
        }else{
            return i+1;
        }
    }


    public static void main(String[] args) {
        //sentence = "i love eating burger", searchWord = "burg"
        String se="i love eating burger";
        String wo="burg";
        System.out.println(isPrefixOfWord2(se, wo));
    }
}
