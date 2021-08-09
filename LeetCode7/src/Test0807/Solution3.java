package Test0807;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution3 {
    /**
     * 判断一个数字是否是丑数，丑数就是它的质因数只包括2，3，5
     * @param n 要判断的那个数字
     * @return  返回是true还是false
     */
    public boolean isUgly(int n) {
        if(n<1){
            return false;
        }
        while(n%5==0){
            n=n/5;
        }
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;


    }
    public static boolean isUgly2(int n){
        if(n<1){
            return false;
        }
        int[] yinshu={2,3,5};
        for(int i:yinshu){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(nthUglyNumber(n));

    }
    public static int nthUglyNumber(int n) {
        //使用堆
        Set<Long> set=new HashSet<>();
        PriorityQueue<Long> heap=new PriorityQueue<>();
        set.add(1L);
        heap.add(1L);
        int[] factors={2,3,5};
        int ugly=0;
        for(int i=0;i<n;i++){
            long curr=heap.poll();
            ugly=(int)curr;
            for(int factor:factors){
                long next=curr*factor;
                if(set.add(next)){
                    heap.offer(next);
                }
            }


        }
        return ugly;


    }

    /**
     * 找出丑数，能被a,b,c整除的数字
     * @param n：找出第n个整数
     * @param a：
     * @param b
     * @param c
     * @return 返回找到的第n个丑数
     */
    public static int nthUglyNumber(int n, int a, int b, int c) {
        int[] p={a,b,c};
        Set<Long> set=new HashSet<>();
        PriorityQueue<Long> heap=new PriorityQueue<>();
        set.add(1L);
        heap.add(1L);
        int ugly=0;
        for(int i=0;i<n;i++){
            long curr=heap.poll();
            ugly=(int)curr;
            for(int j:p){
                long next=j*curr;
                if(set.add(next)){
                    heap.add(next);
                }
            }

        }
        return ugly;


    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        Set<Integer> set=new HashSet<>();
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        set.add(1);
        heap.add(1);
        int ugly=0;
        for(int i=0;i<n;i++){
            int curr=heap.poll();
            ugly=curr;
            for(int a:primes){
                int next=a*curr;
                if(set.add(next)){
                    heap.add(next);
                }
            }
        }
        return ugly;

    }
}
