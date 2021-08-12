package Sort;

import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array){
        int length=array.length;
        buildMaxHeap(array,length);
        for(int i=0;i<length;i++){
            swap(array,0,length-1-i);
            maxHeapfy(array,0,length-i-1);
        }

    }
    public static void swap(int[] array,int i,int j){
        if(i!=j){
            array[i]^=array[j];
            array[j]^=array[i];
            array[i]^=array[j];
        }
    }
    public static void maxHeapfy(int[] array,int i,int heapSize){
        int left=i*2+1;
        int right=i*2+2;
        int largest=i;
        if(left<heapSize&&array[left]>array[largest]){
            largest=left;
        }
        if(right<heapSize&&array[right]>array[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(array,largest,i);
            maxHeapfy(array,largest,heapSize);
        }
    }
    public static void buildMaxHeap(int[] array,int heapSize){
        for(int i=(heapSize-2)/2;i>=0;i--){
            maxHeapfy(array,i,heapSize);
        }

    }

    public static void main(String[] args) {
        int[] array={3,6,8,3,7,12,6,9,11,1};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
