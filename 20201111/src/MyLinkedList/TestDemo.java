package MyLinkedList;

public class TestDemo {

    //1.判断两个链表是否相交
    //首先求出两个链表各自的长度，再求出差值部分，让长的链表先走差值部分的长度，然后让两个链表同时一起走
    public static Node getInsertSectionNode(Node headA,Node headB){
        if(headA==null||headB==null){
            return null;
        }
        //1.求出两个链表的长度
        Node pl=headA;
        Node ps=headB;

        int lenA=0;
        int lenB=0;

        while(pl!=null){//pl走到A链表的尾部
            lenA++;
            pl=pl.next;
        }
        while(ps!=null){//ps也走到B链表的尾部
            lenB++;
            ps=ps.next;
        }

        int len=lenA-lenB;
        if(len<0){
            pl=headB;
            ps=headA;

        }
        len=lenB-lenA;
        while(len>0){//让长的先走两个链表的差值步
            len--;
            pl=pl.next;

        }

        //走到这之时，让两个w
        while(pl!=ps&&pl!=null&&ps!=null){//两个还没相遇
            pl=pl.next;
            ps=ps.next;

        }
        //走到这的时候，有可能两个引用都走到各自链表的尾部
        //两个链表相遇的条件为：两个引用指向同一个节点，并且两个链表不为空
        if(pl==ps&&pl!=null){
            return pl;
        }
        return null;


    }

    public static void createCut(Node headA,Node headB){
        headA.next=headB.next.next;
    }



    //5.将两个有序链表合并为一个新的有序链表，新链表是通过拼接两个给定的链表的结点组成的
    public static Node mergeTwoLists(Node headA,Node headB){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=headA;
                headA=headA.next;

            }else{
                tmp.next=headB;
                tmp=headB;
                headB=headB.next;
            }
        }

        //走到这的时候，肯定有一个链表已经为空了
        if(headA==null){
            tmp.next=headB;
        }
        if(headB==null){
            tmp.next=headA;
        }
        return newHead.next;

    }











    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addLast(7);//12,7
        myLinkedList.addLast(98);
        myLinkedList.addLast(12);//12,7,98,12
        myLinkedList.addFirst(9);//9,12,7,98,12
        myLinkedList.addIndex(0,5);//5,9,12,7,98,12
        myLinkedList.addLast(12);
        myLinkedList.addLast(56);

       // myLinkedList.remove(9);
        myLinkedList.display();
        System.out.println("---------------");


        MyLinkedList myLinkedList1=new MyLinkedList();
        myLinkedList1.addFirst(67);
        myLinkedList1.addFirst(45);
        myLinkedList1.addFirst(2);
        myLinkedList1.addFirst(23);
        myLinkedList1.display();
        System.out.println("-------------------------");

        Node node = mergeTwoLists(myLinkedList.head, myLinkedList1.head);
        System.out.println(node);


//        createCut(myLinkedList.head,myLinkedList1.head);
//        Node node = getInsertSectionNode(myLinkedList.head, myLinkedList1.head);
//        System.out.println(node);


//        myLinkedList.removeAllKey(12);
//        myLinkedList.display();



//        Node node = myLinkedList.partition(12);
//        System.out.println(node);


//        Node node = myLinkedList.findKthToTail(6);
//        System.out.println(node);


        //myLinkedList.display2(myLinkedList.reverseList());

//       Node node = myLinkedList.middleNode();
//        System.out.println(node);
    }
}
