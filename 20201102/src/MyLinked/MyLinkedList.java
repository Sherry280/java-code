package MyLinked;

public class MyLinkedList {
    private Node head;

    //头插法
    public  void addFirst(int data){
        //空表的时候
        Node node=new Node(data);
        if (this.head != null) {
            node.next = head;
        }
        head=node;

    }
    public void display(){
        Node cur=this.head;
        while(cur!=null){
            System.out.println(cur.data+"  ");
            cur=cur.next;
        }
    }
    //尾插法
    public  void addLast(int data){
        Node node=new Node(data);
        Node cur=this.head;
        while(cur.next!=null){//cur
            cur=cur.next;
        }
        cur.next=node;


    }
    //任意插
    public  void addIndex(int index,int data){
        //先要判断下标是否合法
        if(index<0||index>getLength()){
            System.out.println("下标不合法");
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==getLength()){
            addLast(data);
            return;
        }
        //现在在中间进行插入
        Node node=new Node(data);
        //找到要插入下标的前一个结点
        Node cur=searchPrev(index-1);
        node.next=cur.next;
        cur.next=node;



    }
    //找到要插入位置index的前一个位置index-1的位置节点
    public Node searchPrev(int index){
        Node cur=this.head;
        int count=0;
        while(count<index){
            cur=cur.next;
        }
        return cur;
    }
    public int getLength(){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }



    //删除第一次出现的key
    public  void remove(int key){
        if(this.head==null){
            return;
        }
        Node cur=searchPrevNode(key);
        //要注意cur是否没有找到。进行判断一下
        if(cur==null){
            System.out.println("没有找到你要删除的下标");
            return;
        }
        cur.next=cur.next.next;




    }
    public Node searchPrevNode(int key){
        Node cur=this.head;
        while(cur!=null){

            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        //没有找到要删的结点
        return null;
    }
    //查找关键字key是否包含在单链表中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;

    }



    //删除所有值为key的结点
    public void removeAllKey(int key){
        //定义一个prev指向要删除的节点的前一个
        //定义一个cur指向要删除的结点
        Node prev=this.head;
        Node cur=this.head.next;

        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        //现在如果有还有和key相等的值，那么一定在头节点
        if(this.head.data==key){
            this.head=this.head.next;
        }

    }


    public void clear(){
        this.head=null;
    }






}
