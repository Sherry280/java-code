package FebDay24;

import java.util.ArrayList;
import java.util.Collections;

public class TestDemo3 {
    /**
     * 有一个整数数组，请你根据快速排序的思路，找出数组中第K大的数。
     * 给定一个整数数组a,同时给定它的大小n和要找的K(K在1到n之间)，
     * 请返回第K大的数，保证答案存在。
     */
    public static int findKth(int[] a, int n, int K) {
            ArrayList<Integer> l = new ArrayList();
            for(int i = 0; i < a.length; i++){
                l.add(a[i]);
            }

            Collections.sort(l);
            int index = l.size() -1;
            while(K>1){
                int temp = l.get(index);
                index--;
                while(l.get(index) == temp){
                    index--;
                }
                K--;
            }
            return l.get(index);

    }
    public static void main(String[] args) {
        int[] array={1,3,4,4,6,5};
        int n=6;
        int k=4;
        System.out.println(findKth(array, n, k));

    }
}
