package Day0630;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution3 {

    /**
     * 字符串中找出连续最长的字串
     */
    public static String sort(String s){
        char[] chars=s.toCharArray();
        String str="";

        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            //
            while(chars[i]>=0&&chars[i]<=9&&chars[i+1]>=0&&chars[i+1]<=9){
                str+=chars[i];
            }
            str+=chars[i];
            list.add(str);
            str="";
        }

        String index=list.get(0);
        for(String ss:list){
            while (ss.length()>index.length()){
               index=ss;
            }
        }
        return index;
    }
    public static void main(String[] args) {

        int[] array={1,2,66,3,811,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));;

    }
}
