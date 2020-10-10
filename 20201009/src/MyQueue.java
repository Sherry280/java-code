import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    private Deque<Integer> s1;
    private Deque<Integer> s2;
    public MyQueue(){
        s1=new LinkedList<>();
        s2=new LinkedList<>();
    }

    public void push(int x){
        s2.push(x);
    }
    //从队列首部移除元素
    public int pop(){
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer e=s2.pop();
                s1.push(e);
            }
        }
        return s1.pop();
    }
    //返回队列首部的元素
    public int peek(){
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                Integer e=s2.pop();
                s1.push(e);
            }
        }
        return s1.peek();
    }
    //返回队列是否为空
    public boolean empty(){
        return s1.isEmpty()&&s2.isEmpty();
    }


    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue();
        myQueue.push(3);
        myQueue.push(5);
        myQueue.push(7);

        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());


    }

}
