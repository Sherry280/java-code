package FebDay24;

import java.util.LinkedList;

public class TestDemo1 {
    /**
     * 给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
     */
    public static int maxLength (int[] arr) {
        LinkedList<Integer> list=new LinkedList<>();
        int p=0,ans=0;
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                int j=list.indexOf(arr[i]);
                while(j-->=0){
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            ans=Math.max(ans,list.size());

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,7};
        System.out.println(maxLength(arr));

    }
}
