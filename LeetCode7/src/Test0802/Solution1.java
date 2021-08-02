package Test0802;

import java.util.*;

public class Solution1 {
    /**
     * hashMap根据value值进行大小比较
     */
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("李炼",44);
        map.put("邢仙女",18);
        map.put("老李",58);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        for(Map.Entry<String,Integer> l:list){
            System.out.println(l.getKey()+":"+l.getValue());
        }


    }
}
