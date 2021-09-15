package Test09.Test0913;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution4 {
    /**
     * 怎样判断字符串中是否包含汉字
     */
    public static void main(String[] args) {
        String str="邢美女iloveyou";
        String ret="loveyou";
        int count = 0;
        String reg = "[\\u4e00-\\u9fa5]";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        while (m.find()) {

            for (int i = 0; i <= m.groupCount(); i++) {
                count = count + 1;
            }
        }
        System.out.println("共有汉字 " + count + "个 ");
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();



    }
}
