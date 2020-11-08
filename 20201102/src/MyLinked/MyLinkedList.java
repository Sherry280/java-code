package MyLinked;

public class MyLinkedList {
    public  Node head;

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
        if(head==null){
            this.head=node;
        }else {
            while (cur.next != null) {//cur
                cur = cur.next;
            }
            cur.next = node;
        }


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

  //反转一个单链表
    public Node reverseList(){
        Node newHead=null;
        Node prev=null;
        Node cur=this.head;
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
    //反转之后进行打印的时候，就不能采用前边的打印方式了
    public void display2(Node newHead){
        Node cur=newHead;
        while ((cur!=null)){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }


    //3.给定一个带头节点的非空单链表，返回链表的中间节点，如果有两个中间节点，则返回第二个结点
    public Node middleNode(){
        Node fast=this.head;
        Node slow=this.head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

        //4.输入一个链表，输出该链表的倒数第k个结点
    public Node findKthToTail(int k){
        if(k<0||head==null){
            return null;
        }
        //定义两个引用，fast先走k-1步，让偶让fast和slow同时开始走
        Node fast=this.head;
        Node slow=this.head;
        while(k-1>0){
            if(fast.next!=null) {
                fast = fast.next;
                k--;
            }else{
                System.out.println("k过大");
                return null;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;

        }
        return slow;

    }


    //6.编写代码，以给定值x为基准，将链表分割为两部分，所有小于x的排在大于x的节点的前面。
    public Node partition(int x){
        Node bs=null;
        Node be=null;

        Node as=null;
        Node ae=null;

        Node cur=this.head;
        while(cur!=null){
            if(cur.data<x){
                //第一次插入
                if(bs==null){
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
        if(as!=null){
            ae.next=null;
        }
        return as;
    }

    //7.在一个排序的链表中，存在重复的节点，请删除该链表中重复的节点，重复的节点不保留，返回链表的头指针。
    public Node deleteDuplication(){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        Node cur=this.head;

        while(cur!=null){
            if(cur.next!=null&&cur.data==cur.next.data){
                //相等的时候
                while(cur.next!=null&&cur.data==cur.next.data){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                tmp.next=cur;
                tmp=cur;
                cur=cur.next;

            }
        }
        tmp.next=null;//进行这一步的作用就是要保证不出现死循环
        return newHead.next;

    }

    //8.判断链表是否为回文结构
    public boolean chkPalindrome(){
        //第一步：先找到中间节点
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //第二步：对链表进行翻转
        Node cur=slow.next;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }

        //第三步：从两边开始向中间遍历，判断值是否相等
        while(this.head!=slow){//还没有相遇的时候
            if(this.head.data!=slow.data){
                return false;
            }
            //专门为偶数设计的
            if(this.head.next==slow){
                return true;
            }
            this.head=this.head.next;
            slow=slow.next;
        }
        return true;
    }

    //10.判断链表中是否有环
    public boolean hasCycle(){
        //首先定义两个引用，让一个走一步，一个走两步
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }

        }
        return false;
    }



    //11.给定一个链表，返回链表入环的第一个节点，如果无环，则返回null
    public Node detectCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        //fast=this.head;
        slow=this.head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;





    }









}
