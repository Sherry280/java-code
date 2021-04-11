package Sort;

import java.util.Arrays;

public class Merge {
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length-1);
    }

    //分
    private static void mergeSortInternal(int[] array,int low,int high){
        if(low==high){
            return;
        }

            int mid = low+(high-low)/2;
            mergeSortInternal(array, low, mid);
            mergeSortInternal(array, mid + 1, high);
            //进行合并的过程
            merge(array, low, mid, high);


    }
    //合并的过程
    private static void merge(int[] array,int low,int mid,int high){
        int i=low;
        int j=mid+1;
        int[] extra=new int[high-low+1];

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
        while(j<=high){
            extra[k++]=array[j++];
        }
//        int start=i;
//        int end=mid;
//        j=mid+1;
//        if(j<=high){
//            start=j;
//            end=high;
//        }
//        while(start<=end){
//            extra[k++]=array[start++];
//        }

        //从extra搬移回array
        for(int t=0;t<extra.length;t++){
            array[low+t]=extra[t];
        }
        //System.arraycopy(extra, 0, array, low, high-low + 1);
    }

    public static void main(String[] args) {
        int[] array={1,4,6,3,7,6,5};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
