

public class TestDemo {
    public static void main(String[] args) {
        ReverseList reverselist=new ReverseList();
        reverselist.addIndex(0,8);
        reverselist.addIndex(1,28);
        reverselist.addIndex(2,38);
        reverselist.addIndex(3,48);
        reverselist.disPlay1(null);

       //Node cur= reverselist.reVerse();
        //reverselist.disPlay(cur);

        Node ret=reverselist.findKthToTail(4);
        System.out.println(ret.data);


    }







}
