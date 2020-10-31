package 自己实现的TreeMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> 通讯录=new TreeMap<>();
        通讯录.put("火警",119);
        通讯录.put("急救",120);
        通讯录.put("查号",12345);
        通讯录.put("天气预报",12345);

//        Set<String> keys = 通讯录.keySet();
//        System.out.println(keys);
//
//        Collection<Integer> values = 通讯录.values();
//        System.out.println(values);
        Set<String> keys=通讯录.keySet();
        for(String key:keys){
            Integer value=通讯录.get(key);
            System.out.println(key+"="+value);
        }
    }
}
