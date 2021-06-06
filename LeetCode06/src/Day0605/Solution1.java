package Day0605;

public class Solution1 {
    /**
     *有个内含单词的超大文本文件，给定任意两个单词，
     * 找出在这个文件中这两个单词的最短距离(相隔单词数)。
     * 如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?
     *
     */
    public static int findClosest(String[] words, String word1, String word2) {
        //双指针
        int idx1=0;
        int idx2=0;
        boolean flg1=false;
        boolean flg2=false;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                idx1=i;
                flg1=true;
            }
            if(words[i].equals(word2)){
                idx2=i;
                flg2=true;
            }
            if(flg1&&flg2){
                res=Math.min(Math.abs(idx1-idx2),res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words={"I","am","a","student","from","a","university","in","a","city"};
        String word1="a";
        String word2="student";
        System.out.println(findClosest(words, word1, word2));

    }




}
