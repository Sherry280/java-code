package Day13;

import java.util.Arrays;

public class Merge {
    //归并排序
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }
    //分的过程
    private static void mergeSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSortInternal(array,0,mid);
        mergeSortInternal(array,mid+1,right);

        merge(array,left,mid,right);
    }

    //合的过程
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
        int[] array={7,66,5,44,3,22,12,34,54};
        mergeSort(array);
        System.out.println(Arrays.toString(array));

    }
}
