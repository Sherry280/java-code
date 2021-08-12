package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        boolean flag=false;
       for(int i=0;i<array.length;i++){
           for(int j=0;j<array.length-i-1;j++){
               //从小到大排序
               if(array[j]>array[j+1]){
                   flag=true;
                   swap(array,j,j+1);
               }
           }
           if(!flag){
              break;
           }
       }
    }
    //首先拿第一个元素和后面的所有一个个比较，如果比后面的小就交换，所以始终会保证
    //第一个元素是最大的，然后再从第二个第三个，以此类推，swap方法表示交换两个数字
    //的值。
    public static void bubbleSort2(int[] array){
        boolean flag=false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                //从大到小排序
                if(array[i]<array[j]){
                    flag=true;
                    swap(array,i,j);
                }
            }
            if(!flag){
                break;
            }
        }
    }
    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void bubbleSort3(int[] array){
        int count=array.length-1;
        while(count>0){
            for(int j=0;j<count;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
            count--;
        }
    }
    public static void bubbleSort4(int[] array,int n){
        if(n==1){
            return ;
        }
        if(array==null||array.length==0){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
                swap(array,i,i+1);
            }
        }
        bubbleSort4(array,n-1);

    }

    public static void main(String[] args) {
        int[] array={6,8,4,2,9,12,34,56,87};
        bubbleSort4(array,array.length);
        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(bubbleSort(array)));
//        System.out.println(Arrays.toString(array));
    }
}
