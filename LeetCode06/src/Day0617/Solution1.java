package Day0617;

import java.util.Scanner;

public class Solution1 {
    /**
     * 判断是否为有效数字：将数字进行划分，根据. e  E +  -
     * 思路：1.前后去掉空格  2.用e将数字分为两部分  3.判断数组的前后的两部分是否合法有效
     */
    public static boolean isNumber(String s) {
        if(s.length()==0||s==null){
            return false;
        }
        boolean numSeen=false;
        boolean dotSeen=false;
        boolean eSeen=false;
        char[] chars = s.trim().toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='0'&&chars[i]<='9'){
                numSeen=true;
            }else if(chars[i]=='.'){
                if(dotSeen||eSeen){
                    return false;
                }
                dotSeen=true;
            }else if(chars[i]=='e'||chars[i]=='E'){
                if(eSeen||!numSeen){
                    return false;
                }
                eSeen=true;
                numSeen=false;
            }else if(chars[i]=='+'||chars[i]=='-'){
                if(i!=0&&chars[i-1]!='e'&&chars[i-1]!='E'){
                    return false;
                }
            }else{
                return false;
            }
        }
        return numSeen;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(isNumber(s));
        }

    }
}
