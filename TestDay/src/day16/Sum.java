package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sum {
    /**
     * 电话号码
     */

    public static void main(String[] args) {
        String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String s2="222333444555666777788899991234567890";
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                String s=sc.nextLine().toLowerCase();
                 s = s.replace("-", "");
                StringBuilder result= new StringBuilder();
                for(int j=0;j<7;j++){
                    result.append(s2.charAt(s1.indexOf(s.charAt(j)+"")));
                }
                result = new StringBuilder(result.substring(0, 3) + "-" + result.substring(3, 7));
                if(!list.contains(result.toString())){
                    list.add(result.toString());
                }
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
            System.out.println();
        }


    }
    /**
     * 输入两个整数，n和m
     * 从数列1，2，3...n中随机取出几个数，使其和为m
     * 输出所有可能的组合
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();

        }

    }
}
