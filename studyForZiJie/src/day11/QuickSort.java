package day11;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] array){
        quickSortInternal(array,0,array.length-1);
    }
    private static void quickSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int index=partiton(array,left,right);
        quickSortInternal(array,left,index-1);
        quickSortInternal(array,index+1,right);


    }
    private static int partiton(int[] array,int left,int right){
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j&&array[right]>=pivot){
                j--;
            }
            while(i<j&&array[left]<=pivot){
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }
    private static void swap(int[] array,int left,int right){
        int tmp=array[left];
        array[left]=array[right];
        array[right]=tmp;
    }

    public static void main(String[] args) {
        Random r=new Random(10);
        int[] array=new int[8];
        for(int i=0;i<8;i++){
            array[i]= r.nextInt();
        }
        System.out.println("排序之前：");
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(array));
    }
}
