package FebDay9;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    /**
     *
     *返回第一个只出现一次的字母的下标，
     * 下标从0开始
     */
    public static int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map=new HashMap<>();
       for(int i=0;i<str.length();i++){
           if(map.containsKey(str.charAt(i))){

               map.put(str.charAt(i),map.get(str.charAt(i))+1);
           }else{
               map.put(str.charAt(i),1);
           }
       }

       int pos=-1;
       for(int i=0;i<str.length();i++){
           if(map.get(str.charAt(i))==1){
               return i;
           }
       }
       return pos;

    }
    public static void main(String[] args) {
        String str="abcbcea";
        System.out.println(FirstNotRepeatingChar(str));

    }
}
