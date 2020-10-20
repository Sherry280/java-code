import java.util.Scanner;

public class Main {

    //求n的p次方
    public static long pow(int n,int p){
        long r=1;
        for(int i=0;i<p;i++){
            r*=n;
        }
        return r;
    }

    private static long 转10进制(String hexString){
        long r=0;
        char[] chars=hexString.toCharArray();
        for(char c:chars){
            int digt=字符转数字(c);
            r=(r+digt)*16;

        }
        return r/16;

    }
    private static int 字符转数字(char c){
        if(c>='0'&&c<'9'){
            return c-'0';
        }else{
            return c-'A'+10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String hexString=sc.nextLine();
            long n=转10进制(hexString);
            System.out.println(n);
        }
    }


}
