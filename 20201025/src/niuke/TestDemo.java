package niuke;

import com.sun.org.glassfish.gmbal.Description;

import java.util.Arrays;

public class TestDemo {
    /**
     * 回归排序
     * @param array
     */

    public static void mergeSort(long[] array){
        mergeSortInternal(array,0,array.length);
    }

    private static void mergeSortInternal(long[] array,int lowIndex,int highIndex){
        int size=highIndex-lowIndex;
        if(size<=1){
            return;
        }
        int middleIndex=(lowIndex+highIndex)/2;
        mergeSortInternal(array,lowIndex,middleIndex);
        mergeSortInternal(array,middleIndex,highIndex);

        合并两个有序区间(array,lowIndex,middleIndex,highIndex);
    }
    public static void 合并两个有序区间(long[] array,int lowIndex,int middleIndex,int highIndex){
        int size=highIndex-lowIndex;
        long[] extraArray=new long[size];
        int leftIndex=lowIndex;
        int rightIndex=middleIndex;
        int extraIndex=0;

        while(leftIndex<middleIndex&&rightIndex<highIndex){
            if(array[leftIndex]<=array[rightIndex]){
                extraArray[extraIndex]=array[leftIndex];
                extraIndex++;
                leftIndex++;
            }else{
                extraArray[extraIndex]=array[rightIndex];
                extraIndex++;
                rightIndex++;
            }

        }

        if(leftIndex<middleIndex) {//右边没有元素
            while (leftIndex < middleIndex) {
                extraArray[extraIndex++] = array[leftIndex++];
            }
        }else {
            while (rightIndex < highIndex) {
                extraArray[extraIndex++] = array[rightIndex++];
            }
        }

        for(int i=0;i<size;i++){
           array[i+lowIndex]=extraArray[i];
        }
    }

    public static void main(String[] args) {
        long[] array={4,6,89,7,6,0,45};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }



}
