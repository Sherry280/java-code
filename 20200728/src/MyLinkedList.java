

class Node{
    public int dada;
    public Node next;

    public Node(int data){

        this.dada=data;
    }
}

public class MyLinkedList {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }


    //尾插法
    public void addEnd(int data){
        Node node=new Node(data);
        Node cur=this.head;
        if(this.head==null){
            this.head=node;

        }else{
           while(cur.next!=null){
               cur=cur.next;
           }
           cur.next=node;
        }
    }
    //展示
    public void diaPlay(){
        Node cur=this.head;
        while (cur!=null) {
            System.out.println(cur.dada + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    // //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){

        if(index<0||index>getLength()){
            System.out.println("该位置不合法");
            return ;
        }
        if(index==0){
            //头插
            addFirst(data);
            return;

        }
        if(index==this.getLength()){
            //尾插法
            addEnd(data);
            return;

        }
        Node cur=searchPrev(index);
        //cue此时保存的就是index-1位置的节点的引用
        Node node=new Node(data);
        node.next=cur.next;
        cur.next=node;


    }
    public int getLength(){
        int count=0;
        Node cur=this.head;
        if(cur!=null){
            count++;
            cur=cur.next;

        }
        return count;

    }
    public Node searchPrev(int index){
        Node cur=this.head;
        int count=0;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;

    }
    //删除第一次出现的关键字key
    public void remove(int key){
        if(this.head==null){
            return;
        }
        if(this.head.dada==key){
            this.head=this.head.next;
            return;
        }
        Node cur=searchPrevNode(key);
        if(cur==null){
            System.out.println("没有你要删除的数字");
            return;
        }
        Node del=cur.next;
        cur.next=del.next;




    }
    public Node searchPrevNode(int key){
        Node cur=this.head;
        while(cur.next!=null){
            if(cur.next.dada == key){
                return cur;
            }
            cur=cur.next;
        }
        return null;

    }



}
