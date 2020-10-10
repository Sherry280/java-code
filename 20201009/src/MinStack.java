import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    private Deque<Integer> s1;
    private Deque<Integer> s2;

    public MinStack(){
        s1=new LinkedList<>();
        s2=new LinkedList<>();

    }

    public void push(int x){
        s1.push(x);
        if(s2.isEmpty()){
            s2.push(x);

        }else{
            int t=s2.peek();
            if(x<t){
                s2.push(x);

            }else{
                s2.push(t);
            }
        }
    }

    public void pop(){
        s1.pop();
        s2.pop();
    }

    public int top(){
        return s1.peek();
    }

    public int getMin(){
        return s2.peek();
    }


    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(3);
        minStack.push(6);
        minStack.push(7);
        minStack.push(0);

        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());


    }

}
