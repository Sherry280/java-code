package Test0726;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution1 {
    /**
     *
     */
    public int[] restoreArray(int[][] adjacentPairs){
        int[] re=new int[adjacentPairs.length+1];
        return re;
    }

    public static void main(String[] args) {
        int[][] array={{1,2},{2,3},{3,4}};
        int[] a=array[0];
        int[] b=array[1];
        System.out.println(Arrays.toString(a));
        System.out.println(array.length);
        System.out.println(array[0].length);


    }
}
