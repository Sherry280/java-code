package MergeSort;


import java.util.Arrays;

public class mergeSort {
    //归并操作

    public static void mergeSort(long[] array){

        mergeSortInternal(array,0,array.length);

    }
    public static void mergeSortInternal(long[] array,int lowIndex,int highIndex){

        int size=highIndex-lowIndex;
        if(size<=1){
            return;
        }

        int middleIndex=(lowIndex+highIndex)/2;
        mergeSortInternal(array,lowIndex,middleIndex);
        mergeSortInternal(array,middleIndex,highIndex);

        合并两个有序区间(array,lowIndex,middleIndex,highIndex);

    }

    private static void 合并两个有序区间(long[] array,int lowIndex,int middleIndex,int highIndex){
        int size=highIndex-lowIndex;
        long[] extraArray=new long[size];
        int leftIndex=lowIndex;
        int rightIndex=middleIndex;
        int extraIndex=0;

        //两个队伍都有人时
        while(leftIndex<middleIndex&&rightIndex<highIndex){
            if(array[leftIndex]<=array[rightIndex]){
                extraArray[extraIndex]=array[rightIndex];
                leftIndex++;
                extraIndex++;
            }else{
                extraArray[extraIndex]=array[rightIndex];
                extraIndex++;
                rightIndex++;
            }
        }

        //有队伍没有人
        if(leftIndex<middleIndex){
            while(leftIndex<middleIndex){
                extraArray[extraIndex++]=array[leftIndex++];
            }
        }else{
            while(rightIndex<highIndex){
                extraArray[extraIndex++]=array[rightIndex++];

            }
        }


        //现在要把排好顺序的元素放回数组
        for(int i=0;i<size;i++){
            array[i+lowIndex]=extraArray[i];
        }



    }


    public static void main(String[] args) {
        long[] array1={1,2,3,4,5,6,7,8};
        long[] array2={8,7,6,5,4,3,2,1};
        long[] array3={3,5,8,0,8,7,6,5};
        long[] array4={8,8,8,8,8,8,8,8};

        mergeSort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
