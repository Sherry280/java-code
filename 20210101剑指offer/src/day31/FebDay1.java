package day31;

import java.util.*;

public class FebDay1 {
    /**
     * 简单错误记录：
     */
    public static class MapValueComparator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o2.getValue().compareTo(o1.getValue());
        }
    }

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new LinkedHashMap<>();
        while(sc.hasNext()){
            String s=sc.next();
            int n=sc.nextInt();
            String[] s1=s.split("\\\\");
            String a=s1[s1.length-1];
            //现在判断路径的长度是否大于16
            if(a.length()>16){
                a=a.substring(a.length()-16);
            }


            String key=a+" "+n;
            int value=1;
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }

        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(
                    map.entrySet());
       Collections.sort(entryList, new MapValueComparator());
        int count=0;
        for(String b:map.keySet()){
            count++;
            if(count>(map.size()-8)){
                System.out.println(b+" "+map.get(b));
            }
        }

    }
    /**
     * 说反话：将一个字符串反着进行输出
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            if(i==0){
                sb.append(s[0]);
                break;
            }
            sb.append(s[i]+" ");
        }
        System.out.println(sb.toString());

    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");

        Stack<String> stack=new Stack<>();
        for(String a:s) {
            if (stack.isEmpty()) {
                stack.add(a);
            }
        }
        //System.out.println(stack.peek());
        for(int i=0;i<s.length-1;i++){
            String s1 = stack.peek();
            if(i==s.length-1){
                System.out.println(s1);
            }else {
                System.out.println(s1 + " ");
            }
            stack.pop();
        }
        //System.out.println(stack.pop());


//        Set<String> set=new HashSet<>();
//        for(String c:s){
//            set.add(c);
//        }
//        for(String ch:set){
//            System.out.print(ch+" ");
//        }

    }
}
