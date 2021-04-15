package Day15;

import java.util.Arrays;

public class Heap {
    public static void createHeap(int[] array){
        for(int i=array.length/2;i>=0;i--){
            shiftDown(array,i,array.length);
        }
    }
    private static void shiftDown(int[] array,int index,int len) {
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;
        if (leftChild >= len) {
            return;
        } else if (leftChild < rightChild && array[rightChild] < array[leftChild] && array[rightChild] < array[index]) {
            swap(array, rightChild, index);
            shiftDown(array, rightChild, len);
        } else if (leftChild < rightChild && array[leftChild] < array[index]) {
            swap(array, leftChild, index);
            shiftDown(array, leftChild, len);
        }
    }
        private static void swap(int[] array,int left,int right){
            int tm=array[left];
            array[left]=array[right];
            array[right]=tm;
        }

        public static void  heapSort(int[] array){
            System.out.println("原始数组的大小为："+ Arrays.toString(array));

            //先创建堆，之后再进行调整
            createHeap(array);
            System.out.println("建堆之后的数组顺序为："+Arrays.toString(array));
            //临时存储结果，最后把结果再放到array中
            int[] arr=new int[array.length];
            for(int i=0;i<array.length;i++){
                //进行n次取值，进行n次堆调整
                //将堆顶元素放入结果中
                arr[i]=array[0];
                array[0]=array[array.length-i-1];
                shiftDown(array,0,array.length-i-1);
            }
            //数组克隆复制
            for(int i=0;i< array.length;i++){
                array[i]=arr[i];
            }
            System.out.println("堆排序后的数组顺序为："+Arrays.toString(array));
        }

    public static void main(String[] args) {
        int[] array={1,3,6,2,66,44,67};
        heapSort(array);



    }

}
