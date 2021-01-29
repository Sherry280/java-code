package day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestDay22 {
    /**
     * 买珠子生意
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//商人有的珠子
        String m=sc.nextLine();//小红要买的珠子

        //遍历商家有的珠子，统计数量
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        //遍历小红有的珠子
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:m.toCharArray()){
            if(map2.containsKey(c)){
                map2.put(c,map2.get(c)+1);
            }else{
                map2.put(c,1);
            }
        }

        //计算差值，以小红为参考
        boolean wealthBy=true;
        int lack=0;
        for(Map.Entry<Character,Integer> en:map2.entrySet()){
            char k=en.getKey();
            int v=en.getValue();
            if(map.containsKey(k)&&map.get(k)<v){
                //商家有珠子，但是珠子的数量不够
                wealthBy=false;
                lack+=v-map.get(k);
            }else if(!map.containsKey(k)){
                //商家没有小红要买的珠子
                wealthBy=false;
                lack+=v;
            }

        }
        if(wealthBy){
            System.out.println("Yes "+(s.length()-m.length()));
        }else{
            System.out.println("No "+lack);
        }
//ppRYYGrrYBR2258<br/>YrR8RrY

    }
}
