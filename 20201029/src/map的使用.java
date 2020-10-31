import 自己实现的TreeMap.MyTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class map的使用 {

    public static void main(String[] args) {
        MyTreeMap 通讯录=new MyTreeMap();
        //不能设置为int类型的值
        Integer v=通讯录.put("xyy",890);
        System.out.println(v);
//        System.out.println(v);//第一次建立映射关系，null
//        System.out.println(通讯录);
        v=通讯录.put("xyy",789);//
        System.out.println(v);
        System.out.println(通讯录);

        //v=通讯录.getOrDefult("tzp",998);

//        System.out.println(v);//890
//        System.out.println(通讯录);
        //v=通讯录.put("908",567);


//
//        v=通讯录.get("xyy");
//        System.out.println(v);

//        v=通讯录.remove("xyy");
//        System.out.println(v);
//        System.out.println(通讯录);
    }



}
