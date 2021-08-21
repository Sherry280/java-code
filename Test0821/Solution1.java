package Test0813.Test0821;

import java.util.Stack;

public class Solution1 {




    /**
     * 二叉树的后序遍历：给定一个数组，
     */


    /**
     *栈的压入、弹出序列
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int val:pushed){
            stack.push(val);
            while(!stack.empty()&&stack.peek()==popped[index]){
                index++;
                stack.pop();
            }
        }
        return stack.empty();

    }


}
