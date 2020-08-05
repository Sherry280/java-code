import java.util.List;

class ListNode{
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data){
        this.data=data;
    }
}

public class RealListNode {
    public ListNode head;
    public ListNode tail;
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
        }else{
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
        }else{
            this.tail .next=node;
            node.prev=this.tail;
            this.tail=node;
        }

    }
    //打印
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //在任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        if(index<0||index>size()) return;

        ListNode cur=searchIndex(index);
        ListNode node=new ListNode(data);
        node.next=cur;
        node.prev=cur.prev;
        cur.prev.next=node;
        cur.prev=node;


    }
    public ListNode searchIndex(int index){
        ListNode cur=this.head;
        while(index>0){
            cur=cur.next;
            index--;
        }
        return cur;

    }
    public int size(){
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;

    }

    //删除第一次出现的关键字为key的节点
    public void remove(int key){
        ListNode cur=this.head;
        while(cur!=null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
                return;
            }else{
                cur=cur.next;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head;
        while(cur!=null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur=cur.next;

        }
    }
    //清空链表
    public void clear(){
        ListNode cur=this.head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur.prev=null;
            cur=curNext;
        }
        this.head=null;
        this.tail=null;
    }


}
