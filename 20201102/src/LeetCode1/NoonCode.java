package LeetCode1;



import java.util.*;

public class NoonCode {
//   //**
//     * @Description: 打印出前k个出现频率最高的单词
//     * @Param: 思路：1.遍历每个单词出现的次数    2.将次数+单词集合放进map中
    //                3.
//     * @return:
//     * @Auther: xingyuyu
//     * @Date: 2020/11/3
//     */
//    *//
    public static class WordAndCount implements Comparable<WordAndCount>{
        String word;
        int count;
        WordAndCount(String word,int count){
            this.count=count;
            this.word=word;
        }

    @Override
    public int compareTo(WordAndCount o) {
        if(count>o.count){
            return -1;
        }else if(count<o.count){
            return 1;
        }else{
            return word.compareTo(o.word);
        }
    }
}
    private static Map<String,Integer> 统计每个单词出现的次数(String[] words){
        Map<String,Integer> 出现次数=new TreeMap<>();
        for(int i=0;i<words.length;i++){
            //如果没有则为0次，加进去
            //
            String n=words[i];
            int count=0;
            if(出现次数.containsKey(words[i])){
                count=count+1;
                出现次数.put(words[i],count);
            }else{
                出现次数.put(words[i],0);
            }


        }
        return 出现次数;

    }
    public static  List<String> topKFrequent(String[] words, int k){
        //先统计每个单词出现的次数，将次数+单词存放在Map中，
        Map<String,Integer> 每个单词出现的次数=统计每个单词出现的次数(words);
        //将每个单词出现的次数在map中，转为存放在数组中，对其排序
        WordAndCount[] array=new WordAndCount[每个单词出现的次数.size()];
        int dix=0;
        for(Map.Entry<String,Integer> entry:每个单词出现的次数.entrySet()){
            String word=entry.getKey();
            int count=entry.getValue();
            WordAndCount wc=new WordAndCount(word,count);
            array[dix++]=wc;
        }

        //现在把次数+单词全部放进数组了，现在要对其进行排序
        Arrays.sort(array);
        List<String> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(array[i].word);
        }
        return ans;

    }

    public static void main(String[] args) {
        String[] array={"i","love","io","love","fist","fast","i"};
        System.out.println(topKFrequent(array, 3));


    }




}
