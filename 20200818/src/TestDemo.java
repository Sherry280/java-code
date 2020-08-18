


public class TestDemo {
    static class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
        }

        public Node(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("arr can to be empty");
            }
            this.data = arr[0];
            Node cur = this;
            for (int i = 1; i < arr.length; i++) {
                cur.next = new Node(arr[i]);
                cur = cur.next;
            }

        }

        @Override
        public String toString() {
            StringBuilder res=new StringBuilder();
            Node cur=this;
            while(cur!=null){
                res.append(cur.data+"->");
                cur=cur.next;
            }
            res.append("NULL");
            return res.toString();
        }
    }


    //给定一个链表(不带头结点)，删除链表的倒数第K个节点，并且返回链表的头结点。
    public  Node removeNthFromEnd(Node head,int k){
        //当链表为空或者要删除的节点小于0时，直接返回头节点
        if(head==null||k<0){
            return head;
        }
        //建立一个虚拟的头节点，因为要删除的节点也可能是头节点
        Node newHead=new Node(-1);
        newHead.next=head;
        Node p=newHead,q=newHead;
        //p指针和q指针先跑k次
        for(int i=0;i<k;i++){
            if(p==null){
                return head;
            }else{
                p=p.next;
            }
        }
        //p,q一起往前跑，直到p.next为空，p所指的下一个节点就是要删除的节点
        while(p.next!=null){
            p=p.next;
            q=q.next;

        }
        q.next=q.next.next;
        return newHead.next;
    }




    //给定一个不带头结点的单链表，对链表进行插入排序(从小到大排序). 注意：节点整体移动，不是数值域的交换
    public static void main(String[] args) {
        int[] arr={5,3,6,7,0,8};
        Node head=new Node(arr);
        TestDemo testDemo=new TestDemo();
        head=testDemo.removeNthFromEnd(head,3);
        System.out.println(head.toString());




    }












}
