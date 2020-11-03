package Hash;

import java.util.HashSet;
import java.util.Set;

public class HashCode {

    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("xixi");
        set.add("haha");
        System.out.println(set);


        System.out.println(set.size());
        System.out.println(set.contains("yiyi"));

        System.out.println(set.isEmpty());

    }
}
