package day11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c1=0;
        int c2=0;
        while(sc.hasNext()){
            int n=sc.nextInt();
            String s=sc.nextLine();
            sc.nextLine();
            char[] chars = s.toCharArray();

            for(int i=0;i<chars.length;i++){
                if(chars[i]=='1'){
                    c2++;
                }
                if(chars[i]=='0'){
                    c1++;
                }
            }

        }
        System.out.println(Math.abs(c1-c2));
    }
}
