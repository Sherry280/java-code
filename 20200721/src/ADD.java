public class ADD {
    //求和的重载

    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }


    public static void main(String[] args) {
        System.out.println(add(5, 19));
        System.out.println(add(1.2, 4.5, 7.8));

    }
}
