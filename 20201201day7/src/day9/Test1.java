package day9;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);
        char[] array = s.toCharArray();

        for (int left=0,right=array.length-1;left<right;left++,right--) {

                char tmp = array[left];
               array[left]=array[right];
               array[right]=tmp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
        private static int SumZero ( int n){
            if (n <= 1) {
                return 1;
            } else {
                return n * SumZero(n - 1);
            }
        }

        public static void main4 (String[]args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
            int ss = SumZero(10);


            String s = String.valueOf(ss);
            char[] chars = s.toCharArray();

            int sum = 0;

            for (int i = 0; i < chars.length; i++) {
                if ((chars[i]) == 0) {
                    sum++;
                }
            }
            System.out.println(sum);


        }


        String str = new String("hello");
        char[] ch = {'a', 'b'};

        public static void main3 (String[]args){
            Test1 test1 = new Test1();
            test1.exchange(test1.str, test1.ch);
            System.out.print(test1.str + "and");
            System.out.print(test1.ch);
        }
        public void exchange (String str,char[] ch){
            str = "test ok";
            ch[0] = 'c';
        }

        public static void main2 (String[]args){
            Employee e = new Employee("123");
            System.out.println(e.emp);
        }


        private static void test1 () {
            System.out.println("testMethods");
        }

        public static void main1 (String[]args){
            test1();
        }

}
