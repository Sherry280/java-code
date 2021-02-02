package day31;

import java.util.Scanner;

public class FebDay2 {
    /**
     * 统计数字2出现的次数
     */
    public static int countNumberOf2s(int n) {
        int sum=0;
        while(n!=0){
            sum+=(n%10==2)?1:0;
            n/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n=22;
        System.out.println(countNumberOf2s(n));

    }
    /**
     * 换钱游戏
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next();//应付的
            String[] split = s1.split("\\.");
            int[] P=new int[split.length];
            String s2=sc.next();//实付的钱
            String[] split2=s2.split("\\.");
            int[] A=new int[split2.length];
            for(int i=0;i<split.length;i++) {
               P[i]= Integer.parseInt(split[i]);
               A[i]=Integer.parseInt(split2[i]);
            }
            //arr1[0]   arr1[1]    arr1[2]
            //arr2[0]    arr2[1]    arr2[2]
            int Knut=0;
            int Sickle=0;
            int Galleon=0;
            if(P[0]<A[0]){//应付的钱足够多
                if(A[2]>P[2]){
                    Knut=A[2]-P[2];
                }else{
                    A[1]=A[1]-1;
                    Knut=(A[2]+29)-P[2];

                }
                if(A[1]>P[1]){
                    Sickle=A[1]-P[1];
                }else{
                    A[0]--;
                    Sickle=A[1]+17-P[1];

                }
                Galleon = A[0] - P[0];

            }else{
                //钱不够的情况下
                if(A[2]<P[2]){
                    Knut=P[2]-A[2];
                }else{
                    P[1]--;
                    Knut=P[2]+29-A[2];

                }
                if(A[1]<P[1]){
                    Sickle=P[1]-A[1];
                }else{
                    P[0]--;
                    Sickle=P[1]+17-A[1];

                }
                Galleon =P[0]-A[0];
            }
            if(A[0]>P[0]){
                System.out.println(Galleon+"."+Sickle+"."+Knut);
            }else{
                System.out.println("-"+Galleon+"."+Sickle+"."+Knut);
            }

        }

    }
}
