package day20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZhuZi {
    /**
     * 判断一个字符串中是否全部包含另一个短的字符串中的元素
     * 输出：Yes/No 多了或者少了几颗珠子
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//商家卖得珠子
        String h=sc.nextLine();//小红要买的珠子
        char[] hh = h.toCharArray();
        char[] ss = s.toCharArray();
        int SSum=s.length()-h.length();

//ppRYYGrrYBR2258
//YrR8RrY
        Set<Character> set=new HashSet<>();
        for(int i=0;i<ss.length;i++) {
            set.add(ss[i]);
        }

        //没有包含小红要买的珠子的时候，打印出少几颗珠子
        int a=0;
        for(int i=0;i<h.length();i++){
            if(!set.contains(h.charAt(i))){
                a++;
                //System.out.println("No"+" "+a);
               // break;
            }
            if(a!=0){
                System.out.println("No"+" "+a);
            }

        }
        System.out.println("Yes"+" "+SSum);



    }
}
