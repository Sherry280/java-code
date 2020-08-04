
class Node{
    public Node next;
    public int data;
    public Node(int data){
        this.data=data;
    }
}



public class MyLineked {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        node.next=this.head;
        this.head=node;
    }
    //展示
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;

        }
        System.out.println();
    }


    




}
