package Day12;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }
    private static void mergeSortInternal(int[] array,int left,int right){
        if(left==right){
            return;
        }
        int mid=left+(right-left)/2;
        mergeSortInternal(array,left,mid);
        mergeSortInternal(array,mid+1,right);

        merge(array,left,mid,right);
    }
    //进行合并的过程
    private static void merge(int[] array,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int k=0;
        int[] extra=new int[right-left+1];
        while(i<=mid&&j<=right){
            if(array[i]<array[j]){
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
        int[] array={6,4,7,8,4,3,23,56,44,3};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
