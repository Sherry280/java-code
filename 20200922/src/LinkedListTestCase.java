public class LinkedListTestCase {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add(0,33);
        list.add(1);
        list.add(56);
        System.out.println(list);
        list.add(0,1000);

        Iterator it= (Iterator) list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }







}
