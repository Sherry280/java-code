package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo2 {
    //求出n个数中最小的数字
    //堆排序：构建堆，不断调整的过程，从最后一个不是叶子节点的结点开始
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] array={3,9,6,8,-10,7,-11,19,30,12,23,5};
       int k=9;

        GetLeastNumbers(array,k);

    }
    public static ArrayList<Integer> GetLeastNumbers(int[] array,int k){
        ArrayList<Integer> res=new ArrayList<>();
        if(array==null||array.length==0||array.length<k){
            return res;
        }
        //初始化堆
        int[] mapHeap=new int[k];

        //初始化堆
        for(int i=0;i<mapHeap.length;i++){
            mapHeap[i]=array[i];
        }

        //将初始化堆调整为最大堆
        for(int i=(mapHeap.length-1)/2;i>=0;i--){
            adjustHeap(mapHeap,i);
        }
        //遍历初始化数组，不断进行调整堆
        for(int i=k;i<array.length;i++){
            if(mapHeap[0]>array[i]){
                mapHeap[0]=array[i];
                adjustHeap(mapHeap,0);
            }
        }

        for(int i=0;i<mapHeap.length;i++){
            res.add(mapHeap[i]);
        }
        return res;

    }


    private static void adjustHeap(int[] maxHeap,int i){
        int index=i;
        int lchild=2*i+1;
        int rchild=2*i+2;
        if(index<=(maxHeap.length-1)/2){
            if(lchild<maxHeap.length&&maxHeap[index]<maxHeap[lchild]){
                index=lchild;
            }

            if(rchild<maxHeap.length&&maxHeap[index]<maxHeap[rchild]){
                index=rchild;
            }

            if(i!=index){
                int tmp=maxHeap[index];
                maxHeap[index]=maxHeap[i];
                maxHeap[i]=tmp;

                adjustHeap(maxHeap,index);
            }
        }
    }












    private static int x=100;

    public static void main3(String[] args) {
        TestDemo2 testDemo21=new TestDemo2();
        testDemo21.x++;
        TestDemo2 testDemo22=new TestDemo2();
        testDemo22.x++;
        testDemo21=new TestDemo2();
        testDemo21.x++;
        TestDemo2.x--;
        System.out.println("x="+x);
    }



//    static int a=6;
//    static{
//        a+=9;
//    }
    //public static void main1(String[] args) {
        //System.out.println("a="+a);
   // }
//    static{
//        a+=3;
//    };
}
