import java.io.IOException;
import java.util.Scanner;

public class TestDemo {
    //打印金字塔
    public static void tower(String s){

        for(int i=1;i<=5;i++){
            for(int k=5-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tower("1");
    }
//import java.io.IOException;
//public class Main{
    public static void main7(String[] args) throws IOException {
        char c=(char)System.in.read();
        int n = 5;
        for(int i = 1; i <= n; i++){   // 控制行数
            for (int m = 1; m <= n-i; m++) { // 左侧空格
                System.out.printf(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if ((j+1)%2 == 0){  // 基数输出1，偶数输出空格
                    System.out.print(c);
                }else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
//}



//    public class Main {
        public static void main4(String[] args){
            Scanner sc = new Scanner(System.in);
            String score = sc.nextLine();
            String[] s = score.split(";");
//            String x=s.toString();
//            String[] s1=x.split(",");
//
            String[] s2 = s[1].split(",");
            System.out.printf("The each subject score of  No. %d is %.2f, %.2f, %.2f.",
                    Integer.valueOf(s[0]),
                    Float.valueOf(s2[0]),
                    Float.valueOf(s2[1]),
                    Float.valueOf(s2[2]));
        }

    public static void main5(String[] args) {
        Scanner sc=new Scanner(System.in);
        String score=sc.nextLine();
        String[] s=score.split(";");
        String[] s2=s[1].split(",");
        System.out.printf("The each subject score of No. %d is %.2f, %.2f, %.2f.",
                Integer.valueOf(s[0]),Float.valueOf(s2[0]),Float.valueOf(s2[1]),Float.valueOf(s2[2]));
    }
//    }

    public static void score(int id, float score1, float score2, float score3) {
        System.out.println("The each subject score of No."
                + id + "is score1" + score1 + ",score2" + score2 + ",score3" + score3);
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int id = sc.nextInt();
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            System.out.println("The each subject score of No." + id + " is "
                    + String.format("%.2f", a) + "," + String.format("%.2f", b) +
                    "," + String.format("%.2f", c) + ".");
        }
    }


//            int id = sc.nextInt();
//            float a = sc.nextFloat();
//            float b = sc.nextFloat();
//            float c = sc.nextFloat();
//            System.out.println("The each subject score of No." + id + " is "
//                    + String.format("%.2f", a) + "," + String.format("%.2f", b) +
//                    "," + String.format("%.2f", c) + ".");
//        }


//    public class Main {
//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            String score = sc.nextLine();
//            String[] s = score.split(";");
//            String[] s2 = s[1].split(",");
//            System.out.printf("The each subject score of  No. %d is %.2f, %.2f, %.2f.",
//                    Integer.valueOf(s[0]), Float.valueOf(s2[0]),
//                    Float.valueOf(s2[1]),
//                    Float.valueOf(s2[2]));
//        }
//    }


        //score(id,a,b,c);


        //十六进制整数ABCDEF对应的十进制整数，所占域宽为15。
        //printf可以使用使用格式控制串“%md”输出域宽为m的十进制整数。
        private static long 转十进制 (String s){
            long r = 0;
            char[] chars = s.toCharArray();
            for (char c : chars) {
                int digt = 字符转数字(c);
                r = (r + digt) * 16;
            }
            return r / 16;

        }
        private static int 字符转数字 ( char c){
            if (c >= '0' && c <= '9') {
                return c - '0';
            } else {
                return c - 'A' + 10;
            }
        }

        public static void main2 (String[]args){
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                long n = 转十进制(s);
                System.out.println(n);
            }
        }


        public static void main1 (String[]args){


            int x = 1234;
            System.out.printf("%#o", x);//打印出来八进制
            System.out.print(' ');
            System.out.printf("%#x", x);//打印出来为十六进制

        }

}






