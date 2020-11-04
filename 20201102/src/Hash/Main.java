package Hash;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("xi",18);
        Person p2=new Person("ha",89);

        HashMap<Person,String> map=new HashMap<>();
        map.put(p1,"18");
        System.out.println(p2);
        System.out.println(map.get(p2));
        System.out.println();
        //自定义使用HashSet和HashMap的key时：1.必须重写hashCode和equals方法


    }


}
