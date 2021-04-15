package Day15;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }
    private static void mergeSortInternal(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);

        merge(array,low,mid,high);
    }
    private static void merge(int[] array,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int[] extra=new int[right-left+1];
        int k=0;
        while(i<=mid&&j<=right){
            if(array[i]<=array[j]){
                extra[k++]=array[i++];
            }else{
                extra[k++]=array[j++];
            }

        }
        while(i<=mid){
            extra[k++]=array[i++];
        }
        while(j<=right){
            extra[k++]=array[j++];
        }
        for(int t=0;t<extra.length;t++){
            array[left+t]=extra[t];
        }
    }

    public static void main(String[] args) {
        int[] array={5,7,4,2,9};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
