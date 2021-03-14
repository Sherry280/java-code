package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopK {
    /**
     * 合并两个有序数组  组 B合并到数组A中，变成一个有序的数组
     * 假设A的初始容量比较大
     */

    public static void merge(int A[], int m, int B[], int n) {
        //遍历B中的元素即可，因为是要将B中的元素放到A中
        for(int i=0;i<n;i++){
            A[m+i]=B[i];
        }
        Arrays.sort(A);


    }
    public static void main(String[] args) {
        int[] A={1,4,5,6,8,9,12,14};
        int[] B={3,7,18,19,20};
        merge(A,8,B,5);
        System.out.println(Arrays.toString(A));

    }
    /**
     * 最小的K个数字
     * 找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
     * 如果K>数组的长度，那么返回一个空的数组
     */

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            list.add(input[i]);
        }
        return list;

    }
    public static void main1(String[] args) {
        int[] input={4,5,1,6,2,7,3,8};
        int k=4;
        System.out.println(GetLeastNumbers_Solution(input, k));

    }
}
