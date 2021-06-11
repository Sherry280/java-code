package Day0611;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(int[] array, int lowIndex, int highIndex) {
       int size=highIndex-lowIndex+1;
       if(size<=1){
           return;
       }
        int index=partition(array,lowIndex,highIndex);
        quickSortInternal(array,lowIndex,index-1);
        quickSortInternal(array,index+1, highIndex);

    }
    public static int partition(int[] array,int lowIndex,int highIndex){
        int leftIndex=lowIndex;
        int rightIndex=highIndex;
        int key=array[lowIndex];
        while(leftIndex<rightIndex){
            while (leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }
            array[leftIndex]=array[rightIndex];
            while(leftIndex<rightIndex&&array[leftIndex]<=key){
                leftIndex++;
            }
            array[rightIndex]=array[leftIndex];
        }
        array[rightIndex]=key;
        return leftIndex;
    }

    public static void main(String[] args) {
        int[] array={1,4,3,7,10,5,7,9};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
