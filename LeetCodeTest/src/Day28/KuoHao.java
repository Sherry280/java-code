package Day28;

import java.util.ArrayList;
import java.util.List;

public class KuoHao {
    /**
     * 回溯算法：给定一个整数n，然后进行括号的匹配
     */
    public static List<String> generateParenthesis(int n) {
        StringBuffer sb=new StringBuffer();
        List<String> list=new ArrayList<>();
        int left=n;
        int right=n;
        backtracking(list,sb,left,right,n);
        return list;

    }
    public static   void backtracking(List<String> list,StringBuffer sb,int left,int right,int n){
        if(left==0&&right==0){
            list.add(sb.toString());
            return;
        }
        //left的数量足够多
        if(left>0){
            sb.append('(');
            left--;
            backtracking(list,sb,left,right,n);
            sb.deleteCharAt(sb.length()-1);
            left++;
        }

        //right的数量大于left
        if(right>left){
            sb.append(')');
            right--;
            backtracking(list,sb,left,right,n);
            sb.deleteCharAt(sb.length()-1);
            right++;

        }
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));

    }
}
