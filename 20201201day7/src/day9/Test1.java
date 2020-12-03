package day9;

public class Test1 {
    String str=new String("hello");
    char[] ch={'a','b'};

    public static void main(String[] args) {
        Test1 test1=new Test1();
        test1.exchange(test1.str,test1.ch);
        System.out.print(test1.str+"and");
        System.out.print(test1.ch);
    }
    public void exchange(String str,char[] ch){
        str="test ok";
        ch[0]='c';
    }

    public static void main2(String[] args) {
        Employee e=new Employee("123");
        System.out.println(e.emp);
    }



    private static void test1(){
        System.out.println("testMethods");
    }

    public static void main1(String[] args) {
        test1();
    }
}
