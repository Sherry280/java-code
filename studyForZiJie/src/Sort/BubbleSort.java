package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            boolean flg=false;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    flg=true;
                    swap(array,j,j+1);
                }
            }
            if(!flg){
                break;

            }
        }
    }

    private static void swap(int[] array,int i, int j) {
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }



    public static void main(String[] args) {
        int[] array={3,6,4,7,8,3,2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
