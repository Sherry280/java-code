package LeetCode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Niuke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String[] s=str.split(" ");
        int[] array=new int[s.length];
        int sum=0;
        for(int i=0;i<s.length;i++){
            array[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(array);

        //现在进行吧中间的数字相加
        for(int i=1;i<array.length-1;i++){
            sum+=array[i];
        }
        double aver=(double)(sum/(array.length-2));
        System.out.printf("%.2f",aver);









    }
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();//3
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int m=1;m<i;m++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

        public static void main2(String[] args) {
            Scanner sc = new Scanner(System.in);
            int length;
            while(sc.hasNext()){
                length = sc.nextInt();
                for(int i = 1; i <= length; i++){
                    for(int j = 0; j < length - i; j++){
                        System.out.print("  ");
                    }
                    for(int t = 0; t < i; t++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
            }

        }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                //打印空格
                for (int j = 0; j <n-i; j++) {
                    System.out.print("  ");
                }
                //打印*
                for (int m = 0; m <i; m++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }

        }


//    public static void main1(String[] args) {
//        //学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
//        Scanner sc=new Scanner(System.in);
//        String score=sc.nextLine();
//
//        String[] s=score.split(";");
//    }
    }

    public static class Test {
        public static void main(String[] args) {
            List<Integer> list=new ArrayList<>();
            Integer[] str=new Integer[]{5,8,3,0};
            for(Integer e:str){
                System.out.println(e);
            }







    //        List<String> list=new ArrayList<>();
    //
    //        String[] array={"99","876","543","haha"};
    //
    //        Collections.addAll(list,array);
    //        System.out.println(list);








    //        List<String> list=Arrays.asList("99","88","xixi","66");
    //        System.out.println(list);





    //        List<Short> list=new ArrayList<>();
    //        list.add(1);
    //        list.add();
    //
    //        Short[] array=list.toArray(new Short[0]);
    //        //new Integer[]中元素的多少自己可以定义，一般从0开始，需要多少开辟多少
    //        for(Short in:array){
    //            System.out.println(in);
    //        }






            //直接调用list.toArray()将其转为数组
            //再调用Arrays.toString()将数组元素打印出来
            //System.out.println(Arrays.toString(list.toArray()));

        }
    }
}
