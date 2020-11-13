package MyLinkedList;

public class TestDemo {
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
        myLinkedList.removeAllKey(12);
        myLinkedList.display();



//        Node node = myLinkedList.partition(12);
//        System.out.println(node);


//        Node node = myLinkedList.findKthToTail(6);
//        System.out.println(node);


        //myLinkedList.display2(myLinkedList.reverseList());

//       Node node = myLinkedList.middleNode();
//        System.out.println(node);
    }
}
