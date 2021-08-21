package Test0813.Test0821;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    /**
     * 小A成为了一名粉刷匠！某次他去工作时，他得到了n个不同颜色的颜料桶。这些颜料都是来自某
     * 一家专门生产神奇颜料的公司的，一共有m种颜色混合规则，每一条规则都是两种颜色混合起来会得到一种新的颜色
     * （两种相同的颜色混合也有可能得到不同的颜色！）。小A把这些颜料桶分别编号为1~n，
     * 现在他要往一个空桶内分别倒入k桶颜料。他想知道最后能够得到什么颜色
     */

    /**
     * 字符串游戏
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        while(sc.hasNext()){
            StringBuffer sb=new StringBuffer();
            String sss="";
            for(int i=0;i<n;i++){
                String message=sc.nextLine();

                int a=0;
                if(i==1){
                     a=Integer.parseInt(message);
                }else {
                     a = Integer.parseInt(message.split(" ")[0]);
                }
                if(a==1){
                    //拿到字符串进行删除后k个字符
                    int k=Integer.parseInt(message.split(" ")[1]);
                    String b=s.substring(0,s.length()-k);
                    sb.append(b);
                }else if(a==2){
                    sb.reverse();
                }else{
                    String ss=message.split(" ")[1];
                     sss=sb.toString().trim();
                    sss=sss+ss;
                }
            }

            System.out.println(sss);
        }
    }
}
