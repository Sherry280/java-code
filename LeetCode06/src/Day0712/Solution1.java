package Day0712;

public class Solution1 {
    /**
     * H指数数组排序，找出h篇至少被引用h次，剩余的N-h篇引用要小于等于h次
     */
    public static int hIndex(int[] citations) {
        int length=citations.length;
        int left=0;
        int right=length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(citations[mid]>=length-mid){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return length-left;


    }

    public static void main(String[] args) {
        int[] array={0,1,3,5,6};
        System.out.println(hIndex(array));

    }
}
