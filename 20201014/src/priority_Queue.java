import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class priority_Queue {
    public List<List<Integer>> kSmallestPairs(final int[] nums1, final int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0 || n == 0){
            return new ArrayList();
        }

        //定义一个大堆
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b) ->a[0]-b[0]);


        for (int i = 0; i < n; i++){
            queue.add(new int[]{nums1[0] + nums2[i], 0, i});
        }
        List<List<Integer>> res = new ArrayList();
        while (k-- > 0 && !queue.isEmpty()){
            final int[] item = queue.poll();
            res.add(new ArrayList(){{ add(nums1[item[1]]); };{ add(nums2[item[2]]); };});
            if (item[1] + 1 < m){
                queue.add(new int[]{nums1[item[1] + 1] + nums2[item[2]],item[1] + 1, item[2]});
            }
        }
        return res;
    }






    public int lastStoneWeight(int[] stones) {
            // 建立一个大根堆。
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((o1, o2) -> (o2 - o1));
            for (int i = 0; i < stones.length; i++) {
                priorityQueue.offer(stones[i]);
            }
            // 从中选出两块 最重的 石头
            while( priorityQueue.size() > 1 ) {
                int y = priorityQueue.poll();
                int x = priorityQueue.poll();
                // 新的石头重量写入 priorityQueue
                int diff = y - x;
                if ( diff != 0 ) priorityQueue.offer(diff);
            }
            // priorityQueue空 return 0
            if ( priorityQueue.size() == 0 ) return 0;

            return priorityQueue.peek();

    }



}
