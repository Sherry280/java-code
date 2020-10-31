package impl;

import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static  int singleNumber(int[] nums) {
        Map<Integer, Integer> 出现次数 = new TreeMap<>();
        for (int n : nums) {
            Integer count = 出现次数.get(n);


            if (count == null) {
                count++;
                //出现次数.put(count);
            }
            出现次数.put(n, count);


            //int count=出现次数.getOrDefault(n,o);
//            count++;
//            出现次数.put(n.count);

        }
        System.out.println(出现次数);
        return -1;
    }

}
