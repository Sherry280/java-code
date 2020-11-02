package LeetCode1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SimCode1 {
    public static void main(String[] args) {
        //期中考试开始了，大家都想取得好成绩，争夺前五名。
        // 从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //输入有多少人的人数n
        //开辟一块空间，存放输进去的每一个成绩
        int[] score=new int[n];
        for(int i=0;i<n;i++){
            int score1=sc.nextInt();
            score[i]=score1;
        }
        //成绩放进去之后，现在要对数组中的成绩进行排序，升序，输出前5个最大的数
        //采用最简单的冒泡排序
        for(int i=0;i<score.length-1;i++){
            for(int j=0;j<score.length-i-1;j++){
                if(score[j]<score[j+1]){
                    int s=score[j];
                    score[j]=score[j+1];
                    score[j+1]=s;
                }
            }
        }
        //排序完成
        //进行打印前5名
        for(int i=0;i<5;i++){
            System.out.print(score[i]+" ");
        }






    }

//变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,
// （14和61）,（146和1),如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
//655 = 6 * 55 + 65 * 5
//1461 = 1*461 + 14*61 + 146*1
//求出 5位数中的所有 Lily Number。
    public static void main2(String[] args) {
        int res=0;
        int a,b;
        for(int i=10000;i<100000;i++){
            //遍历每一位，查看他是不是符合水仙花的特点

                for(int j=1;j<6;j++){
                   a=i%(int)Math.pow(10,j);
                   b=i/(int)Math.pow(10,j);
                    res=res+a*b;
                    //System.out.println(res);

            }
                if(i==res){
                    System.out.print(i+" ");
                }
                res=0;
        }


    }


















    //十进制数字a和八进制数字b，输出a+b的十进制
    public static void main1(String[] args) {

                Scanner sc=new Scanner(System.in);
                while(sc.hasNext())
                {
                    //输入   0x12 05
                    String str1=sc.next();
                    String str2=sc.next();
                    //截取
                    String num1=str1.substring(2,str1.length());
                    String num2=str2.substring(1,str2.length());
                    //用valueOf（）方法转换
                    System.out.print(Integer.valueOf(num1,16)+Integer.valueOf(num2,8));

        }
    }
}
