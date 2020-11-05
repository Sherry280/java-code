package impl;

import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {

        Map<String,String> m=new TreeMap<>();

        //put(key,value):插入key-value的键值对
        m.put("林冲","豹子头");
        m.put("鲁智深","花和尚");
        m.put("武松","行者");
        m.put("宋江","及时雨");


        String str=m.put("李逵","黑旋风");
        System.out.println(m.size());
        System.out.println(m);

        //put(key,value):注意key不能为空，但是value可以为空，key如果为空，会抛空指针异常
        str=m.put("无名",null);
        System.out.println(m.size());

        //如果key存在，put(key,value)则会替换掉原来的value，返回旧的value
        str=m.put("李逵","铁牛");

        //get(key),返回key所对应的value
        //如果key存在，则返回key对应的value，如果key不存在，则返回null
        System.out.println(m.get("鲁智深"));
        System.out.println(m.get("史进"));

        //containKey(key):检查key是否包含在Map中，时间复杂度O(log(n))
        //按照红黑树的主性质进行查找
        //找到返回true，找不到，则返回false
        System.out.println(m.containsKey("林冲"));
        System.out.println(m.containsKey("史进"));

        //containValue(value):检测value是否包含在Map中，时间复杂度O（n）
        //因为TreeMap是按照key进行组织的，因此查找value时候就需要整体遍历
        //找到返回true，找不到返回false
        System.out.println(m.containsValue("豹子头"));
        System.out.println(m.containsValue("九纹龙"));

        //打印所有的key
        for(String s:m.keySet()){
            System.out.println(s+" ");
        }
        System.out.println();

        //打印所有的value
        for(String s:m.values()){
            System.out.println(s+" ");
        }
        System.out.println();

        //打印所有的键值对
        //entrySet():将Map中的键值对放在Set中返回了
        for(Map.Entry<String,String> entry:m.entrySet()){
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
        System.out.println();









//        Map<String, String> m = new TreeMap<>();
//         m.put("林冲","豹子头");
//         m.put("鲁智深","花和尚");
//         m.put("武松","行者");
//         m.put("宋江","及时雨");
//         String str=m.put("李逵","黑旋风");
//        System.out.println(m.size());
//        System.out.println(m);
//
//
//
//        str=m.put("无名",null);
//        System.out.println(m.size());
//
//
//        str=m.put("李逵","铁牛");
//        System.out.println(m.get("鲁智深"));
//        System.out.println(m.get("史进"));
//
//        System.out.println(m);





    }


}
