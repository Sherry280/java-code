package day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        String nn=String.valueOf(n);
        char[] c=nn.toCharArray();

        long[] arr=new long[10];

        for (char value : c) {
            int idx = value - '0';
            arr[idx]++;
            //arr[c[i]-'0']+=1;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println(i+":"+arr[i]);
            }
        }

    }
}
