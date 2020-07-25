import java.util.Arrays;

public class TestDemo {

     public static String myString(int[] array){
         String a =new String();
         for(int i=0;i<array.length;i++){

             //System.out.println(array[i]+"  ");
         }
         return a;

     }
     //二分查找

     public static int binarySearch(int[] arr,int key){
         int left=0;
         int right=arr.length-1;

         while(left<=right) {
             int mid=(left+right)/2;
             if (arr[mid] > key) {
                 right = mid - 1;
             }
             if (arr[mid] < key) {
                 left = mid + 1;
             }
             if (arr[mid] == key) {
                 return mid;
             }

         }

         return -1;


     }

     public static double average(int[] arr){
         int ret=0;
         for(int i=0;i<arr.length;i++){
             ret+=arr[i];
         }
         return ret/arr.length;
     }
     //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} ,
    // 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
    public static String toString(int[] arr){
         if(arr==null){
             return null;
         }
         if(arr.length==0){
             return "[]";
         }
         String ret="[";
         for(int i=0;i<arr.length;i++){
             if(i!=arr.length-1){
                 ret=ret+arr[i]+",";

             }else{
                 ret=ret+arr[i]+"]";
             }

         }
         return ret;
    }
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static int[] copyOf(int[] arr){
         int[] arr2=new int[arr.length];
         for(int i=0;i<arr.length;i++){
             arr2[i]=arr[i];
         }
         return arr2;
    }
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static int[] bubbleSort1(int[] arr,int n){
         if(n<=1){
             return arr;
         }
         for(int i=0;i<n;i++){
             boolean flag=false;
             for(int j=0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int tmp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=tmp;
                     flag=true;
                 }
             }
             if(!flag)
                 break;
         }
         return arr;

    }
    //给定一个整型数组, 判定数组是否有序（递增
    public static boolean isSorted(int[] arr){

         for(int i=0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                return false;
             }
             }
         return true;
    }
    /**
      * @Description: 判断数组是否有序
      * @Param:
      * @return:
      * @Auther: xingyuyu
      * @Date: 2020/7/24
      */
    public static boolean isSorted2(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void bubbleSort(int[] array){

    }


    public static void main(String[] args) {
         int[] arr={2,3,4,5,66,9};
        System.out.println(isSorted(arr));


//         int flag=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<arr[i+1]){
//                 flag++;
//
//             }
//             break;
//         }
//         if(flag==arr.length-1){
//             System.out.println("zeng");
//         }



//         int[] ret=new int[arr.length];
//         ret=bubbleSort(arr,arr.length);
//        System.out.println(Arrays.toString(ret));


        //int[] arr={4,5,6,7,8,9,77};
        //System.out.println(Arrays.toString(copyOf(arr)));


//         int[] arr={1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));


//         int[] arr={1,2,33,56,78};
//        System.out.println(binarySearch(arr, 56));
        //System.out.println(average(arr));
//        int[] array={1,2,3};
//        String ret=myString(array);
//        System.out.println(ret);
    }


}
