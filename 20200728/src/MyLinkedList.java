
//单链表的实现
class Node{
    public int dada;
    public Node next;

    public Node(int data){
        this.dada=data;
    }
}

public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
//        if(this.head==null){
//            this.head=node;
//        }else{
            node.next=this.head;
            this.head=node;
        //}
    }


    //尾插法
    public void addEnd(int data){
        Node node=new Node(data);
        Node cur=this.head;
        //第一次插入
        if(this.head==null){
            this.head=node;

        }else{//不是第一次插入
           while(cur.next!=null){
               cur=cur.next;
           }
           cur.next=node;
        }
    }
    //展示
    public void diaPlay(){
        Node cur=this.head;
        while (cur!=null) {
            System.out.print(cur.dada + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index==0){
            //头插
            addFirst(data);
            return;

        }

        if(index<0||index>getLength()){
            System.out.println("该位置不合法");
            return ;
        }

        if(index==this.getLength()){
            //尾插法
            addEnd(data);
            return;

        }
        Node cur=searchPrev(index);
        //cur此时保存的就是index-1位置的节点的引用
        Node node=new Node(data);
        node.next=cur.next;
        cur.next=node;


    }
    //求链表的长度
    public int getLength(){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;

        }
        return count;

    }
    //查找前驱Index-1
    public Node searchPrev(int index){
        Node cur=this.head;
        int count=0;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;

    }
    //删除第一次出现的关键字key
    public void remove(int key){
        if(this.head==null){
            return;
        }
        if(this.head.dada==key){
            this.head=this.head.next;
            return;
        }
        Node cur=searchPrevNode(key);
        if(cur==null){
            System.out.println("没有你要删除的数字");
            return;
        }
        Node del=cur.next;
        cur.next=del.next;




    }
    //求的是前驱节点
    public Node searchPrevNode(int key){
        Node cur=this.head;
        while(cur.next!=null){
            if(cur.next.dada == key){
                return cur;
            }
            cur=cur.next;
        }
        return null;

    }

    /**
      * @Description: 单链表的后两个实现，contains和删除
      * @Param:
      * @return:
      * @Auther: xingyuyu
      * @Date: 2020/7/29
      */
    //查找是否包含关键字key在单链表中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.dada==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除所有的值为key的节点
//    public void removeAllKey(int key){
//        Node cur=this.head;
//        Node prev=this.head;
//        while(cur!=null){
//            if(cur.dada==key){
//                prev.next=cur.next;
//                cur=cur.next;
//            }else{
//                prev=cur;
//                cur=cur.next;
//            }
//
//        }
        public void removeAllKey(int key){
        if(this.head==null) return;

        if(contains(key)) {
            Node prev = this.head;//需要删除的节点的前驱
            Node cur = this.head.next;//当前需要删除的节点

            while (cur != null) {
                if (cur.dada == key) {
                    prev.next = cur.next;
                    cur = cur.next;
                } else {
                    prev = prev.next;
                    cur = cur.next;
                }

            }
            //判断只剩一个的头节点是不是要删除的key
            if (this.head.dada == key) {
                this.head = this.head.next;

            }
        }else {
            System.out.println("没有你要删除的数字");
        }
    }
    //链表清空
    public void clear(){
        this.head=null;
    }



}
