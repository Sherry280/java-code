package Day0712;

public class TestDemo {
    static void method(){
        System.out.println("888");
        try{

            wrench();
            System.out.println("C");
        }catch (ArithmeticException e){
            System.out.println("D");
        }finally {
            System.out.println("E");
        }
        System.out.println("F");
    }
    static void wrench(){
        throw new NullPointerException();
    }
    public static void main(String[] args) {

        try{
            method();
        }catch (Exception e){
            System.out.println("A");
        }finally {
            System.out.println("B");
        }
    }

}
