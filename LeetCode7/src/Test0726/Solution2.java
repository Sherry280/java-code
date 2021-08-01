package Test0726;

import java.util.*;

public class Solution2 {
    /**
     *
     */
    public void split(String s){
        String[] split = s.split(":");
        int[] array=new int[split[0].length()];
        char[] chars = split[0].toCharArray();
        for(int i=0;i<array.length;i++){
            array[i]=Integer.valueOf(chars[i]);
        }
        int k=Integer.valueOf(split[1]);
        //进行求平均值
        Map<Integer,String> map=new HashMap<>();
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=array[i];
        }
        double avg=sum/k;
        sum=0;
        List list=new ArrayList<>();
        int j=1;
        int index=k;
        while(j<array.length-2){
            if(index>0){
                sum+=array[j];
                index--;
            }
            j++;
            //进行


        }
        Collections.sort(list);
        System.out.println(list.indexOf(0));

    }
    public static void main(String[] args) {

    }





}
