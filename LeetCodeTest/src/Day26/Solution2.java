package Day26;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    /**
     * 反转每对括号间的字串
     */
    public static  String reverseParentheses(String s) {
        StringBuffer sb=new StringBuffer();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(c!='('&&c!=')'){
                sb.append(c);
            }
        }
        sb.reverse();
        return sb.toString();
    }
    public static String reverseParentheses1(String s){
        s=s.replace('(','a');
        s=s.replace(')','a');
        String[] as = s.split("a");
        StringBuffer sb=new StringBuffer();
        for(int i=as.length-1;i>=0;i--){
            sb.append(as[i]);
        }
        return sb.toString();


    }
    public static String reverseParentheses2(String s){
        Deque<String> deque=new LinkedList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                deque.push(sb.toString());
                sb.setLength(0);
            }else if(c==')'){
                sb.reverse();
                sb.insert(0,deque.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="(ed(et(oc))el)";
        System.out.println(reverseParentheses2(s));

    }
}
