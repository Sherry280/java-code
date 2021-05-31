package Day29;

import java.util.*;

public class Solution2 {
    /**
     * 警告一小时内打卡次数超过三次的员工
     */
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> ans=new ArrayList<>();
        int n=keyName.length;
        int[] time=new int[n];
        //将keyTime转化为统一的分钟来进行比较
        for(int i=0;i<n;i++){
            time[i]=parse(keyTime[i]);
        }
        Map<String,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(keyName[i],v->new ArrayList<>()).add(time[i]);
        }
        for(Map.Entry<String,List<Integer>> entry:map.entrySet()){
            //现在将所有的value值取出来，然后进行排序
            List<Integer> value=entry.getValue();
            if(value.size()<3){
                continue;
            }
            Collections.sort(value);
            int size=value.size();
            for(int i=0;i<size-2;i++){
                if(value.get(i+2)-value.get(i)<=60){
                    ans.add(entry.getKey());
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;

    }

    private static int parse(String s) {
        String[] split=s.split(":");
        int hour=Integer.valueOf(split[0]);
        int minute=Integer.valueOf(split[1]);
        return hour*60+minute;
    }

    public static void main(String[] args) {
        String[] keyName={"alice","alice","alice","bob","bob","bob","bob"};
        String[] keyTime={"12:01","12:00","18:00","21:00","21:20","21:30","23:00"};
        System.out.println(alertNames(keyName, keyTime));
    }
}
