public class Test5 {
    //比较大小的重载
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,int c){
        double max1=max(a,b);
        return((max1>c)?max1:c);


    }

    public static void main(String[] args) {
        int a=15;
        int b=6;
        System.out.println(max(a, b));
        System.out.println(max(1.3, 6.7, 5));


    }






}
