
/**
  * @Description: 理解多态
  * @Param: 
  * @return: 
  * @Auther: xingyuyu
  * @Date: 2020/8/19
  */


class Shape{
    public void draw(){

    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        //Alt+insert
        System.out.println("画一个圆圈！");
    }

}
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个♦方片！");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("❀");
    }
}



public class TestDemo {

    public static void drawMap(Shape shape){
        shape.draw();
    }



    public static void main(String[] args) {
        Shape shape1=new Cycle();//向上转型
        Shape shape2=new Rect();
        Shape shape3=new Shape();
        drawMap(shape1);//发生了多态
        drawMap(shape2);
        drawMap(shape3);
        System.out.println("==========");
        Cycle cycle=new Cycle();
        drawMap(cycle);


    }
}







