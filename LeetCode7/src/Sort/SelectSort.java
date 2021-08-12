package Sort;

import java.util.Arrays;

public class SelectSort {
    public static void selectSort(int[] array){
        for(int i=0;i<array.length;i++){
            int index=i;
            for(int j=i+1;j<array.length;j++){
                if(array[index]>array[j]){
                    index=j;
                }
            }
            //找到最小的元素的下标，将其与i进行交换
            swap(array,i,index);
        }
    }
    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        int[] array={4,2,6,9,8,34,12,67,5};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
