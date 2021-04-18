package Day16;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public static ArrayList<Integer> getLeastNumbers(int[] array, int k){
        ArrayList<Integer> res=new ArrayList<>();
        if(array==null||k<=0||k>array.length){
            return res;
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(k, Comparator.reverseOrder());
        for(int i=0;i<array.length;i++){
            if(queue.size()<k){
                queue.add(array[i]);
            }else{
                if(array[i]<queue.peek()){
                    queue.remove();
                    queue.add(array[i]);
                }
            }
        }

        while(!queue.isEmpty()){
            res.add(queue.remove());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={5,4,7,3,2,7};
        System.out.println(getLeastNumbers(arr, 4));
    }

}
