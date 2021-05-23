package Day23;


import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    /**
     * 给定两个字符串 s1 和 s2，请编写一个程序，
     * 确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
     */
    //方法1：先将字符串转换为数组，然后对数组进行排序后，又将数组转换成为字符串
    public static  boolean CheckPermutation(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        //再将数组转换成字符串，进行判断是否相等
        return new String(c1).equals(new String(c2));

    }
    //方法2：利用hashMap计数
    public static boolean CheckPermutation2(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> s1Map=getMap(s1);
        Map<Character,Integer> s2Map=getMap(s2);
        char[] c1=s1.toCharArray();
        for(char ch:c1){
            if(!s2Map.containsKey(ch)||s2Map.get(ch)!=s1Map.get(ch)){
                return false;
            }

        }
        return true;
    }
    private static Map<Character,Integer> getMap(String s){
        Map<Character, Integer> map=new HashMap<>();
        char[] chars = s.toCharArray();
        for(char ch:chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;

    }
    //方法3：利用桶来计数，效率更高一点
    public static boolean CheckPermutation3(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] c1=count(s1);
        int[] c2=count(s2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;

    }
    private static int[] count(String s){
        int[] c=new int[26];
        char[] chars=s.toCharArray();
        for(char cc:chars){
            c[cc-'a']++;
        }
        return c;
    }


    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdba";
        System.out.println(CheckPermutation2(s1, s2));

    }



}
