import java.util.*;

public class Main1 {

    //输入一串数字，20201018，打印在数组中输出[20201018]

    public static int[] getDigits(long n) {
        //定义一个栈，用来接收传进去的数字，然后再进行打印输出，数字的顺序要求不变
        Deque<Integer> stack = new LinkedList<>();

        while(n>0){
            int digit=(int)n%10;//从个位开始将每一位放进栈中
            //进栈
            stack.push(digit);
            //遍历得到每一位
            n/=10;

        }
        //初始化一个数组
        int[] array=new int[stack.size()];
        for(int i=0;i<array.length;i++){
            //将栈中的元素弹出
            array[i]=stack.pop();
        }
        return array;


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLong()){
            long n=scanner.nextLong();
            System.out.println(Arrays.toString(getDigits(n)));
        }

    }


    //将一个long类型的数字转成单个字符放在数组中输出
    //long a=20201018；
    //int[] array={2,0,2,0,1,0,1,8}
    //
    public static int getPos(int n){
        if(n<=9){
            return n;
        }
        int res=0;
//        while(n%10!=0){
//            res++;
//        }
        return res;
    }
    private static int[] reverse(){
        return null;
    }

    public static void main1(String[] args) {
        Main1 main1=new Main1();
        System.out.println(main1.getPos(20201018));
    }
}
