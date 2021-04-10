package Sort;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }
    private static void mergeSortInternal(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //进行合并的过程
        merge(array,low,mid,high);

    }
    private static void merge(int[] array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int length=high-low+1;
        int[] extra=new int[length];

        int k=0;

        //选择小的放入extra
        while (i<=mid&&j<=high){
            //加入等号  保证稳定性
            if(array[i]<=array[j]){
                extra[k++]=array[i++];
            }else{
                extra[k++]=array[j++];
            }
        }
        //将剩余元素放到extra中
        while(i<=mid){
            extra[k++]=array[i++];
        }
        while(j<high){
            extra[k++]=array[j++];
        }

        //从extra搬移回array
        for(int t=0;t<length;t++){
            array[low+t]=extra[t];
        }
    }

    public static void main(String[] args) {
        int[] array={1,4,6,3,7,6,5};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
