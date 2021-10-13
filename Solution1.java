package Test10.Test1013;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution1 {
    /**
     * 1.以字符串的形式提供给你一段英文文章，请编写一个程序。
     * 该程序将统计指定字符串中每个单词出现的次数，并
     * 输出出现次数最多的单词及其出现次数（不限语言，函数自行声明）
     */
    public static String[] strToArray(String s){
        s=s.toLowerCase();
        String res="[\\W]+";
        s=s.replaceAll(res," ");
        String[] strs=s.split(" ");
        return strs;
    }
    public static void maxCountWords(String[] strs){
        HashMap<String,Integer> map=new HashMap();
        for(String s:strs){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s,map.get(s)+1);
            }

//            in=map.put(s,1);
//            if(in!=null){
//                map.put(s,in+1);
//            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        String maxStr=null;
        int maxValue=0;
        for(Map.Entry<String, Integer> e:entrySet){
            String key=e.getKey();
            Integer value=e.getValue();
            if(value>maxValue){
                maxStr=key;
            }
        }
        System.out.println("出现次数最多的单词是："+maxStr+"出现了"+maxValue+"次");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] strs=strToArray(str);
            maxCountWords(strs);
        }
    }
}
