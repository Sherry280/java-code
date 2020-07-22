import java.util.Arrays;

public class TestDemo {
    //求数组的平均值
    public static double average(int[] arr){
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static double sum(int[] arr){
        double ret=0.0;
        for(int i=0;i<arr.length;i++){
            ret+=arr[i];
        }
        return ret;
    }
    //数组元素乘以2并打印出来
    public static int[] transform(int[] arr){
        int[] tmp=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            tmp[i]=arr[i]*2;
        }
        return tmp;
    }
    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    public static int[] printArray(int[] arr){
//        int[] tmp={1,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"  ");

        }
        return arr;
    }
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static int[] array1(int[] arr){
        for(int i=0;i<100;i++){
            arr[i]=i+1;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr=new int[100];
        System.out.println(Arrays.toString(array1(arr)));


        //System.out.println(array1());

        //int[] tmp={1,2,3,4};
        //System.out.println(printArray(tmp));



//        int[] arr={1,2,3,4,5,6,7,8,9};
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//        String str=Arrays.toString(arr);
//        System.out.println(str);

        //System.out.println(Arrays.toString(transform(arr)));

        //System.out.println(sum(arr));
        //System.out.println(average(arr));

    }
}
