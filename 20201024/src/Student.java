

public class Student {

    public  String name;
    private int age;


    public Student(){
        this("mimi",19);
        System.out.println("student()!!");

    }
    public Student(String name,int age){
//        this("mi",22);


        this.name=name;
        this.age=age;
        System.out.println("Student(String)");
    }
    public  void Student1(String name){
        System.out.println("正在上学！");

    }

    public static void main(String[] args) {
        Student stu1=new Student();




    }


}

















