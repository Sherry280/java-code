package NewList;

class MyLinkedList {
    //构造一个类结点
    private class Node{
        int val;
        Node prev;
        Node next;

        Node(int x){
            this.val=x;
        }

    }


    private Node head;
    private Node tail;
     int size;

        //初始化
    /** Initialize your data structure here. */
    public MyLinkedList() {
        int size=0;
        head=new Node(0);
        tail=new Node(0);
        head.next=tail;
        tail.prev=head;


         }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index<0||index>size+1){
            return -1;
        }
        Node cur=head;
        if(int i=0;i<index+1;i++){
            cur=cur.next;
        }
        return cur.val;


    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }
}
