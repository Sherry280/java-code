package day31;

import java.util.Scanner;

public class FebDay7 {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
                StringBuffer sb=new StringBuffer();
                sb.append(sc.next());
                //String str=sc.next();
                String str=sb.reverse().substring(0,sb.length()-2);
                char ch[]=str.toCharArray();
                int sum=0;
                for(int i=0;i<ch.length;i++){
                    if(ch[i]>='A'&&ch[i]<='F'){
                        sum+=(Integer.valueOf(ch[i])-55)*Math.pow(16,i);
                    }else {
                        sum+=(Integer.valueOf(ch[i])-48)*Math.pow(16,i);
                    }
                }
                System.out.println(sum);
                // System.out.println(Integer.valueOf('6'));
            }
        }

           //System.out.println(Integer.decode(s));



    /**
     * 进制转换，输入一个十六进制的字符串，将其转换为10进制输出
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next().substring(2);
            System.out.println(Integer.parseInt(s,16));
        }

    }
    /**
     * 字母统计
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            char[] chars = s.toCharArray();
            int[] record=new int[256];
            for(char c:chars){
                record[c]++;
            }

            for(int i='A';i<='Z';i++){
                System.out.println((char)i+":"+record[i]);
            }
        }

    }
}
