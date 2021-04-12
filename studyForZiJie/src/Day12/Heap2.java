package Day12;

import java.util.Arrays;

public class Heap2 {
    public static void createHeap(int[] array){
        for(int i=array.length/2;i>=0;i--){
            shiftDown(array,i,array.length);
        }
    }
    //下移交换，把当前节点有效变成一个小堆
    private static void shiftDown(int[] array,int index,int len){
        int leftChild=index*2+1;
        int rightChild=index*2+2;
        if(leftChild>=len){
            return;
        }else if(rightChild<len&&array[rightChild]<array[index]&&array[rightChild]<array[leftChild]){
            //右孩子在范围之内并且应该交换  并且经过交换之后，判断出右孩子为三个节点中最小的一个数字，那么就与父节点进行交换
            swap(array,index,rightChild);
            shiftDown(array,rightChild,len);
        }else if(array[leftChild]<array[index]){
            swap(array,index,leftChild);
            shiftDown(array,leftChild,len);
        }
    }
    private static void swap(int[] array,int m,int n){
        int team=array[m];
        array[m]=array[n];
        array[n]=team;
    }

    public static void heapSort(int[] array){
        System.out.println("原始数组为："+ Arrays.toString(array));
        //临时存储结果
        int[] val=new int[array.length];
        //建堆
        createHeap(array);
        System.out.println("建堆后的序列为："+Arrays.toString(array));
        //进行n次取值建堆，每次取堆顶元素放入到val数组中，最终结果就是一个递增的数组
        for(int i=0;i<array.length;i++){
            val[i]=array[0];//将堆顶元素放入到结果中
            array[0]=array[array.length-1-i];//删除堆顶元素，将末尾元素放入到堆顶
            shiftDown(array,0, array.length-i);
            //将这个堆调整为合法的小堆，注意（逻辑上的）长度有变化

        }

        //数值克隆复制
        for(int i=0;i<array.length;i++){
            array[i]=val[i];
        }
        System.out.println("堆排序后的序列为："+Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] array={5,4,3,6,8,5,23,56};
        heapSort(array);
    }



}
