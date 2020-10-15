public class heap {
    public static void adjustDown(int[] array,int size,int index) {
        while (true) {
            //1.先判断下标的合法性
            int leftIndex = 2 * index + 1;
            if (leftIndex >= size) {
                break;
            }
            //下标现在合法了
            //2.找最小的节点
            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex <size && array[rightIndex] <array[leftIndex]) {
                minIndex = rightIndex;
            }

            //3.判断最小的孩子结点和父亲结点的大小
            int parentIndex = (leftIndex - 1) / 2;
            if (array[minIndex] > array[parentIndex]) {
                break;
            }
            //4.交换父亲结点和最小孩子结点的值
            int t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            //5.将index作为下标继续循环
            index = minIndex;
        }
    }


    public static void adjustUp(int[] array,int size,int index) {
        while (true) {

            //1.先判断index是否为根
            if (index == 0) {
                break;
            }
            //2.找到父亲的结点
            int parentIndex = (index - 1) / 2;
            if (array[parentIndex] < array[index]) {
                break;
            }
            //3.交换
            int t = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = t;

            //4.继续循环
            index = parentIndex;

        }
    }

    public static void createHeap(int[] array,int size){
        //找到最后一个结点
        int lastIndex=size-1;
        //找最后一个结点的父亲结点
        int parentIndex=(lastIndex-1)/2;
        for(int i=lastIndex;i>=0;i--){
            adjustDown(array,size,i);
        }
    }

    public static void main(String[] args) {
        heap h=new heap();
        int[] array={1,4,3,5,2,6,8,7,9,8};
        h.createHeap(array,10);



    }



}
