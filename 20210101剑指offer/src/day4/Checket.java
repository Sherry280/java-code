package day4;


class Base{
    Base(){
        System.out.println("Base");
    }
}
public class Checket extends Base{
    Checket(){
        super();//调用父类的构造方法，一定要放在这个方法的首个语句
        System.out.println("Checket");
    }

    public static void main(String[] args) {
        Checket c=new Checket();

    }
//Base
// Checket
}
