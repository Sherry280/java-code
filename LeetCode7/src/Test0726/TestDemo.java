package Test0726;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("lilian",80);
        map.put("xiannv",18);
        map.put("meinv",29);

        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry s:entrySet){
            System.out.println(s.getKey()+":"+s.getValue());
        }
        System.out.println("--------------");
        List<Map.Entry<String,Integer>> list=new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //按照value，从小到大的顺序排列
                //return o1.getValue()-o2.getValue();
                //按照value，从大到小的顺序排列
                //return o2.getValue()-o1.getValue();
                //按照value值，调用compareTo()方法，默认从小到大
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry s:list){
            System.out.println(s.getKey()+"----"+s.getValue());
        }



    }
}
