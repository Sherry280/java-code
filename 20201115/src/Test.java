import java.util.Scanner;

public class Test {


    //任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。
    //
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int suNumber=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                count++;
            }
        }
        suNumber=n-count;
        System.out.println(suNumber+" "+count);

    }







    public static boolean sumNine(int n){
        while(n!=0){
            if(n%10==9){
                return true;
            }
            n/=10;


        }
        return false;
    }



    public static void main1(String[] args) {
        int count=0;
        for(int i=1;i<=2019;i++){
            if(sumNine(i)){
                count++;
            }
        }
        System.out.println(count);





//        int count=0;
//        for(int i=1;i<=2019;i++){
//            if(i%10==9||i/10==9){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//
//
   }
}
