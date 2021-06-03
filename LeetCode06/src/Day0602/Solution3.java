package Day0602;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    /**
     * 为运算表达式设计优先级
     * 分治算法：
     * 分为左右两部分
     */
    public static  List<Integer> diffWaysToCompute(String input) {
        if(input==null||input.length()<=0){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> curRes=new ArrayList<>();
        char[] chars=input.toCharArray();
        int length=input.length();
        for(int i=0;i<length;i++){
            char c=chars[i];
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> leftList=diffWaysToCompute(input.substring(0,i));
                List<Integer> rightList=diffWaysToCompute(input.substring(i+1));
                for(int leftNum:leftList){
                    for(int rightNum:rightList){
                        if(c=='+'){
                            curRes.add(leftNum+rightNum);
                        }else if(c=='-'){
                            curRes.add(leftNum-rightNum);
                        }else{
                            curRes.add(leftNum*rightNum);
                        }
                    }
                }

            }
        }
        if(curRes.isEmpty()){
            curRes.add(Integer.valueOf(input));
        }
        return curRes;

    }

    public static void main(String[] args) {
        String s="2*3-4*5";
        System.out.println(diffWaysToCompute(s));

    }




}
