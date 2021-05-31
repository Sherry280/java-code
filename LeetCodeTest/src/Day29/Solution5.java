package Day29;

import java.util.Stack;

public class Solution5 {
    /**
     * 给定一个字符串，模拟计算机的加减乘除来计算字符串的结果
     */
    public static int calculate(String s) {
        int preSign='+';
        Stack<Integer> stack=new Stack<>();
        int length=s.length();
        for(int i=0;i<length;i++){
            int ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            if(ch>='0'&&ch<='9'){
                int num=0;
                while (i<length&&(ch=s.charAt(i))>='0'&&ch<='9'){
                    num=num*10+ch-'0';
                    i++;
                }
                i--;
                if(preSign=='*'){
                    stack.push(num*stack.pop());
                }else if(preSign=='/'){
                    stack.push(stack.pop()/num);
                }else if(preSign=='+'){
                    stack.push(num);
                }else if(preSign=='-'){
                    stack.push(-num);
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
        String s="42";
        System.out.println(calculate(s));

    }
}
