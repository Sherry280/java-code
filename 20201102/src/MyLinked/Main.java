package MyLinked;

public class Main {
    private Node head;
    //反转一个链表
    public Node reverseList(){
        Node newHead=null;
        Node prev=null;
        Node cur=this.head;
        while(cur.next!=null){
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















}
