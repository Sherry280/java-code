//抽象类
abstract class Shape1 {
    //抽象方法：被abstract所修饰的方法。抽象方法是没有具体的实现的。
    public abstract void draw();

    public int a;

    public void func() {
        System.out.println("xixi");

    }
}
    class Cycle2 extends Shape1 {
        @Override
        public void draw() {
            System.out.println("Cycle2::♦");
        }


    }







public class TestDemo3 {
    public static void drawMap(Shape1 shape1){
        shape1.draw();
    }
    public static void main(String[] args) {
        Cycle2 cycle2=new Cycle2();
        drawMap(cycle2);
    }










}
