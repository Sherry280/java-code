public class Test {
    public static void main(String[] args) {
        RealListNode realListNode=new RealListNode();
        realListNode.addIndex(0,4);
        realListNode.addIndex(1,6);
        realListNode.addIndex(2,6);
        realListNode.addIndex(3,44);
        realListNode.display();

        realListNode.addLast(6);
        realListNode.display();

        realListNode.remove(6);
        realListNode.display();

        realListNode.removeAllKey(6);
        realListNode.display();


    }

}
