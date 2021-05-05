package Day5;

public class OneAndTwo {
    /**
     * 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
     * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
     *
     * 思路：将数组分割成0，10，11的组合并且最后一位必须是以0结尾；
     */

    public static boolean isOneBitCharacter2(int[] bits){
        if(bits.length<=0){
            return false;
        }
        //原因：截至最后一个比特位之前，根据0，1，比特位进行划分，如果最后的前一个是1，则要加2，末尾就不可能
        //为0，末尾前一位是0的话，则只需将i的控制位数加1即可；
        int i=0;
        while(i<bits.length-1){
            if(bits[i]==1){
                i+=2;
            }else{
                i+=1;
            }
        }
        return i==bits.length-1;
    }
    public static  boolean isOneBitCharacter(int[] bits) {
        if(bits[bits.length-1]!=0){
            return false;
        }
        int i=0;
        while(i<bits.length){
            while(i<bits.length&&bits[i]==1){
                i=i+2;
            }
            while(i<bits.length&&bits[i]==0){
                i=i+1;
            }

        }
        if(i==bits.length&&bits[bits.length-1]==0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int[] bits={1,1,0,0,0,1,1,0};
        System.out.println(isOneBitCharacter2(bits));
    }
}
