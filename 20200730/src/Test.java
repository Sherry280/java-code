

public class Test {
    /**
      * @Description: 判断两个链表是否相交
      * @Param:
      * @return:
      * @Auther: xingyuyu
      * @Date: 2020/8/4
      */
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
        while(pl!=null&&ps!=null&&pl!=ps){
            pl=pl.next;
            ps=ps.next;

        }
        if(pl==ps&&pl!=null){
            return pl;
        }
        return null;
    }
    public static void createCut(Node headA,Node headB){
        headA.next=headB.next.next;

    }
    /**
      * @Description: 将两个链表合并为一个新的有序表
      * @Param:
      * @return:
      * @Auther: xingyuyu
      * @Date: 2020/8/4
      */

    public static Node mergeTwoLists(Node headA,Node headB){
        Node newHead=new Node(-1);
        Node tmp=newHead;

        while(headA!=null&&headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                tmp=tmp.next;
                headA=headA.next;
            }else{
                tmp.next=headB;
                tmp=tmp.next;
                headB=headB.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }



    public static void main(String[] args) {
        MyLineked myLineked=new MyLineked();
        myLineked.addFirst(6);
        myLineked.addFirst(7);
        myLineked.addFirst(8);
        myLineked.addFirst(57);
        myLineked.display();



        MyLineked myLineked2=new MyLineked();
        myLineked2.addFirst(7);
        myLineked2.addFirst(47);
        myLineked2.addFirst(57);
        myLineked2.display();
        //createCut(myLineked.head,myLineked2.head);
        //Node ret=getIntersectionNode(myLineked.head,myLineked2.head);
       //System.out.println(ret.data);

        Node ret=mergeTwoLists(myLineked.head,myLineked2.head);
        myLineked.display();






    }



}
