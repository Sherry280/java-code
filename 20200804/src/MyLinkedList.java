
class Node{
    public Node next;
    public int data;
    public Node prev;
    public Node(int data){
        this.data =data;
    }

}


public class MyLinkedList {
    public Node head;
    public Node tail;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;

    }
    //尾插
    public void addLast(int data){
        Node node=new Node(data);
        Node cur=this.head;
        if(this.head==null){
            this.head=node;
        }else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }

    }



    //任意位置插入法
    public void addIndex(int index,int data){
        if(index<0||index>getLength()) return;
        if(index==0){//头插
            addFirst(data);
            return;
        }
        if(index==this.getLength() ){//尾插法
            addLast(data);
            return;
        }
        Node cur=searchPrev(index);
        Node node=new Node(-1);
        node.next=cur.next;
        cur.next=node;

    }
    //求链表的前驱节点
    public Node searchPrev(int index){
        Node cur=this.head;
        int count=0;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;//此时cur保存的是index-1的引用
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
    public void diaplay(){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }




    //删除链表中所有值为key的节点
    public void removeAllKey(int key){
        Node cur=this.head.next;//代表要删除的节点
        Node prev=this.head;//代表要删除节点的前驱
        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }

        }
        if(this.head.data==key){
            this.head=this.head.next;
        }


    }
    //删除第一次出现的关键字key
    public void remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    //删除头节点
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //删除的不是尾节点
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
                return;
            } else {
                cur = cur.next;
            }
        }
    }





//        if(this.head==null) return;
//        if(this.head.data==key){
//            this.head=this.head.next;
//            return;
//        }
//        Node prev=searchPrevNode(key);
//        if(prev==null){
//            System.out.println("没有找到你要删除的数字");
//            return ;
//        }
//        Node cur=this.head;
//        Node del=cur.next;
//        cur.next=del.next;

    //查找前驱
    public Node searchPrevNode(int key){
        Node cur=this.head;
        while(cur.next!=null){
            if(cur.next.data==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;

    }
    //反转一个单链表
    public Node reverseList(){
        Node newHead=null;//新头节点
        Node prev=null;//反转节点的前驱
        Node cur=this.head;//当前需要反转的节点
        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    //遍历一次单链表，求中间元素
    public Node middleNode(Node head){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    //输出链表倒数第K个节点
    public Node findKthTotail(Node head,int k){
        if(k<=0||head==null) return null;
        Node fast=this.head;
        Node slow=this.head;
        while(k-1>0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                System.out.println("k过大");
                return null;
            }
        }
        for(int i=0;i<k-1;i++){
            if(fast==null){
                return null;
            }else{
                fast=fast.next;
            }
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }
    //将一个链表分为两部分，左边部分比K小，右边部分比K大
    public Node partition(int x){
        Node bs=null;
        Node be=null;
        Node as=null;
        Node ae=null;
        Node cur=this.head;
        while(cur!=null){
            if(cur.data<x){
                if(bs==null){
                    //第一次进行插入  尾插
                    bs=cur;
                    be=bs;
                }else{
                    be.next=cur;
                    be=cur;

                }


            }else{
                if(as==null){
                    as=cur;
                    ae=as;


                }else{
                    ae.next=cur;
                    ae=cur;

                }
            }
            cur=cur.next;
        }
        if(bs==null){
            return as;

        }
        be.next=as;
        if(as==null){
            ae.next=null;
        }
        return bs;


    }
    //排好序的单链表，删除重复的节点(在一个排序的链表中，存在重复的结点，
    // 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针)
    public Node removeAllKey1(Node head,int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    //删除头节点
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //删除的不是尾节点
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
            }
                cur = cur.next;

        }
        return head;
    }



    //输入两个链表，找出它们的第一个公共结点

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node detectCycle(Node head){
        if(head==null||head.next==null){
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null||fast.next!=null){
            fast=fast.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow=this.head;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
//        if(fast==slow){
//            return true;
//        }
        //return false;

    }






    //判断是否有环
    public boolean hasCycle(Node head){
        if(head==null||head.next==null){
            return false;
        }
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null||fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(fast==slow){
            return true;
        }
        return false;
    }





    //判断链表是否为回文结构
    public boolean chkPalindrome() {
        if (this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext != null) {
                cur.next = slow;
                slow = cur;
                cur = curNext;
            }
            while (this.head != slow) {
                if (this.head.data != slow.data) {
                    return false;
                } else {
                    cur.next = slow;
                    slow = cur;
                    cur = curNext;

                }
                this.head = this.head.next;
                slow = slow.next;
            }

        }
        return true;
    }



}
