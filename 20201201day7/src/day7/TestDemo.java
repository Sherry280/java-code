package day7;

import java.util.Scanner;

public class TestDemo {
    //盒子里可以放几块蛋糕
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();

        int sum=0;
        int x1=0;
        int x2=0;
        int y1=0;
        int y2=0;

        for(int i=0;i<w;i++){

        }


//        for(int i=0;i<w;i++){
//            for(int j=i+1;j<h;j++){
//                while(i!=j){
//                    int c=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
//                    if(Math.sqrt(c)!=2){
//                        sum++;
//                    }
//                }
//
//                }
//
//        }

        System.out.println(sum);
    }








    //求最大公倍数
    private static int maxGongYueshu2(int x,int y){
        //辗转相除法
        int g=x*y;
        while(x*y!=0){
            if(x<y){
                y%=x;
            }else if(x>y){
                x%=y;
            }else{
                break;
            }

        }
        int m=(x==0?y:x);//求出的是最大公约数
        int k=g/m;
        return k;
    }
    private static int maxGongYueshu(int n1,int n2){
        int g=n1*n2;

        //辗转相除法
        while(true){
            if(n1>n2){
                n1=n1-n2;
            }else if(n1<n2){
                n2=n2-n1;
            }else{
                break;
            }
        }
        //两个数现在相等，都是最大公因数了
        int a=g/n1;
        return a;


        //辗转相除法


    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println(maxGongYueshu(n1, n2));
    }
}
