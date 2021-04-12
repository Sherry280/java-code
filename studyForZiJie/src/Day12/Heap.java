package Day12;

import java.util.Arrays;

public class Heap {
    /**
     * 堆
     */
    public static void createHeap(int[] array,int size){
        //找到层序遍历的最后一个节点的下标
        int lastIndex=size-1;
        //找到最后一个节点的父节点的下标
        int lastParentIndex=(lastIndex-1)/2;
        //从[lastParentIndex,0]不断向下调整
        for(int i=lastParentIndex;i>=0;i--){
            adjustDown(array,size,i);
        }
    }

    //向上调整
    private static void adjustDown(int[] array,int size,int index){
        while(true){
            //1.判断index是否是根的节点，如果是根则调整结束
            if(index==0){
                break;
            }
            //2.找到index的父节点
            int parentIndex=(index-1)/2;
            //3.比较父节点和index的值
            //4.只要根节点的值<=index，调整结束
            if(array[parentIndex]<=array[index]){
                break;
            }
            //5.交换父节点和index的值
            int t=array[index];
            array[index]=array[parentIndex];
            array[parentIndex]=t;
            //6.把父节点当作这个index，继续这个大循环
            index=parentIndex;
        }
    }
    public static void heapSort(int[] array){
        System.out.println("原始数组为："+Arrays.toString(array));
        int[] val=new int[array.length];
        createHeap(array,array.length);
        System.out.println("建堆后的序列为："+Arrays.toString(array));

        //进行n次建堆
        for(int i=0;i<array.length;i++){
            val[i]=array[0];
            array[0]=array[array.length-1-i];
            adjustDown(array,0,array.length-i);
        }
        //进行数组复制
        for(int i=0;i<array.length;i++){
            array[i]=val[i];
        }
        System.out.println("堆排序后的数组为："+Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] array={13,5,4,7,9,5,4};
        heapSort(array);
    }

}
