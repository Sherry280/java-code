package day31;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FebDay3 {
    /**
     * 上楼梯：可以一次上一个楼梯，2个台阶，三个台阶
     */
    public static int countWays(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return countWays(n-1)+countWays(n-2)+countWays(n-3);
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(countWays(n));

    }
    /**
     * 剪刀石头布：看谁赢得次数多
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,String> map=new TreeMap<>();
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] s1 = s.split(" ");
            //赢得：步-石头C     石头--剪刀J     剪刀---布B   这三种情况
            //输出的是：胜  平  负的次数
            //都放到map里面，key=布，value=石头，就赢，count++
                map.put(s1[0],s1[1]);


        }
        int count=0;//记录获胜的次数
        int p=0;//记录平局的次数
        int f=0;

        int B=0;
        int C=0;
        int J=0;

        for(Map.Entry<String, String> e:map.entrySet()){
            String key=e.getKey();
            String value=e.getValue();
            if(key=="B"&&value=="C"){
                count++;
                B++;
            }
            if(key=="C"&&value=="J"){
                count++;
                C++;
            }
            if(key=="J"&&value=="B"){
                count++;
                J++;
            }
            if(key=="B"&&value=="B"){
                p++;
            }
            if(key=="J"&&value=="J"){
                p++;
            }
            if(key=="C"&&value=="C"){
                p++;
            }

        }
        f=n-count-p;
        //怎样计算甲乙出哪一个获胜的次数多
        int i = B > C ? (B > J ? B : J) : (C > J ? C : J);
        System.out.println(count+" "+p+" "+f);
        System.out.println(f+" "+p+" "+count);




    }
}
