package impl;

import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> m = new TreeMap<>();
         m.put("林冲","豹子头");
         m.put("鲁智深","花和尚");
         m.put("武松","行者");
         m.put("宋江","及时雨");
         String str=m.put("李逵","黑旋风");
        System.out.println(m.size());
        System.out.println(m);



        str=m.put("无名",null);
        System.out.println(m.size());


        str=m.put("李逵","铁牛");
        System.out.println(m.get("鲁智深"));
        System.out.println(m.get("史进"));

        System.out.println(m);





    }


}
