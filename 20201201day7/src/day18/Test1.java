package day18;

public class Test1 {
    public String str="6";
    private static int x=100;
    public static void main(String[] args) {
        int a=39;
        Integer s=39;
        System.out.println(a==s);
        Integer s1=Integer.valueOf(39);
        Integer s2=new Integer(39);
        System.out.println(s1==s2);

//        Test1 test1=new Test1();
//        test1.x++;//101
//        Test1 test2=new Test1();
//        test2.x++;//102
//        Test1.x--;//102
//        System.out.println("x="+x);


//        test1.change(test1.str);
//        System.out.println(test1.str);

    }
    public void change(String str){
        str="10";
    }
}
