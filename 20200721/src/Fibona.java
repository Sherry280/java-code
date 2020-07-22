public class Fibona {
    public static int fac(int n){
        int f1=1;
        int f2=1;
        int f=0;

        if(n==1||n==2){
            return 1;
        }
        return fac(n-1)+fac(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fac(8));
    }

}
