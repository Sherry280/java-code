package Test10.Test1009;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {
    /**
     * 1,2,3,2,2,3
     * 找出一个数组中最多的数字所在的最小长度
     * 输出2，5
     *
     */
    public static void maxLength(int n,int[] array){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        int max=0;
        int num=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value>=max) {
                max = Math.max(max, value);
                num=key;
            }
        }
        //现在找到出现次数最多的那个数字
        int start=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                start=i+1;
                break;
            }
        }
        int z=start;
        int count=0;
        int end=start;
       while(count<num){
            end++;
            if(array[start]==num){
                count++;
            }
            start++;
        }
        System.out.println(z+" "+end);
//        Arrays.sort(array);
//        int count=0;
//        int ret=array[0];
//        for(int i=1;i<array.length;i++){
//            if(ret==array[i]){
//                count++;
//            }
//        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
            maxLength(n,array);
        }

    }
}
