package impl;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
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

}
