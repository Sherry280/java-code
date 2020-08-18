package demo;

import com.bit.Demo2;

public class Demo4 extends Demo2 {
//    public void func(){
//        System.out.println(super.a);
//    }
    public void fun(){
        Demo2 demo2=new Demo2();
        System.out.println(super.a);
        System.out.println(super.b);
    }

    public static void main(String[] args) {
        Demo4 demo4=new Demo4();

        System.out.println(demo4.a);
        System.out.println(demo4.b);
    }
}
