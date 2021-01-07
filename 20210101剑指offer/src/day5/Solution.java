package day5;

import java.util.Stack;

/**
 * 用两个栈来实现队列，实现队列的push、pop操作。
 */
public class Solution {
    Stack<Integer> stack1=new Stack<>();//入队列de栈
    Stack<Integer> stack2=new Stack<>();//出队列元素的栈

    public void push(int node){
    stack1.push(node);

    }

    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                Integer e=stack1.pop();
                stack2.push(e);
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(7);
        System.out.println(s.pop());

    }

}
