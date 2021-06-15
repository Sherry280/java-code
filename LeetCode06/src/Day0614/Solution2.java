package Day0614;

public class Solution2 {
    /**
     *山脉数组arr，返回组成山脉数组的顶峰元素的下标
     */
    //方法1：
    public static int peakIndexInMountainArray(int[] arr) {
        int i=0;
       while(arr[i]<arr[i+1]){
           i++;
       }
       return i;

    }
    //方法2：直接对数组进行一次遍历，当前一个数组元素不再小于后一个元素的时候，直接返回当前的i
    public static int peakIndexInMountainArray2(int[] arr){
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                index=i;
                break;
            }
        }
        return index;
    }
    //方法3：使用二分查找来找到最大的数的下标
    public static int peakIndexInMountainArray3(int[] arr){
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
    //方法4：二分查找
    public static int peakIndexInMountainArray4(int[] arr){
        int left=1,right=arr.length-2,ans=0;
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid]>arr[mid+1]){//最大的元素应该在前面一部分数据当中
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={0,2,1,0};
        System.out.println(peakIndexInMountainArray4(arr));

    }



}
