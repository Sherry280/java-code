package Test09.Test0916;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution2 {
    public static String removeWords(String s){
        Map<Character,Integer> map=new HashMap<>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        Iterator<Map.Entry<Character,Integer>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry=it.next();
            char key=entry.getKey();
            int value=entry.getValue();
            if(value>=3){
                it.remove();
            }
        }
//        for(Map.Entry<Character,Integer> e:map.entrySet()){
//            char key=e.getKey();
//            int value=e.getValue();
//            if(value>=3){
//                map.remove(key);
//            }
//        }
        //将map中剩余的字符拿出来 b:2 c:1   111222gggbcb
        String res="";
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                res+=chars[i];
            }
        }
//        for(Map.Entry<Character,Integer> e:map.entrySet()){
//            char key=e.getKey();
//            int value=e.getValue();
//            if(k<s.length()&&chars[k]==key){
//                res+=chars[k];
//                k=k+1;
//            }
//        }
        return  res;
    }

    public static void main(String[] args) {
        String s="1177j";
        System.out.println(removeWords(s));
    }
}
