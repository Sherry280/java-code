package javaTest.file;


import java.util.Arrays;
import java.util.Random;

/**
 * java中的包装类的转换方法
 */
public class AssemblyParseDemo {
    /**
     * 属性的封装
     */
    public static void main(String[] args) {


    }



    /**
     * 数组的麻冒泡排序
     * @param args
     */
    public static void main4(String[] args) {
        int[] array=new int[10];
        Random rm=new Random();
        for(int i=0;i<10;i++){
            array[i]=rm.nextInt(100);
        }
        //未排序之前数组的元素
        System.out.println(Arrays.toString(array));

        //现在进行冒泡排序
        int tmp=0;

        for(int i=array.length-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(array[j]>array[j+1]){
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }
    public static void main3(String[] args) {
        int[] array=new int[10];
        Random random=new Random();//初始化随机数的对象

        for(int i=0;i<10;i++){
            array[i]=random.nextInt(100);//从100以内随机选择一个数字
            System.out.println(Arrays.toString(array));
        }

        int tmp=0;
        boolean flg=false;

        //从小到大进行排序
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    flg=true;
                    tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
            if(!flg){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }




    public static void main2(String[] args) {
        int a=3;
        int b=5;
        boolean bool1=a+b<17&&a++<9;
        System.out.println("a="+a+";b="+b+"bool1="+bool1);



    }
    public static void main1(String[] args) {
        String intValue="100";
        String doubleValue="99.88";

        //byte b=Byte.parseByte(intValue);
        short s=Short.parseShort(intValue);
        int i=Integer.parseInt(intValue);
        System.out.println("s="+s+",i="+i);

        float f=Float.parseFloat(doubleValue);
        double d=Double.parseDouble(doubleValue);
        System.out.println("f="+f+",d="+d);
    }
}
