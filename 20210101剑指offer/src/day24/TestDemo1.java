package day24;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo1 {
    /**
     * 对学生的成绩进行查询或者更新操作
     *
     */
    public static void check(int[] array,int M,String c,int a,int b){
        for(int i=0;i<M;i++) {
            switch (c) {
                case "U":
                    //执行更新操作,将a的成绩换成b的成绩
                        array[a] = b;
                        break;

                case "Q":
                    //执行查询操作：a到b之间成绩最高为多少
                    Arrays.sort(array);
                    System.out.println(array[array.length-1]);
                    break;
                default:
                    break;

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//学生的个数
        int M=sc.nextInt();//操作的数目
        int[] array=new int[N];
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }
        //现在已经初始化好了成绩表
        String[] s=new String[M];
        int[] a=new int[M];
        int[] b=new int[M];
       for(int i=0;i<M;i++){
            s[i]=sc.next();
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            check(array,M,s[i],a[i],b[i]);
        }






    }
    /**
     * 小易打怪物进行升级
     *1.怪物的数量和小易的初始战斗能力
     *
     */
    public static int maxValue(int a,int b){
        //转转相除法
        while(a*b!=0){
            if(a>b){
                a%=b;
            }else if(a<b){
                b%=a;
            }else{
                break;
            }

        }
        return a==0?b:a;
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();//怪物的数量
            int a=sc.nextInt();//小易的初始战斗能力
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int c=a;
            for(int i=0;i<n;i++){
                if(array[i]<=c){
                    c+=array[i];
                }else{
                    //求出array[i]和c的最大公约数
                    int i1 = maxValue(array[i], c);
                    c+=i1;
                }
            }
            System.out.println(c);



        }
    }
}
