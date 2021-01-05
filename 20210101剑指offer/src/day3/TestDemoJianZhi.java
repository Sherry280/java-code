package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 返回一个字符串中较大分组的下标
 * s="abbxxxxxxx"  返回[[3,10]]
 * 根据返回的结果集来判断应该用哪种数据结构
 */
public class TestDemoJianZhi {
    public static List<List<Integer>> largeParts(String s){
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        int n=s.length();
        int num=1;//此时初始的num设置为1而不是0的原因是：
        // 每个数字开始遍历计算出现的次数的时候，都会默认出现一次，所以不能设置为0
        //题目要求出现三次以上的字符串就要计算为较大分组，所以当字符串正好为aaa三位的时候，计算的个数会变成2
        //导致计算结果出现错误
        for(int i=0;i<n;i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    list.add(Arrays.asList(i - num + 1, i));
                }
                num=1;
            }else{
                num++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s="abbxxxxxmmmmmm";
        System.out.println(largeParts(s));


    }
}
