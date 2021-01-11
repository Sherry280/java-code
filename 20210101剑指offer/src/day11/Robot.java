package day11;

import java.util.Scanner;

public class Robot {
    /**
     * 整数变换成字符串，在进行逆序打印出来
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        while(n!=0){
            s+=n%10;
            n/=10;
        }
        System.out.println(s);

    }
    /*
    /n的阶乘末尾有多少个0
    当数字特别大，如:n=999时，递归出来的n的结果会特别大，所以这道题不能采用递归求解
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        int count=0;
        for(int i=n;i>=5;i--){
            int res=i;
            while(res%5==0){
                count++;
                res/=5;//在这直接用i去进行计算的时候，i的值hui被修改，然后在for循环里边进行判断的时候
                //i的值会缺少一部分,所以需要另一个变量来进行保存i的值

            }
        }
        System.out.println(count);




    }
    public static long JiuCheng(int n){
        if(n==1){
            return 1;
        }
        return n*JiuCheng(n-1);
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long j = JiuCheng(n);
            String s = String.valueOf(j);
            int count=0;
           int i=s.length()-1;
           while(i>0) {
               if (s.charAt(i) != '0') {
                   count = 0;
                   break;
               }
               if (s.charAt(i) == '0' && s.charAt(i - 1) != '0') {
                   count++;
                   break;
               }
               if(s.charAt(i)=='0'&&s.charAt(i-1)=='0'){
                   count++;
               }
               i--;
           }

            System.out.println(count);

        }

    }
}
