package day30;

import java.util.Scanner;

public class TestDay30 {
    /**
     * 奇偶校验
     * 输入：每一个字符判断其二进制位的每一位是奇还是偶
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            char[] c=s.toCharArray();
            for(char ch:c){
                String s1=Integer.toBinaryString(ch);//转为二进制形式
                String s2=String.format("%07d",Integer.parseInt(s1));
                int count=0;
                for(int i=0;i<7;i++){
                    if(s2.charAt(i)=='1'){
                        count++;
                    }
                }
                System.out.println(count%2==0?"1"+s2:"0"+s2);

            }
        }

    }
}
