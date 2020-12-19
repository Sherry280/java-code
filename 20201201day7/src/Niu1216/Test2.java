package Niu1216;

import java.util.Scanner;

public class Test2 {
    /**
     * 输入现在的时刻以及要睡的时长k（单位：minute），中间用空格分开。
     * 输入格式：hour:minute k(如hour或minute的值为1，输入为1，而不是01)
     * (0 ≤ hour ≤ 23，0 ≤ minute ≤ 59，1 ≤ k ≤ 109)
     * @param args
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String now=sc.nextLine();

        String[] ss = now.split(":");
        String[] s = ss[1].split(" ");

        int h=Integer.parseInt(String.valueOf(ss[0]));
        int m=Integer.parseInt(String.valueOf(s[0]));
        int k=Integer.parseInt(String.valueOf(s[1]));
        h=h+k/60;
        m=m+k%60;
        if(m>=60){
            h++;
            m=m-60;
        }
        if(h>=24){
            h%=24;
        }
        String hh=null;
        String mm=null;

        if(h/10==0&&m/10!=0){
            hh="0"+h;
            System.out.println(hh+":"+m);
        }else if(m/10==0&&h/10!=0){
            mm="0"+m;
            System.out.println(h+":"+mm);
        }else if((h/10==0)&&(m/10==0)){
            hh="0"+h;
            mm="0"+m;
            System.out.println(hh+":"+mm);
        }else {

            System.out.println(h + ":" + m);
        }




    }
    public static int Sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+Sum(n-1);
        }
    }
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int sum=Sum(n);
            System.out.println(sum);
        }
    }
    public static void main3(String[] args) {
        //转换为6进制
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(Integer.toString(sc.nextInt(),6));
        }
    }

    /**
     * 模仿＃下棋的过程
     * K O B
     * O K B
     * B O K
     *
     * @param args
     */
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.next();
            }
        }

        //分为4部分：行、列、对角线、反对角线
        //1.检查行
        int KSum = 0;
        int BSum = 0;
        for (int i = 0; i < 3; i++) {
            if (array[i][0].equals("K") && array[i][1].equals("K") && array[i][2].equals("K")) {
                System.out.println("KiKi wins!");
                return;
            } else if (array[i][0].equals("B") && array[i][0].equals("B") && array[i][2].equals("B")) {
                System.out.println("BoBo wins!");
                return;
            } else {
                for (int j = 0; j < 3; j++) {
                    //检查列
                    if(array[0][j].equals("K")&&array[1][j].equals("K")&&array[2][j].equals("K")){
                        System.out.println("KiKi wins!");
                        return;
                    }
                    if(array[0][j].equals("B")&&array[1][j].equals("B")&&array[2][j].equals("B")){
                        System.out.println("BoBo wins!");
                        return;
                    }
                }
            }

        }
        //对角线
        if (array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])) {
            if (array[0][0].equals("K")) {
                System.out.println("KiKi wins!");
                return;
            }
            if (array[0][0].equals("B")) {
                System.out.println("BoBo wins!");
            }

        } else if (array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0])) {
            if (array[0][2].equals("K")) {
                System.out.println("KiKi wins!");
                return;
            }
            if (array[0][2].equals("B")) {
                System.out.println("BoBo wins!");
                return;
            }
        } else {
            System.out.println("No winner!");
        }
    }


}
