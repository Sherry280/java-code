package Day15;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
    private static void quickSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int index=partition(array,left,right);
        quickSortInternal(array,left,index-1);
        quickSortInternal(array,index+1,right);

    }
    private static int partition(int[] array,int low,int right){
        int i=low;
        int j=right;
        int pivot=array[low];
        while(i<j){
            while(i<j&&array[j]>=pivot){
                j--;
            }
            while(i<j&&array[i]<=pivot){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,low);
        return i;
    }
    private static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    public static void main(String[] args) {
        int[] array={4,6,3,5,8,9,17};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
