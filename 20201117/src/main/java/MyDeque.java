import java.util.Stack;

public class MyDeque {
    //用栈实现队列的操作
    Stack<Integer> stack1=new Stack<Integer>();//进队列的
    Stack<Integer> stack2=new Stack<Integer>();//出队列的

    public void push(int x){
        stack2.push(x);
    }

    public int pop(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                Integer e=stack2.pop();
                stack1.push(e);
            }
        }
        return stack1.pop();
    }


    public int peek(){
        if(stack1.isEmpty()){
            while(!stack2.isEmpty()){
                Integer e=stack2.pop();
                stack1.push(e);
            }
        }
        return stack1.peek();
    }
}
