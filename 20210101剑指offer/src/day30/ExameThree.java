package day30;

import java.math.BigInteger;
import java.util.*;


public class ExameThree {
    /**
     * 大整数排序
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger[] arr=new BigInteger[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextBigInteger();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
    /**
     * 单调栈结构
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }

            Stack<Integer> stack=new Stack<>();

            int[] left=new int[n];
            int[] right=new int[n];
            for(int i=0;i<n;i++){
                if(stack.empty()){
                    stack.add(array[i]);
                }
            }

//            List<Integer> list=new ArrayList<>();
//            for(int i=0;i<n;i++) {
//                list.add(array[i]);
//            }

            //System.out.println(Arrays.toString(list.toArray()));
        }

    }
    /**
     * 查找数组中出现一次的两个数字
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            long n=sc.nextLong();
            long[] array=new long[(int) n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextLong();
            }

            Arrays.sort(array);

            Map<Long,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(array[i])) {
                    map.put(array[i], map.get(array[i])+1);
                }else{
                    map.put(array[i],1);
                }
            }

            for(Map.Entry<Long,Integer> en:map.entrySet()){
                long k=en.getKey();
                long v=en.getValue();
                if(v % 2 != 0){
                    System.out.print(k+" ");
                }
            }

        }

    }
}
