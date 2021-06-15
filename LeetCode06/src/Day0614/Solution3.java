package Day0614;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    /**
     *布尔运算：给运算符加上括号
     * 最后输出所有加上括号的不同的表达式
     */
    public static List<Integer> diffWaysToCompute(String input){
        if(input==null||input.length()==0){
            return new ArrayList<Integer>();
        }
        //存放最终结果的list
        ArrayList<Integer> curRes=new ArrayList<>();
        int length=input.length();
        //将输入的字符串转成数组，方便使用下标来定位元素
        char[] chars=input.toCharArray();
        for(int i=0;i<length;i++){
            //取出每一个input中的字符
            char c=chars[i];
            if(c=='+'||c=='-'||c=='*'){
                //当前字符如果是符号的话，直接对其进行截取
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
        String input="88-9*5-8";
        System.out.println(diffWaysToCompute(input));

    }
}
