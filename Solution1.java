package Test09.Test0904;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

import java.util.Arrays;

public class Solution1 {
    /**
     * 构建乘积数组：新数组为当前数组中除过第i项的所有数字的乘积
     * @param A 不能使用除法，那么就是不能将A中所有元素相乘，再除以A[i]
     *          使用两边相乘的方法；
     * @return
     */
    public int[] multiply(int[] A) {
        if(A.length==0){
            return null;
        }
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            //i=3
            //计算i左边的乘积0-i-1
            int sumLeft=1;
            int sumRight=1;
            int left=0;
            int right=i+1;
            //l从0开始计算，
            while(left<i){
               sumLeft*=A[left];
               left++;
            }
            //计算i右边的乘积i+1-A.length-1;
            while(right<A.length){
                sumRight*=A[right];
                right++;
            }
            res[i]=sumLeft*sumRight;

        }
        return res;

    }
    public String replaceSpace (String s) {
        char[] chars = s.toCharArray();
        String res=s;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                res+="%20";
            }else{
                res+=chars[i];
            }
        }
        return res;
    }
    /**
     *剑指offer：扑克牌排序是否为顺子：输入数据时自行进行转换，将A转为1，将J转为11
     */
    public static boolean IsContinuous(int [] numbers) {
        //如果没有重复，并且最后一个元素减去当前第一个非0的数字的差<=4
        //那么就说明此数组元素有序
        int res=0;
        int zero=0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){
                zero++;
                continue;
            }
            if(i!=0&&numbers[i]== numbers[i-1]){
                return false;
            }
        }
        return numbers[numbers.length-1]-numbers[zero]<=4;
    }

    public static void main(String[] args) {
        int[] numbers={1,2,3,0,0};

        System.out.println(IsContinuous(numbers));
    }
}
