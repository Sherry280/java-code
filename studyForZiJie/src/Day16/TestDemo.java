package Day16;

import java.util.*;

public class TestDemo {
        public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
            ArrayList<Integer> res = new ArrayList<>();
            if (input == null || k <= 0 || k > input.length) {
                return res;
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>(k, Collections.reverseOrder());

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
