package MyLinked;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(90);
        myLinkedList.addLast(88);
        myLinkedList.addLast(7);
        myLinkedList.addFirst(100);

        myLinkedList.display();
        System.out.println();

        myLinkedList.remove(88);
        myLinkedList.display();





    }
















}
