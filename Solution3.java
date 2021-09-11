package Test09.Test0910;

import java.util.*;

public class Solution3 {
    /**
     * 判断一个字符串中有多少个子串能被22整除
     * 求出所有子串，判断子串能否被22整除
     */
    public static int delTwo(String s){
        if(s.length()==0||s==null){
            return 0;
        }
        //使用list存储子串
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        //判断每一个list中的字符串，能否整除22
        int count=0;
        for(String ss:list){
            int i=Integer.parseInt(ss);
            if(i%22==0){
                count++;
            }
        }
        return count;

    }

    //    public static void main(String[] args) {
//        String s="12223";
//        System.out.println(delTwo(s));
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(sc.nextInt(), sc.nextInt());
            }
            //处理每一行数据
            //对于s要判断有几个周期
            char[] chars = str.toCharArray();
            Set<Character> set=new HashSet<>();
            for(char c:chars){
                set.add(c);
            }
            //有多少周期
            int circle=set.size();
            //每个周期有多少个数字
            int length=str.length()/circle;
            for (Map.Entry<Integer,Integer> e:map.entrySet()){
                int key=e.getKey();
                int value=e.getValue();
                if(key<length){
                    System.out.println(key);
                }else{
                    if(value>circle){
                        //第k周期的长度,返回
                        System.out.println(-1);
                    }else{
                        System.out.println(value*length);
                    }
                }

            }

        }
    }
}
