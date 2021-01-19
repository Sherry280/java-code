package day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestDemo0118 {
    /**
     *给定一个字符串string和它的大小，s为母串，判断数组p中的每一个字符是否是s的子串
     * @return
     */
    public boolean[] chkSubStr(String[] p, int n, String s) {
        //判断p或者s是否为空
        //将s中的每一个字符添加到set中
        Set<Character> set=new HashSet<>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            set.add(chars[i]);
        }

        boolean[] bb=new boolean[p.length];
        //List<Boolean> list=new ArrayList<>();
        //遍历p中的每一个元素，看他是否能在s中找到
        for(int i=0;i<p.length;i++){
            //bb[i]= set.contains(p[i]);
            boolean equals = set.equals(p[i]);
            bb[i]=equals;
        }
        return bb;

//        for (char ch :
//                s.toCharArray()) {
//            set.add(ch);
//        }


//        for(int i=0;i<s.length();i++){
//            set.add(s.charAt(i));
//
//        }

    }
    public static void main(String[] args) {

        String[] p={"abc","b","c","d","e","f","g"};
        int n=7;
        String s="abc";
        TestDemo0118 t=new TestDemo0118();
        boolean[] booleans = t.chkSubStr(p, n, s);
        System.out.println(Arrays.toString(booleans));
    }
}
