package day4;



class Person{
    public static void prt(String s){
        System.out.println(s);
    }
    Person(){
        prt("A Person");
    }
    Person(String name){
        prt("A Person name is:"+name);
    }
}


public class Chinese extends Person{
    Chinese(){
        super();//调用父类的无参构造方法（1）
        prt("A chinese");//（4）

    }
    Chinese(String name){
        super(name);//调用父类具有相同形参的构造方法（2）
        prt("his name is:"+name);
    }
    Chinese(String name,int age){
        this(name);//调用当前子类中具有相同形参的构造方法（3）
        prt("his age is:"+age);

    }

    public static void main(String[] args) {
        Chinese cn=new Chinese();
        cn=new Chinese("zhiwen");
        cn=new Chinese("zhiwen",38);

    }

//A Person
//A chinese
//A Person name is:zhiwen
//his name is:zhiwen
//A Person name is:zhiwen
//his name is:zhiwen
//his age is:38



}
