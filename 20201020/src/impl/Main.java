package impl;

import java.util.Arrays;
import java.util.Random;

public class Main {

    //冒泡排序
    //时间复杂度：最好：O（n）最坏：O（n^2)
    //空间复杂度:O(1)
    //稳定
    //[无序][有序]
    public static void bubbleSort(long[] array){
        for(int i=0;i<array.length-1;i++){
            boolean flag=true;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    private static void swap(long[] array,int i,int j){
        long t=array[i];
        array[i]=array[j];
        array[j]=t;
    }

    //插入排序
    //时间复杂度：O(n^2)
    //空间复杂度:O(1)
    //稳定性:稳定
    public static void insertSort(long[] array){
        for(int i=0;i<array.length-1;i++){
            long key=array[i+1];
            int j;
            for( j=i;j>=0;j++){
                if(key<array[j]){
                    array[j+1]=array[j];

                }else{
                    break;
                }
            }
            array[j+1]=key;
        }
    }

    //选择排序
    //时间复杂度：
    //空间复杂度：
    //稳定性：不稳定
    public static void selectSort(long[] array){
        for(int i=0;i<array.length-1;i++){
            int maxIndex=0;
            for(int j=1;j<array.length-i;j++){
                if(array[j]>array[maxIndex]){
                    maxIndex=j;
                }
            }
            swap(array,maxIndex,array.length-i-1);
        }
    }

    //堆排序
    //时间复杂度：O（nlog(n))
    //空间复杂度:O(1)
    //稳定性:不稳定
    public static void heapSort(long[] array){
        //建大堆  升序
        createHeap(array,array.length);
        for(int i=0;i<array.length+1;i++){
            swap(array,0,array.length-i-1);
            adjustDown(array,array.length-i-1,0);
        }
    }
    public static void createHeap(long[] array,int size){
        for(int i=(size-2)/2;i>=0;i++){
            adjustDown(array,size,i);

        }
    }
    private static void adjustDown(long[] array,int size,int index){
        while(2*index+1<size){
            int maxIndex=2*index+1;
            if(maxIndex+1<size&&array[maxIndex]<array[maxIndex+1]){
                maxIndex++;
            }
            if(array[index]>=array[maxIndex]){
                break;
            }
            swap(array,maxIndex,index);
            index=maxIndex;
        }
    }


    //希尔排序
    //时间复杂度：O(n） O(n^2)
    //空间复杂度：O(1)
    //稳定性：不稳定
    public static void shellSort(long[] array){
        int gap=array.length/2;
        while(true){
            insertSortGap(array,gap);
            if(gap==1){
                break;
            }
            gap/=2;
        }
    }
    private static void insertSortGap(long[] array,int gap){
        for(int i=gap;i<array.length;i++){
            long key=array[i];
            int j;
            for(j=i-gap;j>=0;j=j-gap){
                if(key<array[j]){
                    array[j+1]=array[j];

                }else{
                    break;
                }
            }
        }
    }





    //测试所有的情况
    //1.随机生成的乱序数
    //2.已经有序
    //3.已经逆序
    //4.完全相等
    //5.测试不同规模的数据（10个/1000个）
    public static long[] 构建随机数组(){
        Random random=new Random(20201020);
        long[] array=new long[10];
        for(int i=0;i<10;i++){
            array[i]=random.nextInt(100);

        }
        return array;

    }

    public static long[] 构建完全有序数组(){
        long[] array=构建随机数组();
        Arrays.sort(array);
        return array;

    }

    public static long[] 构建完全逆序数组(){
        long[] array=构建完全有序数组();
        swap(array,0,9);
        swap(array,1,8);
        swap(array,2,7);
        swap(array,3,6);
        swap(array,4,5);
        return array;
    }
    public static long[] 构建完全相等的数组(){
        long[] array=new long[10];
        for(int i=0;i<10;i++){
            array[i]=9;
        }
        return array;
    }
    public static long[] 构建随机数组_带个数(int n){
      Random random=new Random(20201020);
      long[] array=new long[n];
      for(int i=0;i<n;i++){
          array[i]=random.nextInt(100);

      }
      return array;
    }
    public static long[] 构建完全有序的随机数组_带个数(int n){
        long[] array=构建随机数组_带个数(n);
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        //long[] a1=构建随机数组_带个数(10);
        long[] a2=构建完全逆序数组();
        bubbleSort(a2);




    }
}
