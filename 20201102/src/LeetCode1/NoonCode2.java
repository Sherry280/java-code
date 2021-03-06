package LeetCode1;



public class NoonCode2 {
    //进行链表的复制
    public static Node copyRandomList(Node head){
        if(head==null){
            return null;
        }
        //分为3部分
        //1.进行链表的复制及将链表连在一块
        Node current=head;
        while(current!=null){
            Node curNext=current.next;
            Node newNode=new Node(current.val);
            current.next=newNode;
            newNode=curNext;

            current=current.next;

        }

        //2.处理random，让新的random指向新链表的random
        Node oldCurrent=head;
        while(oldCurrent!=null){
            Node newCurrent=oldCurrent.next;
            if(oldCurrent.random==null){
                newCurrent.random=null;
            }else{
                newCurrent=oldCurrent.random.next;
            }
            oldCurrent=oldCurrent.next.next;


        }


        //3.进行链表的拆分
        Node oldCurrent1=head;
        Node newHead=oldCurrent1.next;
        while(oldCurrent1!=null){
            Node newCurrent=oldCurrent1.next;
            if(newCurrent!=null){
                newCurrent=oldCurrent1.next.next;
            }
            oldCurrent1=oldCurrent1.next;



        }


        return newHead;


    }

    public static void main(String[] args) {
        //测试代码：怎样写一个链表呢？

    }




}
