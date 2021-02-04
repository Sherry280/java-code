package day31;

import day4.Checket;

import java.io.PrintStream;
import java.util.*;

public class FebDay4 {
    /**
     * 根据球的中心点和球上的任意一点，求得球的半径和面积
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x0=sc.nextInt();
            int y0=sc.nextInt();
            int z0=sc.nextInt();
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int z1=sc.nextInt();

            double radius=0;
            double area=0;
            radius=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0));
            area=(4*Math.PI*radius*radius*radius)/3;
            //System.out.println(radius);
            //System.out.println(area);

              System.out.printf("%.3f %.3f", radius, area);

        }
    }
    /**
     * 遍历两个字符串，查找第二个字符串里面丢失了哪些字符。
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.nextLine().toUpperCase();
            String s2=sc.nextLine().toUpperCase();

            Set<Character> set=new TreeSet<>();
            for(int i=0;i<s1.length();i++){
                if(!s2.contains(s1.charAt(i)+"")){
                    set.add(s1.charAt(i));
                }
            }

            for(Character ch:set){
                System.out.print(ch);
            }

//            Iterator i=set.iterator();
//            while (i.hasNext()){
//                System.out.print(i.next());
//            }
        }
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.nextLine().toUpperCase();
            String s2=sc.nextLine().toUpperCase();

            Set<Character> set1=new HashSet<>();
            Set<Character> set2=new HashSet<>();
            for(char ch:s1.toCharArray()){
                set1.add(ch);
            }
            for(char ch2:s2.toCharArray()){
                set2.add(ch2);
            }

            String s="";
           for(int i=0;i<s2.length();i++){
               if(!set2.contains(set1)){
                   s+=set1;
               }
           }
            System.out.println(s.toString());



        }

    }
}
