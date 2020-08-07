
 class Animal {
    public String name;
    //构造方法
    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}



class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }
}
// Bird.java
class Bird {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }

    public void fly() {
        System.out.println(this.name + "正在飞 ︿(￣︶￣)︿");
    }

}

public class TestDemo{
    public static void main(String[] args) {
        Cat cat = new Cat("小黑");
        cat.eat("猫粮");
        Bird bird = new Bird("圆圆");
        bird.fly();
    }



}
