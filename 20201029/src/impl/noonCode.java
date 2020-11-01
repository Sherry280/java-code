package impl;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class noonCode {
    //输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，
    // 由字母A-Z（包括大、小写）、数字0-9、
    //以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
    //按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //7_This_is_a_test<br/>_hs_s_a_es

        String 实际输入=sc.nextLine();//开始输入的字符串
        String 看到输出=sc.nextLine();//输出的字符串  查找出来的坏的字符

        //为了方便处理，统一对输入的字符串进行大写处理
        实际输入=实际输入.toUpperCase();
        看到输出=看到输出.toUpperCase();

        //将输出的数据组织成一个Set集合
        Set<Character> 所有看到的输出字符=new TreeSet<>();
        for (char ch :
                实际输入.toCharArray()) {
            所有看到的输出字符.add(ch);
        }

        //准备好一个错误按键Set集合    （用于去重）
        Set<Character> 错误字符=new TreeSet<>();
        for (char ch :
                看到输出.toCharArray()){
            错误字符.add(ch);
        }

        //遍历进行输入的每个字符，如果没有在输出中，就表示为一个错误字符
        for (char ch :
                实际输入.toCharArray()) {
            if (!错误字符.contains(ch)){
                //说明ch是刚发现的一个错误
                System.out.print(ch);
                错误字符.add(ch);//添加进去这一步的作用是：遍历的重复的ch进行去重，要不然存在重复的ch值
            }

        }
        System.out.println();
//        System.out.println(所有看到的输出字符);
//        System.out.println(错误字符);






//        //进行比较，创建一个set集合
//        Set<Character> 实际输入=new TreeSet<>();
//        Set<Character> 看到的输入=new TreeSet<>();

        //将输入的字符串都转为大写
//        String 所看到的字符串=readWord.toUpperCase();
//        String 所有错误字符=seeWord.toUpperCase();

        //现在将两组大写字符串都存放在set集合中
//        for (char ch : 所看到的字符串.toCharArray()) {
//            看到的输入.add(ch);
//        }
//        for(char ch:)






    }








}
