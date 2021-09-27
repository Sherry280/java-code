package Test09.Test0923;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    /**
     * 1，6，[9,3]  0   7
     * 判断数组中的值能否经过k次变成target
     */
    public int qualifiedQuantity (int k, int target, int[] number) {
        int count=0;
        for(int i=0;i<number.length;i++){
            if((number[i]>=target)&&(Math.abs(number[i]-k)<=target)){
                count++;
            }
            if(number[i]+k>=target){
                count++;
            }
        }
        return count;

    }
}
