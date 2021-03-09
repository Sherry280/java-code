package Day3_9;

import java.util.*;

public class PinTu {
    /**
     * 木棒拼图
     * 输入一个数组：确保数组中的数字能够可以拼成一个多边形
     * 1：插入一个；   2：删除一个。
     * 解题思路：
     * 首先要用一个List来存储数组中木棒的长度信息，遍历每一个木棒的长度，如果i=1，则进行插入操作，如果i=2
     * 则进行删除操作，最后还要判断，木棒的长度是否可以构成面积大于0的多边形
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n=sc.nextInt();
            sc.nextLine();
           int sum=0;
           int max=0;
            List<Integer> list=new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] s1 = sc.nextLine().split(" ");

                if (s1[0].equals("1")) {
                    //sum1++;
                  list.add(Integer.parseInt(s1[1]));
                  sum+=Integer.parseInt(s1[1]);

                }else{
                    //sum2++;
                    list.remove(list.indexOf(Integer.parseInt(s1[1])));
                    sum-=Integer.parseInt(s1[1]);
                }
                Collections.sort(list);
                if(list.size()>0){
                    max=list.get(list.size()-1);
                }
                if(sum-max<=max){
                    System.out.println("No");
                }else{
                    System.out.println("Yes");
                }
            }


        }

    }
}
