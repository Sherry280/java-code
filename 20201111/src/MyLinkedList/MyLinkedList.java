package MyLinkedList;

public class MyLinkedList {
    public  Node head;
    //头插法
    public void addFirst(int key){
        Node node=new Node(key);
        node.next=head;
        this.head=node;

    }
    //尾插法
    public void addLast(int key){
        Node node=new Node(key);
        Node current=this.head;
        if(head==null){
            this.head=node;
        }else {
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;

//            while (current != null) {
//                if (current.next == null) {
//                    current.next = node;
//                }
//                current = current.next;
//            }
        }


    }
    public void display(){
        Node current=this.head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    //任意位置进行插入
    public void addIndex(int index,int key){
        if(head==null){
            addFirst(key);
        }
        if(index==getLength()){
            addLast(key);
        }
        //先要遍历找到要插入位置的前驱节点
        Node cur=searchPrev(index-1);
        Node node=new Node(key);
        node.next=cur.next;
        cur.next=node;





    }
    public Node searchPrev(int index){
        Node current=this.head;
        int count=0;
        while(count<index){
            current=current.next;
            count++;
        }
        return current;
    }
    public int getLength(){
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;

        }
        return count;
    }



    //删除操作 删除第一次出现的数字12
    public void remove1(int key){
        if(head.data==key){
            this.head=this.head.next;
            return;

        }
        Node cur=searchPrevNode(key);
        if(cur==null){
            //删除的是头节点
            System.out.println("没有找到你要删除的节点");
            return;
        }
            cur.next=cur.next.next;



    }
    public void remove(int key){
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        Node cur=searchPrevNode(key);
        if(cur==null){
            System.out.println("没有找到你要删除的节点");
            return;
        }else{
            cur.next=cur.next.next;
        }





    }
    //找到要删除的节点的前驱节点
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


    //查找关键字是否包含在链表中   so  easy!
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

    //删除所有值相同的key的节点
    public void removeAllKey(int key){
        Node prev=this.head;
        Node cur=this.head.next;

        while(cur!=null){
            if(cur.data==key){
                prev.next=cur.next;//忘记写了
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }

        }
        //删除的是头节点
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }


    //反转一个链表
    public Node reverseList(){
        Node newHead=null;
        Node prev=null;
        Node cur=this.head;
        while(cur!=null){
            Node curNext=cur.next;
            if(cur.next==null){
                 newHead=cur;
            }

            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;

    }
    public void display2(Node newHead){
        Node cur=newHead;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();

    }
    //给定一个带有头节点的非空单链表，返回链表的中间节点，如果有两个节点，则返回第二个节点
    public Node middleNode(){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    //输入一个单链表，返回它的倒数第k个节点
    public Node findKthToTail(int k){
        if(k<0||k>getLength()){
            System.out.println("下标越界");
            return null;
        }
        Node fast=this.head;
        Node slow=this.head;
        //k=3;3-1=2
        //让fast先走k-1步
        while(k-1>0){
            fast=fast.next;
            k--;
        }
        //然后让两个一块走
        while(fast!=null&&fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;


    }

    //以给定值x为基准，将链表分割为两部分，所有小于x的节点排在大于x的节点的右边
    public Node partition(int key){
        Node bs=null;
        Node be=null;

        Node as=null;
        Node ae=null;

        Node cur=this.head;
        while(cur!=null){
            if(cur.data<key){
                if(bs==null){
                    bs=cur;
                    be=bs;
                }else{
                    //比x小的前半部分的不是第一次插入
                    be.next=cur;
                    be=cur;

                }
            }else{
                if(as==null){
                    //第一次插入
                    as=cur;
                    ae=as;
                }else{
                    ae.next=cur;
                    ae=cur;
                }
            }
            cur=cur.next;
        }
        //遍历完成，现在进行特殊情况的判断
        if(bs==null){
            return as;//没有比x小的节点
        }
        be.next=as;
        if(as!=null){
            ae.next=null;
        }
        return bs;




    }

    //在一个重复的链表中存在重复的节点，删除所有重复的节点，返回链表的头节点
    public void deleteDuplication(int key){
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
        //走到这，要是还有相等的还没有删除的节点，那么肯定就是头节点了
        if(this.head.data==key){
            this.head=this.head.next;
        }

    }

    //在一个排序的链表中，删除重复的节点
    public Node deleteAllKey(int key){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                while(cur.next!=null&&cur.data==cur.next.data){
                    cur=cur.next;//走到这的时候，cur仍然指向key这个节点，所以需要再向下走一步
                }
                cur=cur.next;
            }else{
                //走到这的时候，cur所指向的节点的data和key不再相等了
                tmp.next=cur;
                tmp=cur;
                cur=cur.next;
            }

        }
        //走到这的时候，如果将链表中的元素全部都删除了，那么还要把最后剩的一个节点的next域置为空
        tmp.next=null;
        return newHead.next;

    }

    //判断链表是否是回文结构
    public boolean chkPalindrome1(){
        if(head==null){
            return false;
        }
        if(this.head.next==null){
            return true;
        }
        //判断是否为回文结构，首先要找到它的中间节点，然后对一边进行反转，然后从两边向中间走，
        // 看能否相遇，如果相遇了，就是回文结构
        Node fast=this.head;
        Node slow=this.head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //slow指向中间节点
        Node cur=slow.next;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;


        }

        while(this.head!=slow){//走到这的时候，两个还没相遇
            if(this.head.data!=slow.data){
                return false;
            }
            //当结点的个数为偶数的时候
            if(this.head.next==slow){
                return true;
            }

            this.head=this.head.next;
            slow=slow.next;

        }
        return true;

    }


    //判断是否为回文结构
    public boolean chkPalindrome(){
        //1.先找到中间节点
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //slow指向中心节点的位置
        //2.进行翻转一半
        Node cur=slow.next;
        while(cur!=null){
            Node curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }

        //3.从两边开始进行查找
        while(this.head!=slow){
            if(this.head.data!=slow.data){
                return false;
            }
            if(this.head.next==slow){
                return true;
            }
            this.head=this.head.next;
            slow=slow.next;
        }
        return false;

    }


    //10.给定一个链表，判断是否有环
    public boolean hasCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            //fast,slow每走一步都要进行判断一下
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }

       return false;

    }


    //11.给定一个链表，返回入环的第一个节点，如果无环，则返回null
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
        //跳出循环有两种退出方式，一种是fast和slow相遇之后退出的，另一种则是不满足循环条件退出的
        if(fast==null||fast.next==null){
            return null;
        }
        //退出方式只剩fast和slow相遇了
        //把fast拉回起始点，让他和slow开始一次走一步，直到相遇的时候
        fast=this.head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;

    }



}
