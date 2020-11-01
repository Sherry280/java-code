package impl;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class noonCode2 {
    // 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
    // S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
    //J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

    public static int numJewelsInStones(String J, String S) {
        Set<Character> jj=new TreeSet<>();
        Set<Character> ss=new TreeSet<>();
        //现在要将宝石放入集合Set中去
        for (char ch :
                J.toCharArray()) {
            jj.add(ch);
        }

        //遍历我手中的石头，看是不是宝石
        int count=0;
        for(char ch:S.toCharArray()){
            if(jj.contains(ch)){
                count++;
            }
        }
        return count;




    }

    public static void main(String[] args) {
        String J="aA";
        String S="aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
    }

}
