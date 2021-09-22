package Test09.Test0916;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution4 {
    //static int count=0;
    //先把所有回文串找出来
    public static String[]  huiWen(String s){

        char[] chars = s.toCharArray();
        int n=chars.length;
        int size=((1+n)*n);
        String[] arrStr=new String[size];
        int k=0;
        for(int i=0;i<chars.length;i++){
            for(int j=i;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    arrStr[k]=s.substring(i,j+1);
                    k=k+1;
                }
            }
        }
        return arrStr;

    }
    public static int count(String[] array){

        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!="0"&&array[i]!="1"){
                return 0;
            }
            if(array[i]==null){
                return 0;
            }
            if(array[i].length()==1){
                count++;
            }else{
                boolean isHuiWen=true;
                char[] chars=array[i].toCharArray();
                for(int j=0;j<chars.length;j++){
                    if(chars[j]!=chars[chars.length-1-j]){
                        isHuiWen=false;
                        break;
                    }
                }
                if(isHuiWen){
                    count++;
                }

            }
        }
        return count;
    }
    public static void digui(int i,int j,char[] chars){
        if(i-j==1||i==j){
            //count++;
        }else{
            if(chars[i]==chars[j]){
                digui(i+1,j,chars);
            }else{
                return;
            }
        }
    }
    /**
     * 找出数组中出现次数最多的数字，记为m，出现次数最少的记为n，
     * 出现次数最多的若有多个，取最大的，出现次数最少的，取最小的
     * 10
     * 1 2 1 3 5 4 2 1 3 3
     * 1  3,   2  2
     */
    public static int maxMin(int n,int[] array){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        //遍历map中存入的数字
        int max=0;
        int min=1;
        int rea=0;
        int rei=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            //拿到当前个数最多的value对应的key值
            //取出现次数最多的数字 如果有多个，则取最大的
            if(value>=rea) {
                max = Math.max(max,key );
                rea=value;
            }
            //最少的数字出现次数一样多，则取最小的,出现次数都是一样少的，取最小的
            if(value<=rei){
                min=Math.min(min,key);
                rei=value;
            }
        }
        min=Integer.MAX_VALUE;
        //已经找到当前出现次数最多的个数和出现次数最少的个数
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value==rea){
                max=Math.max(max,key);
            }
            if(value==rei){
                min=Math.min(min,key);
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            System.out.println(maxMin(n, array));
        }

    }
}
