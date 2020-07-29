import com.sun.xml.internal.ws.util.xml.CDATA;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addIndex(0,9);
        myLinkedList.addIndex(1,4);
        myLinkedList.addIndex(2,8);
        myLinkedList.addIndex(0,88);
        myLinkedList.diaPlay();


        myLinkedList.addFirst(1);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(231);
        myLinkedList.diaPlay();
        System.out.println("----------------");

        myLinkedList.removeAllKey(6);
        myLinkedList.diaPlay();
        System.out.println("djokal jdk");


    }
}
