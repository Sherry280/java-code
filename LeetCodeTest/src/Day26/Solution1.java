package Day26;

import sun.awt.datatransfer.DataTransferer;

import java.util.*;

public class Solution1 {
    /**
     * 返回字符串中最多元素的个数
     */
    public int maxPower1(String s) {
        Map<Character,Integer> map=new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                //默认return 0为降序
                return o1.getValue().compareTo(o2.getValue());//shengxu
            }
        });


        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char key=entry.getKey();
            int value=entry.getValue();


        }
        return 0;

    }
    static class MyComparator implements Comparator<Character>{
        private final Map<Character, Integer> map;
        public MyComparator(Map<Character,Integer> map){
            this.map=map;
        }

        @Override
        public int compare(Character o1, Character o2) {
            if(map.get(01).intValue()>map.get(o2).intValue()){
                return -1;
            }
            if(map.get(o1).intValue()<map.get(o2).intValue()){
                return 1;
            }
            return 0;

        }
    }
    public static int maxPower(String s){
        int ans=0;
        int count=1;
        char prev=s.charAt(0);
        char[] chars = s.toCharArray();
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=prev){
                ans=Math.max(count,ans);
                prev=chars[i];
                count=1;
            }else{
                count++;
            }
        }
        return Math.max(ans,count);

    }
    public static int maxPower3(String s){
        int i=0;
        int j=1;
        int count=1;
        if(s.length()==1){
            return 1;
        }
        int max=Integer.MIN_VALUE;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
               count++;
                if(j==s.length()-1){
                    max=Math.max(count,max);
                }
                j++;
            }else{
                max=Math.max(max,count);
                i=j;
                j++;
                count=1;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String s="aaaaacbfd";
        System.out.println(maxPower3(s));

    }



}
