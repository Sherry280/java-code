package Day29;

import java.util.Stack;

public class IsVaild {
    /**
     * 有效括号匹配
     */
    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ss : s.toCharArray()) {
            switch (ss) {
                case '{':
                case '[':
                case '(':
                    stack.push(ss);
                    break;
                default:
                    if (stack.isEmpty()) {
                        return false;
                    }

                    boolean b=isSameKuoHao(stack.peek(),ss);
                    if(b){
                        stack.pop();
                    }else{
                        return false;
                    }

            }

        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    private static boolean isSameKuoHao(char s1,char s2){
        if(s1=='['&&s2==']'){
            return true;
        }
        if(s1=='{'&&s2=='}'){
            return true;
        }
        if(s1=='('&&s2==')'){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s="[]{}";
        System.out.println(isValid(s));
    }
}
