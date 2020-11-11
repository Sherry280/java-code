package MyHashTable;

public class MyHashTable {
    //实现一个HashTable首先需要一个数组
    private Node[] array=new Node[11];
    //维护哈希表中所有元素的个数
    private int size;

    //插入操作
    public boolean insert(Integer key){
        //1.把对象转为int类型
        int hashValue=key.hashCode();


        //2.把hashValue转成合法的下标
        int index=hashValue%array.length;

        //3.遍历index位置处的链表，确定key在不在元素中
        Node current=array[index];
        while(current!=null){
            if(key.equals(current.key)){
                return false;
            }

            current=current.next;
        }


        //4.把key装进结点中，并插入到对应的链表中
        Node node=new Node(key);
        node.next=array[index];
        array[index]=node;

        //5.维护元素的个数
        size++;

        //6.通过维护负载因子，进而维护较低的负载因子
        if(size/array.length*100>75){
            dilatation();
        }
        return true;
    }
    public void dilatation(){
        Node[] newArray=new Node[array.length*2];
        //把原来的元素搬过来，但是不能按链表搬，因为保存元素的下标和数组长度有关
        //数组的长度变了，下标也会变化，所以要重新计算下标
        for(int i=0;i<array.length;i++){
            Node current=array[i];
            while (current!=null){
                Integer key=current.key;
                int hashValue=key.hashCode();
                int index=hashValue%newArray.length;
                Node node=new Node(key);
                node.next=newArray[index];
                newArray[index]=node;

                current=current.next;

            }
        }
        array=newArray;
    }


    //删除操作
    public boolean  remove(Integer key){
        //1.采用hashCode转为int类型
        int hashValue=key.hashCode();

        //2.得到合法的下标
        int index=hashValue%array.length;

        Node prev=null;
        Node current=array[index];
        while(current!=null){
            //删除操作
            if(key.equals(current.key)){
                if(prev!=null){
                    prev.next=current.next;
                }else{
                    //prev为null,删除的是头节点
                    array[index]=current.next;
                }
                size--;
                return true;

            }
            prev=current;
            current=current.next;

            }
        return false;




    }




    //包含
    public boolean contains(Integer key){
        int hashValue=key.hashCode();
        int index=hashValue%array.length;
        Node current=array[index];
        while(current!=null){
            if(key.equals(current.key)){
                return true;
            }
            current=current.next;
        }
        return false;

    }







}
