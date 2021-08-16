package Test0813;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution1 {
    /**
     * 最小的k个数
     * @param arr 数组
     * @param k  使用堆
     * @return
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>((nums1,nums2)->nums2-nums1);
        for(int i=0;i<k;i++){
            heap.add(arr[i]);
        }
        //将剩余数组元素放进去
        for(int i=k;i<arr.length;i++){
            if(heap.peek()>arr[i]){
                heap.poll();
                heap.add(arr[i]);
            }
        }
        //将堆元素转成数组
        int[] array=new int[k];
        for(int i=0;i<k;i++){
            array[i]=heap.poll();

        }
        return array;

    }
    /**
     *统计字符串中最长回文串的个数
     */
    public static int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        int res=0;
        for(char ch:s.toCharArray()){
            if(set.remove(ch)){
                res+=2;
            }else{
                set.add(ch);
            }
        }
        return res+(set.isEmpty()?0:1);
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,8,6};
        System.out.println(Arrays.toString(getLeastNumbers(arr,3)));
        //String s="abbagtf";
//        System.out.println(longestPalindrome(s));
    }

}
