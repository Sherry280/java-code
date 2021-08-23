package Test0813.Test0823;

import java.lang.reflect.Array;
import java.util.*;

public class Solution1 {
    /**
     *
     */
    public static int getMinLength (int[][] pearls) {
        if(pearls.length==0||pearls==null){
            return 0;
        }
        int sum=0;
        //把每一个坐标到第一个坐标的值计算出来
        List<Integer> list=new ArrayList<>();
        int x=pearls[0][0];
        int y=pearls[0][1];
//        for(int[] a:pearls){
//            for(int[] aa:pearls){
//                x=
//            }
//             x=Math.abs(a[0]-x);
//             y=Math.abs(a[1]-y);
//             list.add(x+y);
//        }

        Arrays.sort(pearls);

//       for(int i=0;i<pearls.length;i++){
//           for(int j=0;j<pearls[0].length;j++){
//               x=pearls[i][0]-
//           }
//       }
        Collections.sort(list);
            for(int i=0;i<3;i++){
                sum+=list.get(i);
            }

        return sum;
    }
    public static void main(String[] args) {
        int[][] pearls={{0,0},{0,2},{1,1},{10,10}};
        System.out.println(getMinLength(pearls));

    }
}
