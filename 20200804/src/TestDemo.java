public class TestDemo {

    public static Node getIntersectionNode(Node headA,Node headB){
        if(headA==null||headB==null){
            return null;
        }
        int lenA=0;
        int lenB=0;
        Node pl=headA;
        Node ps=headB;
        while(pl!=null){
            lenA++;
            pl=pl.next;
        }
        while(ps!=null){
            lenB++;
            ps=ps.next;
        }
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if(len<0){
            ps=headA;
            pl=headB;
            len=lenB-lenA;
        }
        while(len>0){
            len--;
            pl=pl.next;
        }
        while (pl!=null&&ps!=null&&pl!=ps){
            pl=pl.next;
            ps=ps.next;
        }
        if(pl==ps){
            return pl;
        }
        return null;



    }
    public static  void creatCut(Node headA,Node headB){
        headA.next=headB.next.next;
    }

    public static void main(String[] args) {
       MyLinkedList myLinkedList=new MyLinkedList();
       myLinkedList.addIndex(0,3);
        myLinkedList.addIndex(1,15);
        myLinkedList.addIndex(2,23);
        myLinkedList.addIndex(3,33);
        myLinkedList.diaplay();


        MyLinkedList myLinkedList2=new MyLinkedList();
        myLinkedList2.addIndex(0,5);
        myLinkedList2.addIndex(1,8);
        myLinkedList2.addIndex(2,12);
        myLinkedList2.addIndex(3,15);
        myLinkedList2.addIndex(4,12);
        myLinkedList2.addIndex(5,12);
        myLinkedList2.diaplay();
//        creatCut(myLinkedList.head,myLinkedList2.head);
//        Node ret=getIntersectionNode(myLinkedList.head,myLinkedList2.head);
//        System.out.println(ret.data);
        Node ret=myLinkedList2.detectCycle(null);
        System.out.println(ret);






    }


}
