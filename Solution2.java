package Test09.Test0904;

import com.sun.corba.se.impl.activation.ProcessMonitorThread;

import java.util.*;

public class Solution2 {
    /**
     * 给定两个有序数组，相加之后，输出和最大的前k个
     * @param arr1
     * @param arr2
     * @param k
     * @return
     */
    public static int[] findTopKinTwoSortedArray (int[] arr1, int[] arr2, int k) {
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                list1.add(arr1[i]+arr2[j]);
            }
        }
        int[] ret=new int[list1.size()];
        Object[] objects = list1.toArray();
        for(int i=0;i<ret.length;i++){
           ret[i]=(int)objects[i];
        }
        Arrays.sort(ret);
        int[] res=new int[k];
        List<Integer> list=new ArrayList<>();
        for(int i=ret.length-1;i>=ret.length-k;i--){
            list.add(ret[i]);
        }
        Object[] objects1 = list.toArray();
        for(int i=0;i<k;i++){
            res[i]=(int)objects1[i];
        }
        return res;
    }
    /**
     * 最长无重复子数组
     *不应该进行排序
     */
    public static int maxLength (int[] arr) {
        if(arr.length==0||arr==null){
            return 0;
        }
        int longest=0;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0,j=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                j=Math.max(j,map.get(arr[i]+1));
            }
            map.put(arr[i],i);
            longest= Math.max(longest,i-j+1);
        }
        return longest;

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7};
        System.out.println(findTopKinTwoSortedArray(arr1, arr2, 4));
//        System.out.println(maxLength(arr));


    }
}
