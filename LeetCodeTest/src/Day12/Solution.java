package Day12;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 设计一种算法：
     * 打印n对括号的所有合法的（例如，开闭一一对应）组合。
     * 说明：解集不能包含重复的子集
     */
    private static  List<String> res;

    public static List<String> generateParenthesis(int n) {
        int leftBracket = n, rightBracket = n;
        res = new ArrayList<>();
        dfs(leftBracket, rightBracket, new StringBuilder());
        return res;
    }

    private static void dfs(int leftBracket, int rightBracket, StringBuilder sb) {
        if (leftBracket == 0 && rightBracket == 0) {
            res.add(sb.toString());
            return;
        }

        if (leftBracket > rightBracket) {
            return;
        }

        if (leftBracket > 0) {
            sb.append("(");
            dfs(leftBracket - 1, rightBracket, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (rightBracket > 0) {
            sb.append(")");
            dfs(leftBracket, rightBracket - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
