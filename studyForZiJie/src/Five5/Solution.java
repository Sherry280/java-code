package Five5;

import java.util.*;

public class Solution {
    /**
     * 栈的压入、弹出顺序判定
     */
    //将数组转化为链表，可以判断其是否为空
    private List<Integer> intArrayToList(int[] array){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        return list;
       // List list5= Arrays.asList(array);
    }
    public boolean IsPopOrder(int[] pushA,int[] popA){
        List<Integer> pushList=intArrayToList(pushA);//输入
        List<Integer> popList=intArrayToList(popA);//输出

        //实现存放元素的栈
        Deque<Integer> stack=new LinkedList<>();
        //弹出的列表不为空
        while(!popList.isEmpty()){
            int p=popList.remove(0);//取出弹出列表的第一个元素进行判断
            while(true){
                //存放输入数字的栈不为空   栈的第一个元素和弹出的第一个元素不相等的时候
                if(stack.isEmpty()||stack.peek().intValue()!=p){
                    if(pushList.isEmpty()){
                        return false;
                    }
                    //取出pushA的第一个元素
                    int q=pushList.remove(0);
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
        int[] popA={4,5,3,2,1};
        Solution s=new Solution();
        System.out.println(s.IsPopOrder(pushA, popA));

    }
}
