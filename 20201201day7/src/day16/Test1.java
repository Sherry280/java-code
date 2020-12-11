package day16;

import java.util.Scanner;

public class Test1 {
    /**
     * 洗牌，洗K次，输出最后的序列
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        while(m>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] array=new int[2*n];
            for(int i=0;i<array.length;i++){
                int tmp=0;
                for(int j=0;j<k;j++){
                    if(tmp<n){
                        tmp=2*tmp;
                    }else{
                        tmp=2*(tmp-n)+1;
                    }

                }
                array[tmp]=sc.nextInt();
            }
            for(int i=0;i<array.length;i++){
                if(i==array.length-1){
                    System.out.print(array[i]);
                }else{
                    System.out.print(array[i]+" ");
                }
                System.out.println();
                m--;
            }
        }
    }



    /**
     * 读入N名学生的成绩，将获得某一给定分数的学生的人数输出
     * @param args
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++) {
                array[i] = sc.nextInt();
            }
            int same=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                if(same==array[i]){
                    sum++;
                }
            }
            System.out.println(sum);

        }
    }

    public static void main1(String[] args) {
        int i=5;
        int s=(i++)+(++i)+(i--)+(--i);
        System.out.println(s);
//        int i=0;
//        int j=0;
//        if((++i>0)||(++j>0)){
//            System.out.println(i+"   "+j);
//        }
    }

}
