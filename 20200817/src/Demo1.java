


   class Animal{
       public String name;

       //构造方法
       public Animal(String name){
           this.name=name;

       }
       public void eat(){
           System.out.println(this.name+"正在吃");
       }
   }


   class Cat extends Animal{
//       public String name;
//       public void eat(){
//           System.out.println(this.name+"正在吃");
//       }
       public int age;

       public Cat(String name) {
           super(name);
       }

       public void jump(){
           System.out.println(super.name);
           super.eat();
           System.out.println(this.name+"正在跳！");
       }
   }

   class Bird extends Animal{

       public int age;

       public Bird(String name)
       {
           super(name);
       }


       public  void fly(){
           System.out.println(this.name+"正在飞！");
       }
   }





   public class Demo1{
    protected int b=9;

    public static void main(String[] args) {
        Cat cat=new Cat("小黑");
        cat.eat();
        cat.jump();
    }
   }













