package Day13;

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
        } else if (array[leftChild] < array[index]) {
            swap(array, leftChild, index);
            shiftDown(array, leftChild, len);
        }
    }
        private static void swap(int[] array,int i,int j){
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
        }


}
