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
        list.remove(3);
        System.out.println("list="+list);

        list.get(0);
        System.out.println("list="+list);

        list.set(2,200);
        System.out.println("list="+list);

        try{
            list.get(-1);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        //确保会发生扩容
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("list="+list);
        System.out.println("size="+list.size());
        list.add(11);
        System.out.println("list="+list);
        System.out.println("size="+list.size());


        List list2=new ArrayList(list);
        System.out.println("list2="+list);
        System.out.println("size2.size="+list2.size());

        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
