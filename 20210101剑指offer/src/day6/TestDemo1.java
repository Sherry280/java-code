package day6;

import java.util.Scanner;

public class TestDemo1 {
    /**
     * 【不要二】二货小易有一个W*H的网格盒子，网格的行编号为0~H-1，网格的列编号为0~W-1。
     * 每个格子至多可以放一块蛋糕，任意两块蛋糕的欧几里得距离不能 等于2。
     * 对于两个格子坐标(x1,y1),(x2,y2)的欧几里得距离为: ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) )
     * 的算术平方根 小易想知道最多可以放多少块蛋糕在网格盒子里。
     * @param args
     */
    public static void main2(String[] args) {

                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt(), n = sc.nextInt();
                int evenICount = (n / 4) * 2 + (Math.min(n % 4, 2));
                int oddICount = ((n - 2) / 4) * 2 + (Math.min((n - 2) % 4, 2));
                int ans = m / 4 * (evenICount + oddICount) * 2;
                if(m % 4 > 0) ans += evenICount;
                if(m % 4 > 1) ans += evenICount;
                if(m % 4 > 2) ans += oddICount;
                System.out.println(ans);


    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();//行
            int n=sc.nextInt();//列
            int SSum=(n/4)*2+(Math.min(n % 4, 2));
            int XSum=((n-2)/4)*2+(Math.min((n - 2) % 4, 2));
            int ans=m/4*(SSum+XSum)*2;
           if(m%4==1){
               ans+=SSum;
           }else if(m%4==2){
               ans+=(2*SSum);
           }else{
               ans+=(2*SSum+XSum);
           }

            System.out.println(ans);

        }




    /**
     * 求出两个数的最小公倍数，5，7---35
     * @param args
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;

        while(a*b!=0){
            if(a>b){
                a%=b;
            }else if(a<b){
                b%=a;
            }else{
                break;
            }
        }
        int m=(a==0?b:a);
        int bb=c/m;
        System.out.println(bb);

    }
}
