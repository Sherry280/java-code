package Day0624;

import java.util.*;

public class Solution2 {
    /**
     * 旋转转盘，进行密码盘的解密
     * 思路：  初始：0000  然后从第一个数字开始转动进行匹配，每转动到符合要求的一位数字的时候（每次只能
     *       转动到相邻的一个数字），
     *       那么都要与deadends中的字符串进行比较，用HashMap来存储死亡数字
     */
    public int openLock(String[] deadends, String target) {
        //目标值==起始值
        if("0000".equals(target)){
            return 0;
        }
        //目标值==死亡值
        Set<String> dead=new HashSet<>();
        for(String deads:deadends){
            dead.add(deads);
        }
        if(dead.contains("0000")){
            return -1;
        }
        //正常情况下：
        int step=0;
        Queue<String> queue=new LinkedList<>();
        //queue.add("0000");
        queue.offer("0000");
        Set<String> seen=new HashSet<>();
        seen.add("0000");

        while(!queue.isEmpty()){
            step++;
            int size=queue.size();
            for(int i=0;i<size;i++){
                String status=queue.poll();
                //判断当前字符串的下一个字符串是否是合法的
                for(String nextStatus:get(status)){
                    while(!seen.contains(nextStatus)&&!dead.contains(nextStatus)){
                        if(nextStatus.equals(target)){
                            return step;
                        }
                        queue.offer(nextStatus);
                        seen.add(nextStatus);
                    }

                }
            }

        }
        return -1;



    }

    private List<String> get(String status) {
        List<String> ret=new ArrayList<>();
        char[] chars = status.toCharArray();
        for(int i=0;i<4;i++){
            char array=chars[i];
            chars[i]=numPrev(array);
            ret.add(new String(chars));
            chars[i]=numSub(array);
            ret.add(new String(chars));
            chars[i]=array;


        }
        return ret;
    }

    private char numPrev(char array) {
        return array=='0'?'9':(char)(array-1);
    }
    private char numSub(char array){
        return array=='9'?'0':(char)(array+1);
    }

    public static void main(String[] args) {
        Solution2 s=new Solution2();
        String[] deadends={"0202","8705"};
        String target="8888";
        System.out.println(s.openLock(deadends, target));


    }
}
