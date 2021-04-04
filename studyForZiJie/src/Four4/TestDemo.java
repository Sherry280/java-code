package Four4;

import java.util.Arrays;

public class TestDemo {
    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     *
     *
     */
    public static void swap(int[] array,int left,int right){
        int tmp=array[left];
        array[left]=array[right];
        array[right]=tmp;
    }
    public static int[] reOrderArray (int[] array) {
        //使用挖坑法
        int left=0;
        int right=array.length-1;
        while(left<right){
            if(array[left] % 2 != 0){
                left++;
            }
            if(left<right&&array[right]%2==0){
                right--;
            }
            swap(array,left,right);
        }
        swap(array,left,right);

        //对数组中的元素进行排序
//        int index=0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]%2==0){
//                index=i;
//
//            }
//        }
        Arrays.sort(array,0,array.length/2+1);
        Arrays.sort(array,array.length/2+1,array.length);
        return array;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reOrderArray(array)));

    }
    /**
     * 旋转数组中最小的数字：
     *把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */
    public static int minNumberInRotateArray(int [] array) {
        int n=array.length;
        if(n==0){
            return 0;
        }
        int left=0;
        int right=n-1;
        int mid=0;
        while(array[left]>=array[right]){
            //一定要保证已经经过了旋转
            if(right-left==1){
                mid=right;
                break;
            }
            mid=left+(right-left)/2;
            if(array[left]==array[right]&&array[left]==array[mid]){
                return MinOrder(array,left,right);
            }
            if(array[left]<=array[mid]){
               left=mid;
            }else{
                right=mid;
            }
        }
        return array[mid];

    }
    public static int MinOrder(int[]  array,int left,int right){
        int result=array[left];
        for(int i=left+1;i<right;i++){
            if(array[i]<result){
                result=array[i];
            }
        }
        return result;
    }
    public static void main2(String[] args) {
        int[] array={6,8,9,1,4};
        System.out.println(minNumberInRotateArray(array));


    }

    /**
     * 在一个二维数组中查找是否包含某个二维数组中的数字
     * int[] array,int target
     *思路：
     */
    public static boolean Find2(int target,int[][] array){
        int h=array.length;
        int l=array[0].length;
        //从右上角第一个元素开始进行比较
        int i=0;
        int j=l-1;
        while(i<h-1&&j>=0){
            if(target==array[i][j]){
                return true;
            }else if(target>=array[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public  static boolean Find(int target, int [][] array) {
        int h=array.length;
        int l=array[0].length;
        for(int i=0;i<h;i++){
            for(int j=l-1;j>=0;j--){
                if(array[i][j]==target){
                    return true;
                }else if(array[i][j]>target){
                    continue;
                }else{
                    break;
                }

            }

        }
        return false;


    }

    public static void main1(String[] args) {
        int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target=12;
        System.out.println(Find2(target, array));

    }
}
