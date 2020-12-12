package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Test1 {


    /**
     * 给定一个正整数代表火车的数量，接下来输入火车入站的序列，一共N辆货车，
     * 每辆货车以数字0-9编号，要求以字典排序输出火车出站的顺序
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

            printNewArray(array,0,result);
            Collections.sort(result);

        System.out.println(result);




    }
    public  static void printNewArray(int[] array,int i,ArrayList<Integer> list){
        if(array==null||array.length==0){
            return;
        }
        if(i<0||i>array.length-1){
            return;
        }
        if(i==array.length-1){
            if(!list.contains(array[array.length-1])){
                list.add(array[array.length-1]);
            }else{
                for(int j=i;j<array.length;j++){
                    swap(array,i,j);
                    printNewArray(array,i+1,list);
                    swap(array,i,j);
                }
            }
        }
    }
    public static void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }



    public String name="abc";
    static boolean Paddy;

    public static void main3(String[] args) {
        Test1 test=new Test1();
        Test1 testB=new Test1();
        System.out.println(Paddy);
        //System.out.println(test.equals(testB)+" "+test.name.equals(testB.name));
    }


//    private int count;
//    public static void main1(String[] args) {
//        Test1 test1=new Test1(88);
//        System.out.println(test1.count);
//
//
//    }
//    Test1(int a){
//        count=a;
//    }
}
