package Niu1216;

import java.util.*;

public class NiuKe12_27 {
    /**
     * 怎样找字符串CHN的子串
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        long c=0;

        long h=0;

        long n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='C'){
                c++;
//                if(s.charAt(i+1)=='H'&&s.charAt(i)!='N'){
//                    ch++;
//                }
//                if(s.charAt(i+1)=='H'&&s.charAt(i+2)=='N'){
//                    chn++;
//                }

            }else if(s.charAt(i)=='H'){
                h+=c;
//                if(s.charAt(i+1)=='N'){
//                    hn++;
//                }
            }else if(s.charAt(i)=='N'){
                n+=h;
            }
        }
        System.out.println(n);
       //int a=c+ch+chn+h+hn+n;
        //System.out.println(a);
    }

    /**
     * 要求去重后进行重新排列，从小到大进行排列
     * @param args:使用set集对排序后的结果进行打印，输出的结果还是有序的
     */
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        Arrays.sort(array);
        for (int i=0;i<n;i++){
            set.addAll(Collections.singleton(array[i]));
        }
        for(int a:set){
            System.out.print(a+" ");
        }






        
    }
    /**
     * 小乐乐走台阶
     * @param
     */
    private static int sumTai(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return sumTai(n-1)+sumTai(n-2);
        }
    }
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(sumTai(n));
        }
    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(Integer.valueOf(s.charAt(i))%2==0){
                    s=s.replace(s.charAt(i),'0');
                }else{
                    s=s.replace(s.charAt(i),'1');

                }
            }
            System.out.println(Integer.valueOf(s));
        }
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            String s=String.valueOf(n);
            int[] ss=new int[s.length()];
            for(int i=0;i<ss.length;i++){
                if(s.charAt(i)%2==0){
                   ss[i]=0;
                }else{
                    ss[i]=1;
                }
            }
//            for(int i=0;i<ss.length;i++){
//                System.out.print(ss[i]);
//            }
            //System.out.println(Arrays.toString(ss));
        }
    }
}
