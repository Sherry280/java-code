package Test0807;

import java.util.*;

public class Solution1 {
    /**
     * 打开转盘锁
     * @param deadends  死亡数字，会让转盘锁住打不开
     * @param target  找到这个密码才能打开
     * @return  返回找到这个密码的最短路径
     */
    public int openLock(String[] deadends, String target) {
        Set<String> set=new HashSet<>(Arrays.asList(deadends));
        String startStr="0000";
        if(set.contains(startStr)){
            return -1;
        }
        Queue<String> queue=new LinkedList<>();
        Set<String> visited=new HashSet<>();
        queue.offer(startStr);
        visited.add(startStr);
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                String str=queue.poll();
                for(int i=0;i<size;i++){
                    char ch=str.charAt(i);
                    String strAdd=str.substring(0,i)+(ch=='9'?0:ch-'0'+1)+str.substring(i+1);
                    String strSub=str.substring(0,i)+(ch=='0'?9:ch-'9'-1)+str.substring(i+1);

                    if(str.equals(target)){
                        return level;
                    }
                    if(!queue.contains(strAdd)&&!set.contains(strAdd)){
                        queue.offer(strAdd);
                        set.add(strAdd);
                    }
                    if(!queue.contains(strSub)&&!set.contains(strSub)){
                        queue.offer(strSub);
                        set.add(strSub);

                    }
                }

            }
            level++;



        }
        return -1;

    }
}
