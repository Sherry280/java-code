package TestDemo0721;

import java.util.*;

public class Solution2 {
    /**
     * 最高频元素的个数：
     */
    public int maxFrequency(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i:nums) {
           map.put(i, map.getOrDefault(i, 0) + 1);
       }
           List<Integer> list=new ArrayList<>(map.keySet());
           Collections.sort(list);
           int ans = 1;
           for (int i = 0; i < list.size(); i++) {
               int x = list.get(i), cnt = map.get(x);
               if (i > 0) {
                   int p = k;
                   for (int j = i - 1; j >= 0; j--) {
                       int y = list.get(j);
                       int diff = x - y;
                       if (p >= diff) {
                           int add = p / diff;
                           int min = Math.min(map.get(y), add);
                           p -= min * diff;
                           cnt += min;
                       } else {
                           break;
                       }
                   }
               }
               ans = Math.max(ans, cnt);
           }
           return ans;


    }

    public static void main(String[] args) {
        int[] nums={1,2,4};
        int k=4;
        Solution2 s=new Solution2();
        System.out.println(s.maxFrequency(nums,k));

    }
}
