package Test09.Test0910;

import java.util.Scanner;
import java.util.Stack;

public class Solution5 {
    /**
     * 括号匹配
     *3
     * ([])
     * ({]})
     * ()[]{}
     */
    public static boolean isVaild(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            //如果匹配的是左括号，直接放进栈
            char c=s.charAt(i);
            if((c=='(')||(c=='[')||(c=='{')){
                stack.push(c);
            }
            //如果是右括号
            if(c==')'||c==']'||c=='}'){
                if(stack.size()==0){
                    return false;
                }
                if (stack.pop()!=c) {
                    return  false;
                }
            }
        }
        if(stack.size()!=0){
            return true;
        }
            return false;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(sc.hasNext()){
                String s=sc.nextLine();
                boolean vaild = isVaild(s);
                if(vaild){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
        }
    }
}
