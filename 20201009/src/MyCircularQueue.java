public class MyCircularQueue {

    private final int[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;

    public MyCircularQueue(int k){
        array=new int[k];
        size=0;
        frontIndex=0;
        rearIndex=0;
    }

    //向循环队列尾部插入一个元素，成功返回true;
    public boolean enQueue(int value){
        if(size==array.length){
            return false;
        }
        array[rearIndex]=value;
        size++;
        rearIndex++;
        if(rearIndex==array.length){
            rearIndex=0;
        }

        return true;
    }
    //从队首中删除一个元素，删除成功返回true
    public boolean deQueue(){
        if(size==0){
            return false;
        }
        size--;
        frontIndex++;
        if(frontIndex==array.length){
            frontIndex=0;
        }
        return true;
    }

    //返回队首元素
    public int Front(){
        if(size==0){
            return -1;
        }
        return array[frontIndex];
    }

    //返回队尾元素
    public int rear(){
        if(size==0){
            return -1;
        }
        int index=rearIndex-1;
        if(index==-1){
            index= array.length-1;

        }
        return array[index];
    }

    //队列是否满了
    public boolean isFull(){
        return size==array.length;
    }

    //队列是否为空
    public boolean isEmpty(){
        return size==0;
    }


    public static void main(String[] args) {
        MyCircularQueue cir=new MyCircularQueue(9);
        cir.enQueue(8);
        cir.enQueue(7);
        cir.enQueue(6);
        cir.enQueue(5);
        cir.enQueue(4);

        System.out.println(cir.deQueue());
        System.out.println(cir.isEmpty());
        System.out.println(cir.rear());
        System.out.println(cir.Front());
        System.out.println(cir.isFull());



    }




}
