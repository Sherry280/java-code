package day3;

class Base{
    public Base(String s){
        System.out.print("B");
    }
}

public class Alpha extends Base{

    public Alpha(String s) {
        super(s);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Alpha("C");
    }
}













//class Person{
//    private String name;
//    int age=0;
//
//}
//public class Alpha extends Person{
//    public String grade;
//
//    public static void main(String[] args) {
//        Alpha p= (Alpha) new Person();
//        System.out.println(p);
//
//    }
//}









//class Base{
//    Base(){
//        System.out.print("Base");
//    }
//}
//public class Alpha extends Base{
//    public static void main(String[] args) {
//        Alpha alpha = new Alpha();
//        Base base = new Base();
//    }
//}
