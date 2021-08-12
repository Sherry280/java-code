package Sort;

import java.util.Arrays;

public class InsertSort {
    public static void insertSort(int[] array){
        if(array==null||array.length<=2){
            return ;
        }
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int position=i;
            for(int j=i-1;j>=0;j--){
                if(array[j]>key){
                    //当前元素比key值大，所以要向后移动，让key插入进来
                    array[j+1]=array[j];
                }
            }
            array[position]=key;
        }
//        if(array==null||array.length<=2){
//            return;
//        }
//        for(int i=1;i<array.length;i++){
//            int key=array[i];
//            int position=i;
//            for(int j=i-1;j>=0;j--){
//                //j代表的元素为array[j]为当前key，i代表的元素的前一个
//                if(array[j]>key){
//                    //将要插入位置的元素向后移动
//                    array[j+1]=array[j];
//                    position--;
//                }
//            }
//            array[position]=key;
//        }
    }

    public static void main(String[] args) {
        int[] array={3,6,2,5,9,7,56,98,34,12};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
