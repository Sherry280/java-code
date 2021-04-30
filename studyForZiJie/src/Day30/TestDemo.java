package Day30;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    /**
     * 有一个数组，其中每个元素都出现了3次，只有一个元素出现了一次，找出出现了一次的那个数字
     * 思路1：直接遍历数组中的元素，放入到HashMap中，记录每个数字和其对应的个数，然后输出其中只有数字只有一个的数字；
     * 思路2：直接定义三个下标,x,y,z，然后从前面开始向后遍历，如果存在三个数字都不相等的情况，
     *       那么输出的肯定是中间的这个数字；
     */
    //思路2：
    public static int singleNumber2(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int x=nums[0];
        int y=nums[1];
        int z=nums[2];
        if(x!=y&&y==z){
            return x;
        }
        int i=3;

        while(i<=nums.length){
            //排序后第一个元素就是一个单身元素：

            //最后一个元素就是一个单身元素
            if(x==y&&y!=z&&i==nums.length){
                return z;
            }
            if(x!=y&&y!=z){
                return y;
            }

            x=y;
            y=z;
            z=nums[i];
            i++;


        }
        return 0;


    }
    private static void swap(int[] nums,int x,int y,int z,int i){
        x=y;
        y=z;
        z=nums[i];
    }



    //思路1：
    public static  int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        int s = 0;
        for(Map.Entry entry:map.entrySet()){
            Object key=entry.getKey();
            Object value = entry.getValue();
            if(value.equals(1)){
                s= (int) key;
                break;
            }
        }
        return s;

    }
    public static void main(String[] args) {
        //int[] arr={1,2,3,3,3,2,2,5,5,5};
        int[] arr={0,1,0,1,0,1,99};
        System.out.println(singleNumber2(arr));

    }
}
