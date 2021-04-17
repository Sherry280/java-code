package Day16;

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
    private static int partition(int[] array,int left,int right){
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j&&array[right]>pivot){
                j--;
            }
            while(i<j&&array[left]<pivot){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }
    private static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    public static void main(String[] args) {
        int[] array={5,4,7,8,16,13,12,33};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
