package MyLinked;

public class TestDemo {
    //12.判断两个链表是否相交
    public static Node getIntersectionNode(Node headA,Node headB){
        //1.先求出两个链表的长度
        Node pl=headA;
        Node ps=headB;
        int lenA=0;
        int lenB=0;

        while(pl!=null){
            lenA++;
            pl=pl.next;
        }
        while(ps!=null){
            lenB++;
            ps=ps.next;
        }
        //走到这时，一定要让pl和ps重新指回来，因为pl和ps现在已经走到了他们所要遍历的链表的尾部了

        // //2.求出两个链表的差值
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if(len<0){
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }

        //现在让长的链表先走差值步
        while(len>0){
            pl=pl.next;
            len--;
        }


        //3.两个引用同时走，如果走的过程中相遇了，则代表链表是相交的
        while(pl!=ps){
            pl=pl.next;
            ps=ps.next;
        }
        if(pl==ps&&pl!=null){
            return pl;
        }
        return null;

    }

    public static void create(Node headA,Node headB){
        headA.next=headB.next.next;

    }


    //5.将两个有序链表合并为一个新的有序链表并返回，新链表是通过拼接给定的两个链表的所有节点组成的。
    public static Node mergeTwoList(Node headA,Node headB){
        //思路：遍历，分别比较两个链表的第一个节点，连接到虚拟节点上
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
        //走到这一步时，肯定有一个链表已经为空了
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return newHead.next;

    }




    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(9);
        myLinkedList.addLast(58);
        myLinkedList.addLast(71);
        myLinkedList.addLast(100);
        myLinkedList.addLast(109);

        MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.addLast(2);
        myLinkedList2.addLast(8);
        myLinkedList2.addLast(67);
        myLinkedList2.addLast(90);

        Node node = mergeTwoList(myLinkedList.head, myLinkedList2.head);
        System.out.println(node);

        //create(myLinkedList.head,myLinkedList2.head);
        //Node node = getIntersectionNode(myLinkedList.head, myLinkedList2.head);
        //System.out.println(node);

        //myLinkedList.display();


        //System.out.println(myLinkedList.deleteDuplication());
        // System.out.println(myLinkedList.partition(80));
        //System.out.println(myLinkedList.findKthToTail(3));


//        Node node = myLinkedList.middleNode();
//        System.out.println(node);


//        Node newHead=myLinkedList.reverseList();
//        myLinkedList.display2(newHead);









//        System.out.println();
//
//        myLinkedList.removeAllKey(100);
//        myLinkedList.display();
//        System.out.println("-------------");
//        myLinkedList.clear();
//        myLinkedList.display();

       // myLinkedList.remove(88);
        //myLinkedList.display();



    }



}
