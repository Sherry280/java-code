import java.util.Scanner;
import java.util.Stack;

public class TestDemo {
    /**
     * 逆波兰公式求解问题
     */
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){

            switch(tokens[i]){
                case "+":stack.push(stack.pop()+stack.pop());break;
                case "-":
                    int right=stack.pop();
                    stack.push(stack.pop()-right);
                    break;
                case "/":
                    int left=stack.pop();
                    stack.push(stack.pop()/left);
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();


    }
    public static void main5(String[] args) {
        String[] t={"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(t));

    }
    /**
     * 将十六进制数字转换为10进制的数字
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            long num=0;
            for(int i=2;i<s.length();i++){
                num*=16;
                char ch=s.charAt(i);
                int n=0;
                if(ch>='A'&&ch<='Z'){
                    n=ch-'A'+10;
                }else if(ch>='a'&&ch<='z'){
                    n=ch-'a'+10;
                }else{
                    n=ch-'0';
                }
                num+=n;
            }
            System.out.println(num);
        }

    }

    /**
     * 计算字符串中每个字母各有多少个
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] count=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                count[ch-'A']++;
            }
        }
        for(int i=0;i<26;i++){
            System.out.printf("%c:%d%n",(i+'A'),count[i]);
        }

    }
}
