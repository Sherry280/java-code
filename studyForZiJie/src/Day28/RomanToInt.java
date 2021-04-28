package Day28;

import java.beans.PropertyEditorSupport;
import java.util.HashMap;

public class RomanToInt {
    /**
     * 罗马数字转整数
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     *
     */
    public static int romanToInt2(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                sum-=map.get(s.charAt(i));
            }else{
                sum+=map.get(s.charAt(i));
            }
        }
        return sum;
    }
    public static  int romanToInt(String s) {
        //先进行处理字符串中的异常情况
        s=s.replace("IV","a");
        s=s.replace("IX","b");
        s=s.replace("XL","c");
        s=s.replace("XC","d");
        s=s.replace("CD","e");
        s=s.replace("CM","f");

        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        map.put('a',4);
        map.put('b',9);
        map.put('c',40);
        map.put('d',90);
        map.put('e',400);
        map.put('f',900);


        int result=0;
        for(int i=0;i<s.length();i++){

            result+=map.get(s.charAt(i));
//            if(s.charAt(i)>=s.charAt(i+1)){
//                result+=result+(map.get(i)+map.get(i+1));
//            }else{
//                result+=result+(map.get(i+1)-map.get(i));
//            }
        }
        return result;

    }

    public static void main(String[] args) {
        String s="IV";
        System.out.println(romanToInt2(s));
    }
}
