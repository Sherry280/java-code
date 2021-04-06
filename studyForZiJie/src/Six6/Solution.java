package Six6;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * 根据栈的输入顺序，来判断输出顺序是否为真
     * 思路：1.首先取出出栈队列中的第一个元素
     * 2.如果栈为空或者取出的元素和栈顶元素不相等，则从入栈队列中取出第一个元素
     * 3.放入栈中，否则跳出和入栈队列元素比较的这个循环，然后删除入栈队列中的这个元素
     * 4.直到最后栈为空，直接跳出
     */
    private static List<Integer> intArrayToList(int[] array){
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        return list;
    }
    public static  boolean IsPopOrder(int[] pushA,int[] popA) {
        if(pushA.length!=popA.length){
            return false;
        }
        //首先将输入顺序和输出顺序数组转化为链表
        List<Integer> pushAList=intArrayToList(pushA);
        List<Integer> popAList=intArrayToList(popA);
        Deque<Integer> stack=new LinkedList<>();
        while(!popAList.isEmpty()){
            int p=  popAList.remove(0);

                while(true) {
                    if (stack.isEmpty() || stack.peek().intValue() != p) {
                        if (pushAList.isEmpty()) {
                            return false;
                        }
                        int q= pushAList.remove(0);
                        stack.push(q);


                    }else{
                        break;
                    }
                }
                stack.pop();
            }
        return true;



    }



    public static void main(String[] args) {
        int[] pushA={1,2,3,4,5};
        int[] popA={5,4,3,2,1};
        System.out.println(IsPopOrder(pushA, popA));

    }
}
