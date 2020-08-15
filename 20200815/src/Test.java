public class Test {

    public static void main(String[] args) {

        int x =5,y=10; //定义两个变量
        int temp = x;//定义第三临时变量temp并提取x值
        x = y;//把y的值赋给x
        y = temp;//然后把临时变量temp值赋给y

        System.out.println("x="+x+"y="+y);



//        int x =5,y=10; //定义两个变量
//
//                x = x + y;        //x(15) = 5 + 10；
//                 y = x - y;        //y(5) = x(15) - 10;
//                 x = x - y;        //x(10) = x(15) - y(5)
//                 System.out.println("x="+x+"y="+y);
//        int x =5,y=10; //定义两个变量
//
//                         x = x^y;
//                 y = x^y;  //y=(x^y)^y
//                 x = x^y;  //x=(x^y)^x
//                 System.out.println("x="+x+"y="+y);



        //int x =5,y=10; //定义两个变量
        //
        //  System.out.println("x="+y+"y="+x); //直接在输出的时候交换
    }
}
