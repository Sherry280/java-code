package Test0813.Test0823;

import java.util.*;

public class Solution2 {
    /**
     * 对一个字符串进行排列，计算a的数量
     * 规则1：如果字符串中带有小写字母a，小写字母a数量多的字符串排在前面
     * 规则2：如果小写字母a数量相同，字符串长度较长的排前面
     * 规则3：字母a和字符串长度都相同，则按原字符串中的相对顺序排列
     * 例如：aa,baaa,cc,a,cba,abc,bb
     * 输出：baaa,aa,cba,abc,a,cc,bb
     */
    public static String words(String s){
        if(s.length()==0||s==null){
            return null;
        }
        String[] ss = s.split(",");
        StringBuffer sb=new StringBuffer();
        int k=0;
        Map<String,Integer> map=new HashMap<>();
        for(String word:ss){
            //判断每一个字符串中有多少个a
            k=0;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)=='a'){
                    k++;
                }
            }
            map.put(word,k);
        }
        //对map中的数据根据value进行排序
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        //通过比较器来实现
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        for(Map.Entry<String,Integer> mapping:list){

           sb.append(mapping.getKey()+",");
        }
        return sb.substring(0,sb.length()-1);


    }

    public static void main(String[] args) {
        String s="aa,baaa,cc,a,cba,abc,bb";
        System.out.println(words(s));

    }
}
