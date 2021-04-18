package Day16;

import java.util.*;

public class TestDemo {
        public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
            //创建一个ArrayList来保存最后的输出结果
            ArrayList<Integer> res = new ArrayList<>();
            //异常情况进行判断是否为空
            if (input == null || k <= 0 || k > input.length) {
                return res;
            }
            //存放最后要找出的k个元素
            //优先级队列他自己是会自动进行调整的吗？
            PriorityQueue<Integer> queue = new PriorityQueue<>(k, Collections.reverseOrder());
            //遍历整个数组进行元素
            for (int i = 0; i < input.length; i++) {
                if (queue.size() < k) {
                    queue.add(input[i]);
                } else {
                    if (input[i] < queue.peek()) {
                        queue.remove();
                        queue.add(input[i]);
                    }
                }
            }
            //把优先级队列中的元素搬到ArraysList中来
            while (!queue.isEmpty()) {
                res.add(queue.remove());
            }
            return res;
        }

//[4,5,1,6,2,7,3,8],4
    public static void main(String[] args) {
            int[] array={4,5,1,6,2,7,3,8};
            int k=4;
        ArrayList<Integer> arr = GetLeastNumbers_Solution(array, k);
        System.out.println(arr);

    }
}
