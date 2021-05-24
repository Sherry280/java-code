package Day24;

import java.util.Arrays;

public class TestDemo {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }

    private static void quickSortInternal(int[] array, int lowIndex, int highIndex) {
        int size=highIndex-lowIndex+1;
        if(size<=1){
            return;
        }
        int keyIndex=partition(array,lowIndex,highIndex);
        quickSortInternal(array,lowIndex,keyIndex-1);
        quickSortInternal(array,keyIndex+1,highIndex);


    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int leftIndex=lowIndex;
        int rightIndex=highIndex;
        int key=array[lowIndex];
        while (leftIndex<rightIndex){
            while(leftIndex<rightIndex&&array[rightIndex]>=key){
                rightIndex--;
            }
            while(leftIndex<rightIndex&&array[leftIndex]<=key){
                leftIndex++;
            }
            swap(array,leftIndex,rightIndex);
        }
        swap(array,lowIndex,leftIndex);
        return leftIndex;
    }
    private static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    public static void main(String[] args) {
        int[] array={1,6,5,3,9,12,34,64,22};
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }
}
