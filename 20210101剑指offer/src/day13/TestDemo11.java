package day13;

import java.util.*;

public class TestDemo11 {
    /**
     * 使用哈希表解决问题
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int[] array=new int[10];
        for(int i=0;i<n.length();i++){
            array[n.charAt(i)-'0']++;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                System.out.println(i+":"+array[i]);
            }
        }


    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        char[] chars = n.toCharArray();

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(0);
        }

        for(int i=0;i<chars.length;i++){
            list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
        }
        for(int i=0;i<chars.length;i++){
            if(list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }






//        int count=0;
//        while (n!=0){
//            n%10;
//            n/=10;
//        }
//        int[] array=new int[n];
//        for(int i=0;i<n;i++){
//            while (n!=0){
//                array[i]=n%10;
//                n/=10;
//            }
//
//        }
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }



//        Set<Integer> set=new HashSet<>();
//        for(int i=0;i<array.length;i++){
//            set.add(s .charAt(i));
//        }
//        Map<Integer,Integer> map=new HashMap<>();
//        int count=0;
//        for(int i=0;i<array.length;i++){
//            map.put(s.charAt(i),count);
//        }

    }
}
