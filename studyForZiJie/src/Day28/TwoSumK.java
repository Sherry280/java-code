package Day28;

import java.util.ArrayList;
import java.util.List;

public class TwoSumK {
    /**
     * 快速寻找满足条件的两个数：
     * 寻找数组中的两个数字，并且让这两个数字的和等于一个定值；
     */
    public static List<Integer> twoSumK(int[] arr, int k){
        List<Integer> array=new ArrayList<>();
        for(int i=0,j=arr.length-1;i<j;){
            if(arr[i]+arr[j]==k){
                array.add(arr[i]);
                array.add(arr[j]);
                return array;
            }else if(arr[i]+arr[j]<k){
                i++;
            }else{
                j--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,4,6,9,3,5,7};
        int k=10;
        System.out.println(twoSumK(arr, k));

    }
}
