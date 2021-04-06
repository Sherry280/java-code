package Six6;

import java.util.Arrays;

public class Solution2 {
    /**
     * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。
     * 思路：两个数字如果相等的话，则他们的异或的结果为0
     * 但是怎样找出两个数字呢？
     *
     */
    public static int[] FindNumsAppearOnce (int[] array) {
        int res=0;
        int[] ret=new int[2];
        for(int i=0;i<array.length;i++){
            res^=array[i];
        }
        int compare=1;
        while((compare&res)==0){
            compare<<=1;
        }
        int a=0;
        int b=0;
        for(int i=0;i<array.length;i++){
            if((compare&array[i])==0){
                a^=array[i];
                ret[0]=a;
            }else{
                b^=array[i];
                ret[1]=b;
            }
        }
        Arrays.sort(ret);
        return ret;



    }




    public static void main(String[] args) {
        int[] array={1,1,2,3,4,5,7,6,6,7,4,2};
        System.out.println(Arrays.toString(FindNumsAppearOnce(array)));

    }
}
