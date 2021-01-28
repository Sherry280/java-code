package day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestDay {
    /**
     * 验证密码是否合格
     */
    public static boolean  sort(String s){
        int[] array=new int[4];
        for(int i=0;i<s.length();i++){
            int tmp=(int)s.toCharArray()[i];
            if(tmp>47&&tmp<58){
                array[0]+=1;
            }else if(tmp>64&&tmp<91){
                array[1]+=1;
            }else if(tmp>96&&tmp<123){
                array[2]+=1;
            }else{
                array[3]+=1;
            }
        }
        int sum=0;
        for(int i=0;i<4;i++){
            if(array[i]==0){
                sum++;
            }
        }
        return sum < 2;

    }
    public static boolean sub(String str1){
        //统计长度超过2的子串
        Map<String,Integer> substr1=new HashMap<>();
        int i=0;

        for( i=0;i+3<str1.length()+1;i++){
            String tmp=str1.substring(i,3);
            substr1.put(tmp,1);
        }
        return false;

        //	for (i = 0;i+3<len+1; i++)//此处讨巧直接统计长度为3的子串，速度为对应j属于(3,len)的1/5
        //		{
        //			tmp = str1.substr(i,3);
        //			if (substr1.find(tmp) == substr1.end())
        //				substr1[tmp] = 1;
        //			else
        //				substr1[tmp] += 1;
        //		}
        //	int nsize = substr1.size();
        //	map<string ,int>::iterator iter;
        //	for (iter = substr1.begin(); iter != substr1.end(); iter++)
        //	{
        //		if (iter->second > 1)
        //			k=-1;
        //	}
        //	return k;
        //}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            //判断长度
            if(s.length()<8){
                System.out.println("NG");
                break;
            }
            //判断字符串的种类
            boolean sort = sort(s);
            //寻找是否存在相同字串



            if(sort){
                System.out.println("OK");

            }else{
                System.out.println("NG");

            }
        }

    }
    /**
     * 守形数：先求平方，再判断最后是不是本身
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=n*n;
            String s = String.valueOf(m);
            int i = s.lastIndexOf(String.valueOf(n));
            //int i = s.lastIndexOf(n);
            if(i>0){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }

    }
}
