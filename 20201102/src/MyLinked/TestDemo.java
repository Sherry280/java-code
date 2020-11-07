package MyLinked;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(90);
        myLinkedList.addLast(88);
        myLinkedList.addLast(7);
        myLinkedList.addFirst(100);//100 90 80 7 100
        myLinkedList.addLast(100);

        myLinkedList.display();


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
