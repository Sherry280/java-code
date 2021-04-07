package Seven7;

public class Solution {
    /**
     * 找出数组中逆序的有多少对  [1,2,3,4,5,6,7,0]  前一个数字要大于后一个数字才算是一对
     * 思路：归并算法
     */
    static int cnt;
    public static int InversePairs(int[] array){
        if(array.length!=0){
            divide(array,0,array.length-1);
        }
        return cnt;
    }
    //归并排序的分治----分
    private static void divide(int[] array, int start, int end) {
        //递归的终止条件
        if(start>=end){
            return;
        }
        //计算中间值，注意溢出
        int mid=start+(end-start)/2;
        //递归---分
        divide(array,start,mid);
        divide(array,mid+1,end);
        //治
        merge(array,start,mid,end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] temp=new int[end-start+1];
        //存一下变量
        int i=start,j=mid+1,k=0;
        //下面就开始进行两两比较，若前面的大于后面的数字
        while (i<=mid&&j<=end){
            if(array[i]<=array[j]){
                temp[k++]=array[i++];
            }else{
                temp[k++]=array[j++];
                cnt=(cnt+mid-i+1)%1000000007;
            }
        }
        while(i<mid){
            temp[k++]=array[i++];
        }
        while(j<=end){
            temp[k++]=array[j++];
        }
        //覆盖原数组
        for(k=0;k<temp.length;k++){
            array[start+k]=temp[k];
        }
    }


    public static int InversePairs1(int [] array) {
        int count=0;
        for(int i=1;i<array.length;i++){
            for(int j=0;j<i;j++){
                if(array[i]<array[j]){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(array));

    }
}
