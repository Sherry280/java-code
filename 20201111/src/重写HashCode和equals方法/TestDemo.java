package 重写HashCode和equals方法;

import java.util.HashMap;
import java.util.HashSet;

public class TestDemo {
    public static void main(String[] args) {
        Person p1=new Person("小艾",18);
        Person p2=new Person("小艾",18);
//        HashMap<Person,String> map=new HashMap<>();
//        map.put(p1,"小艾");
//        System.out.println(map.get(p2));
        HashSet<Person> set=new HashSet<>();
        set.add(p1);
        System.out.println(set.contains(p2));

    }
}
