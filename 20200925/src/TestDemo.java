public class TestDemo {
    public static void main(String[] args) {
        MyCircularQueue sr=new MyCircularQueue(5);
        sr.enQueue(1);
        sr.enQueue(3);
        sr.enQueue(5);
        sr.enQueue(7);

        System.out.println(sr);


    }
}
