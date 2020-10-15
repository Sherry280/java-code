public class MyPriorityQueue {
    private Integer[] array;
    private int size;
    
    public MyPriorityQueue(){
        array=new Integer[100];
        size=0;
        
    }
    //得到element下标的元素
    public Integer element(){
        if(size==0){
            throw new RuntimeException("空了");
        }
        return array[0];
    }

    //删除元素
    public Integer remove(){
        if(size==0){
            throw new RuntimeException("空的");
        }
        int e=array[0];
        array[0]=array[size-1];
        size--;
        adjustDown(0);
        return e;
    }
   public void adjustDown(int index){
        while(true){
            int leftIndex=2*index+1;
            if(array[leftIndex]>=size){
                break;
            }
            int minIndex=leftIndex;
            int rightIndex=leftIndex+1;
            if(rightIndex<size&&array[rightIndex]<array[leftIndex]){
                minIndex=rightIndex;
            }
            int t=array[index];
            array[index]=array[rightIndex];
            array[rightIndex]=t;

            index=minIndex;
        }
   }

    public void add(Integer e){
        array[size]=e;
        size++;
        adjustUp(size-1);
    }
    private void adjustUp(int index){
        while (true){
            if(index==0){
                break;
            }
            int parentIndex=(index-1)/2;
            if(array[parentIndex]<=array[index]){
                break;
            }
            int t=array[index];
            array[index]=array[parentIndex];
            array[parentIndex]=t;

            index=parentIndex;
        }

    }

    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue=new MyPriorityQueue();
        //int[] array={1,4,3,5,6};
        myPriorityQueue.add(1);
        myPriorityQueue.add(4);
        myPriorityQueue.add(3);
        myPriorityQueue.add(5);
        myPriorityQueue.add(6);

        System.out.println(myPriorityQueue.element());

    }

    
}
