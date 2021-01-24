package day24;

import java.util.Scanner;

public class TestDemo2 {
    /**
     * 将数字转换成汉字存储
     */
    public static String toChinese(String s){
        String[] s1 = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] s2 = { "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" };
        String[] s3={"角,“分"};
        String result = "";
        int n = s.length();

        if(s.contains(".")) {
            //有小数时
            String[] sp = s.split(".");

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(sp[i] )- '0';
                if (i != n - 1 && num != 0) {
                    result += s1[num] + s2[n - 2 - i];
                } else {
                    result += s1[num];
                }
            }

        }else {
            //没有小数时：
            for (int i = 0; i < n; i++) {
                int num = s.charAt(i) - '0';
                if (i != n - 1 && num != 0) {
                    result += s1[num] + s2[n - 2 - i];
                } else {
                    result += s1[num];
                }

            }
        }

            return result;



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        System.out.println(toChinese(s));

    }

    /**
     *第一行：课程的数目n
     * 第二行：每门课程的学分
     * 第三行：每门课程学生的得分情况
     * 求出学生的GPA
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//课程数目
        int[] array=new int[n];
        int f=0;//标记总学分
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();//放学分
            f+=array[i];
        }

        int[]  score=new int[n];//放分数
        double sum=0;
        double z=0;
        for(int i=0;i<n;i++){
            score[i]=sc.nextInt();
            if(score[i]>=90&&score[i]<=100){
                sum=4.0;
            }else if(score[i]>=85&&score[i]<=89){
                sum=3.7;
            }else if(score[i]>=82&&score[i]<=84){
                sum=3.3;
            }else if(score[i]>=78&&score[i]<=81){
                sum=3.0;
            }else if(score[i]>=75&&score[i]<=77){
                sum=2.7;
            }else if(score[i]>=72&&score[i]<=74){
                sum=2.3;
            }else if(score[i]>=68&&score[i]<=71){
                sum=2.0;
            }else if(score[i]>=64&&score[i]<=67){
                sum=1.5;
            }else if(score[i]>=60&&score[i]<=63){
                sum=1.0;
            }else if(score[i]<60){
                sum=0;
            }
            z=z+array[i]*sum;
        }
        double avg=z/f;
        System.out.printf("%.2f",avg);


    }
}
