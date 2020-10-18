import java.util.Arrays;

public class TestDemo {

    //将一个Long类型的数打印成单个字符，输出来
    public static int getPos(int n){
        if(n<=9){
            return n;
        }
        int res=0;
        while (n!=0){
            res++;
            n/=10;
        }
        return res;
    }

    public static int[] reverse(long n){
        int t = getPos(20201018);
        int[] array=new int[t];
        for(int i=array.length-1;i>=0;i--){

            array[i]=(int)n%10;
            n/=10;

        }
        return array;
//        for(int i=0;i<t;i++){
//            System.out.println(n%10);
//            n/=10;
//        }
    }

    public static void main(String[] args) {
        TestDemo testDemo=new TestDemo();
        int[] ver = testDemo.reverse(20201018);
        System.out.println(Arrays.toString(ver));
    }
}
