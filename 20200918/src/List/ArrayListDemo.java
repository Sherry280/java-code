package List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("list="+list);
        System.out.println("size="+list.size());
        list.add(0,100);
        System.out.println("list="+list);
        System.out.println("size="+list.size());


    }
}
