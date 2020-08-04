class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data=data;

    }
}

public class ReverseList {
    public Node head;

    public  Node reVerse(){
        Node newHead=new Node(-1);
        Node prev=null;//代表反转节点的前驱
        Node cur=this.head;//当前需要反转的节点
        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
                return newHead;
            }
             cur.next=prev;
            prev=cur;
            cur=curNext ;

        }
        return newHead;

    }
    public void disPlay(Node newHead){
        Node cur=newHead;
        while(cur!=null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void disPlay1(Node newHead){
        Node cur=this.head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
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
//查找中间节点
    public Node middleNode(Node head){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public Node findKthToTail(int k) {

        Node fast = this.head;
        Node slow = this.head;
        if (k < 0 ||head==null) {
            return null;
        }
        while(k-1>0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("K值过大！");
                return null;
            }

        }



        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }



}
