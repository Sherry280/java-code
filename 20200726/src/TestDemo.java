



//class Test {
//
//    public String toString() {
//
//        System.out.print("aaa");
//
//        return "bbb";
//
//    }
//}
// class Test{
//    static int cnt = 6;
//    static{
//        cnt += 9;
//    }
    //public static void main1(String[] args){
        //System.out.println("cnt =" + cnt);
    //}
//    static{
//        cnt /=3;
//    };
//}
//private int count;
class MyValue{
    public int val;
}


public class TestDemo {
    public static void swap(MyValue a,MyValue b){
        int tmp=a.val;
        a.val=b.val;
        b.val=tmp;
    }


    public static void main(String[] args) {

        MyValue myValue1=new MyValue();
        myValue1.val=10;
        MyValue myValue2=new MyValue();
        myValue2.val=20;
        swap(myValue1,myValue2);
        System.out.println(myValue1.val+"  "+myValue2.val);
    }




        //System.out.println(new Test());
//        TestDemo test=new TestDemo(88);
//
//        System.out.println(test.count);




//        Test t=new Test();
//
//        System.out.println(Test.cnt);


//

//    TestDemo(int a) {
//
//        count=a;
//
//    }


}
