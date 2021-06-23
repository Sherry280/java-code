package Day0622;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution3 {
    /**
     * 找出循环数组的下一个更大的元素
     * [1,2,1]
     */
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ret=new int[n];
        //没有找到当前元素的后一个元素比他大的数字就将要输出比他大的位置的元素置为-1
        Arrays.fill(ret,-1);
        Deque<Integer> stack=new LinkedList<>();
        //将数组元素进行拼接n-1个，那么此时数组的长度变为n+n-1=2*n-1；
        for(int i=0;i<2*n-1;i++){
            //当前栈不是空 && 当前的栈顶元素比数组元素小，那么就把数组元素放到栈顶位置处
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i%n]){
                ret[stack.pop()]=nums[i%n];
            }
            stack.push(i%n);
        }
        return ret;

    }

    public static void main(String[] args) {
        int[] ret={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(ret)));

    }
}
