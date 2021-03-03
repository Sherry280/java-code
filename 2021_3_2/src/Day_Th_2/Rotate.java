package Day_Th_2;

import java.util.Arrays;

public class Rotate {
    /**
     * 将一个数组进行旋转，K次，不论是左旋还是进行右旋
     */
    public static void rotate4(int[] arr,int k) {
        //确定移动次数
        k %= arr.length;
        //将整个数组逆序
        reserve(arr,0,arr.length - 1);
        //将前k个逆序
        reserve(arr,0,k-1);
        //从下标k到数组长度之间逆序
        reserve(arr,k,arr.length - 1);
    }
    //逆序
    public static void reserve(int[] arr,int start,int end) {
        while(start < end) {
            int tmp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = tmp;
        }
    }

    public static int[] rotate2(int[] array,int k){
        int newK=k%array.length;
        while(newK>0){
            int temp=array[array.length-1];
            for(int i=array.length-1;i>0;i--){
                array[i]=array[i-1];
            }
            array[0]=temp;
            newK--;
        }
        return array;
    }
    public static int[] rotate1(int[] array,int k){
        int newK=k%array.length;
        int temp=0;
        for(int i=0;i<array.length;i++){
            //让temp先保存最后一个元素
            temp=array[array.length-1];
            //进行数组的整个一遍移动过程
            for(int j=array.length-2;j>=0;j--){
                array[j+1]=array[j];
            }
            //要将最后的元素放到首位，这样一遍才进行完成
            array[0]=temp;
        }
        return array;
    }
    public static int[] rotate(int[] array,int k){
        int newK=k%array.length;
        int[] newArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            int newP=(i+newK)%array.length;
            newArray[i]=array[newP];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int k=3;
         rotate4(array, k);
        System.out.println(Arrays.toString(array));

    }
}
