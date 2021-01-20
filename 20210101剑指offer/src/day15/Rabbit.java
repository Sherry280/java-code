package day15;
import java.util.Arrays;
import java.util.Scanner;

public class Rabbit {
    /**
     * 返回数组中超过数组一半的某个数值
     * @param gifts：放置红包金额的数组
     * @param n： 红包的个数
     * @return
     */
    public static int getValue(int[] gifts, int n) {
        int[] g=new int[n];
        for(int i=0;i<n;i++){
            g[i]=0;
        }
        //System.out.println(Arrays.toString(g));

        int length=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(gifts[i]==gifts[j]){
                    g[i]++;
                }
            }
        }
        for(int i=0;i<g.length;i++){
            if(g[i]>=(gifts.length/2)){
                length=i;
            }
        }

        return gifts[length];



//        int[] array=new int[10];
//        for(int i=0;i<gifts.length;i++){
//            array[gifts[i]-'0']++;
//        }
//        System.out.println(Arrays.toString(array));
//        for(int i=0;i<array.length;i++){
//            if(array[i]>(n/2)){
//                return array[i];
//            }
//        }
//        return 0;
    }
    public static void main(String[] args) {
        int[] gifts={1,2,3,2,2};
        int n=5;
        System.out.println(getValue(gifts, n));

    }
    /**
     * 密码替换：字母与密码表相对应
     * 要将字母与密码之间的对应关系写成一个方法，每次进行调用
     *
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            char[] chars=s.toCharArray();
            for(int i=0;i<chars.length;i++){
                if(chars[i]>='A'){
                    char c=(char)(chars[i]>'E'?(chars[i]-5):(chars[i]+21));
                    chars[i]=c;
                }

            }
            System.out.println(new String(chars));


        }
    }



    public static int getMonthCount(int month){
        if(month==1||month==2||month==0){
            return 1;
        }
        return getMonthCount(month-1)+getMonthCount(month-2);
    }
    public static void main1(String[] args) {
        System.out.println(getMonthCount(0));

    }
}
