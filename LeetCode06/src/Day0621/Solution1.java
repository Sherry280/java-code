package Day0621;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    /**
     * 二进制手表：高四位表示小时，后六位表示分钟
     * 要求给出一个具体的数字表示灯亮的个数，然后返回所有的可能的组合
     * 肯定不是要用二进制来进行穷举，也不知道咋样来进行穷举
     * 可以将在范围之内的小时和分钟进行遍历 ，然后计算1的个数，把两者的1的数量相加
     * 看是否等于所给定的值count
     */
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    list.add(i+":"+(j<10?"0":"")+j);
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int turnedOn=4;
        System.out.println(readBinaryWatch(turnedOn));

    }

}
