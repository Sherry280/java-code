package day2;

import java.util.Scanner;

public class isHuiWen {
    public static boolean isHuiWen(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int count=0;
        //寻找插入位置，将字符b插到a中
        for(int i=0;i<=a.length();i++){
            StringBuilder sb=new StringBuilder(a);
            sb.insert(i,b);//注意append只是在字符串的后面进行拼接
            if(isHuiWen(sb.toString())){//要将字符串变成单独的一个个char类型的
                count++;
            }

        }
        System.out.println(count);

    }
}
