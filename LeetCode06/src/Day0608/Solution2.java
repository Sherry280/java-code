package Day0608;

import java.util.Stack;

public class Solution2 {
    /**
     * 模拟计算器功能，整数相除只保留整数部分
     */
    public static int calculate(String s) {
        int preSign='+';
        Stack<Integer> stack=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            int ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            if(ch>='0'&&ch<='9'){
                int num=0;
                while(i<n&&(ch=s.charAt(i))>='0'&&ch<='9'){
                    num=num*10+ch;
                    i++;
                }
                i--;
                if(preSign=='*'){
                    stack.push(num*stack.pop());
                }else if(preSign=='/'){
                    stack.push((int)stack.pop()/num);
                }else if(preSign=='-'){
                    stack.push(-num);
                }else if(preSign=='+'){
                    stack.push(num);
                }
            }else{
                preSign=ch;
            }
        }
        int res=0;
        while(!stack.empty()){
            res+=stack.pop();
        }
        return res;

    }

    public static void main(String[] args) {
        String s="3/2";
        System.out.println(calculate(s));

    }
}
