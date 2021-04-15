package Day12;

import java.util.*;

public class HuiWen {
    /**
     * 判断要修改几个字符才能使一个字符串变成回文串
     *
     */
    public static boolean isHuiWen(String s){
        if(s.length() == 0){
            return false;
        }
        if(s.length()==1){
            return true;
        }
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++) {
                String[] s = sc.nextLine().split(" ");

                map.put(s[0],Integer.parseInt(s[1]));
            }
            //把字符串分割后放入map中
            for(String s:map.keySet()){
                //现在怎样对字符串进行分割
                //1.先按照形同字符分割

            }
            int[] arar=new int[9];
            for(int i=0;i<arar.length;i++){
                arar[i]=8;
            }
            char[] c=new char[9];
            char[] c2={'a','b','g'};
            //Collections.sort(c2);
            Arrays.sort(c2);


        }

    }
}
