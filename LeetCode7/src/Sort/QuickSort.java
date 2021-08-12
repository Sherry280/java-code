package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
    public static void quickSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int index=partition(array,left,right);
        quickSortInternal(array,0,index-1);
        quickSortInternal(array,index+1,right);

    }
    public static int partition(int[] array,int low,int high){
        int lowIndex=low;
        int rightIndex=high;
        int key=array[low];
        while(lowIndex<rightIndex){
            while(lowIndex<rightIndex&&array[rightIndex]<=key){
                rightIndex--;
            }
            array[lowIndex]=array[rightIndex];
            while(lowIndex<rightIndex&&array[lowIndex]>=key){
                lowIndex++;
            }
            array[rightIndex]=array[lowIndex];
        }
        array[rightIndex]=key;
        return lowIndex;
    }
    public static void quickSort2(int[] array,int left,int right){
        if(left<=right){
            int index=partition(array,left,right);
            quickSort2(array,left,index-1);
            quickSort2(array,index+1,right);
        }
    }

    public static void main(String[] args) {
        int[] array={2,7,4,9,12,5,15,23};
        quickSort2(array,0,7);
        System.out.println(Arrays.toString(array));
    }
}
