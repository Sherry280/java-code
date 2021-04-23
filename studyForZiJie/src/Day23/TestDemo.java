package Day23;

import java.util.*;

public class TestDemo {
    /**
     * 数组中数字出现的次数：有两个数字出现了1次，其他的数字均出现了2次
     */
    public static int[] singleNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int[] arr=new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : nums) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }
        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
                if (a.getValue().equals(1)) {
                        set.add(a.getKey());
                    //System.out.println(a.getKey());
                }
        }
       for(int e:set){
           for(int i=0;i<arr.length;i++){
               arr[i]=e;
           }
       }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,1,4,5,6,6};
        System.out.println(Arrays.toString(singleNumbers(arr)));

    }
}
