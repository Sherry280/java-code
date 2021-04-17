package Day16;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }
    //fen
    private static void mergeSortInternal(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSortInternal(array,left,mid);
        mergeSortInternal(array,mid+1,right);

        merge(array,left,mid,right);



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
        int[] array={2,5,4,66,44,88};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
