package Day0604;


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    /**
     * 将一个字符串中插入一些小写字母，看是否能够得到目标字符串数组中的每一个
     */
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list=new ArrayList<>();
        List<Character> list1=new ArrayList<>();
        char[] chars = pattern.toCharArray();
        for(int i=0;i<queries.length;i++){
            //将字符串数组每一个都变成字符，然后添加到set集合中
            char[] cc=queries[i].toCharArray();
            for(int j=0;j<cc.length;j++){
               list1.add(cc[i]);
            }
            //遍历目标pattern，看set是否包含
            for(char c:chars){
                if(!list1.contains(c)){
                    list.add(false);
                }
            }
            list.add(true);
        }
        return list;


    }
    public static List<Boolean> camelMatch2(String[] queries, String pattern) {
        List<Boolean> list=new ArrayList<>();
        for(String query:queries){
            boolean match = isMatch(query, pattern);
            list.add(match);
        }
        return list;
    }
    private  static boolean isMatch(String query,String pattern){
        int idx1=0;
        int idx2=0;
        int n1=query.length();
        int n2=pattern.length();
        while(idx1<n1&&idx2<n2){
            char ch1=query.charAt(idx1);
            char ch2=pattern.charAt(idx2);
            if(ch1==ch2){
                idx1++;
                idx2++;
            }else{
                if(ch1>='A'&&ch1<='Z'){
                    return false;
                }
                idx1++;
            }
        }
        if(idx2!=n2)
            return false;
        while(idx1<n1){
            char c=query.charAt(idx1++);
            if(c>='A'&&c<='Z'){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String[] queries={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern="FB";
        System.out.println(camelMatch2(queries, pattern));

    }



}
