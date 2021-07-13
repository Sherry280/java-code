package Day0712;

import java.util.*;

public class DescWords {
    /**
     * 按照字符出现的频率进行排序：降序排列
     */
    public static String frequencySort(String s) {
        //将字符放到HashMap中
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        //按照字符数量降序排列
        List<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));

        StringBuffer sb=new StringBuffer();
        for(int i=0;i<list.size();i++){
            char c=list.get(i);
            int frequency=map.get(c);
            for(int j=0;j<frequency;j++){
                sb.append(c);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s="aabbbc";
        System.out.println(frequencySort(s));

    }
}
