package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //先开辟一个新的数组，遍历，将
//        while(sc.hasNext()){
            int n=sc.nextInt();//数组中元素的个数
            int[] array=new int[n+1];//开辟的数组的大小
            for(int i:array){//把元素放进数组
                int s=sc.nextInt();
                array[i]=s;
            }
            int last=sc.nextInt();//最后要插进来的数字
            array[n]=last;//最后要插进来的数字放在数组的最后一个位置上
            Arrays.sort(array);

            for(int i=0;i<n+1;i++){
                System.out.print(array[i]+" ");
            }
            //System.out.println();

        //}
    }
}
