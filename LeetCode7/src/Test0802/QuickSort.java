package Test0802;

import java.util.Arrays;

public class QuickSort {
    /**
     * 快排
     */
    public void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
    public void quickSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int keyIndex=partition(array,left,right);
        quickSortInternal(array,left,keyIndex);
        quickSortInternal(array,keyIndex+1,right);

    }
    public int partition(int[] array,int low,int high){
        int leftIndex=low;
        int rightIndex=high;
        int key=array[low];
        while(leftIndex<rightIndex){
            while(leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }
            array[leftIndex]=array[rightIndex];
            while(leftIndex<rightIndex&&array[leftIndex]<=key){
                leftIndex++;
            }
            array[rightIndex]=array[leftIndex];
        }
        array[leftIndex]=key;
        return leftIndex;
    }

    public static void main(String[] args) {
        int[] array={3,2,6,8,4,9,0,3};
        QuickSort s=new QuickSort();
        s.quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
