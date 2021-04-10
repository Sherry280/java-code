package Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
    //left-right为待排序区间
    private static void quickSortInternal(int[] array,int left,int right){
        if(left==right){
            return;
        }
        if(left>right){
            return;
        }

        int index=partition(array,left,right);
        quickSortInternal(array,left,index-1);
        quickSortInternal(array,index+1,right);

    }
    private static int partition(int[] array, int left, int right){
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j&&array[j]<=pivot){
                j--;
            }
            while(i<j&&array[i]>=pivot){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;

    }
    private static int partition1(int[] array,int left,int right){
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j&&array[j]>=pivot){
                j--;
            }
            array[i]=array[j];
            while(i<j&&array[i]<=pivot){
                i++;
            }
            array[j]=array[i];
        }
        array[i]=pivot;
        return i;
    }
    private static int partition3(int[] array,int left,int right){
        int d=left+1;
        int pivot=array[left+1];
        for(int i=left+1;i<=right;i++){
            if(array[i]<pivot){
                swap(array,left,right);
                d++;
            }
        }
        swap(array,d,left);
        return d;
    }
    private static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    public static void main(String[] args) {
        int[] array={1,5,7,8,5,4,23};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
