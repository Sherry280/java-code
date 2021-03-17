package day16;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] split = s.split("[^a-zA-Z]+");
            StringBuffer sb=new StringBuffer();
            for(int i=split.length-1;i>=0;i--){
                sb.append(split[i]+" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
    /**
     * 变量名小驼峰转换为大驼峰，符合java命名习惯
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] s1 = s.split("_");
            for(int i=1;i<s1.length;i++){
                s1[i]=s1[i].toLowerCase();
//                if(i==0){
//                    continue;
//                }
                char[] chars = s1[i].toCharArray();
                chars[0]=(char)(chars[0]-32);
                s1[i]=new String(chars);

            }
            String newStr="";
            for(String ss:s1){
                newStr+=ss;
            }
            System.out.println(newStr);
        }

    }
}
