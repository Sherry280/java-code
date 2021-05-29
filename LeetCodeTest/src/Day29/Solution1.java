package Day29;

import java.util.*;

public class Solution1 {
    /**
     * 警告一个小时内使用员工卡超过三次的员工
     * 思路：先统计
     */
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        //最后输出结果的list
        List<String> ans=new ArrayList<>();
        int n=keyName.length;
        int[] times=new int[n];
        //将时间转化为分钟再计算结果
        for(int i=0;i<n;i++){
            times[i]=parse(keyTime[i]);
        }
        //存放的是员工姓名和打卡的时间
        Map<String,List<Integer>> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.computeIfAbsent(keyName[i],v->new ArrayList<>()).add(times[i]);
        }
        for(Map.Entry<String,List<Integer>> entry:map.entrySet()){
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
    private static int parse(String time){
        String[] split=time.split(":");
        int hour=Integer.valueOf(split[0]);
        int minute=Integer.valueOf(split[1]);
        return hour*60+minute;
    }


    public static void main(String[] args) {
        String[] keyName={"daniel","daniel","daniel","luis","luis","luis","luis"};
        String[] keyTime={"10:00","10:40","11:00","09:00","11:00","13:00","15:00"};
        System.out.println(alertNames(keyName, keyTime));

    }
}
