package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    /**
     * 找出n个数字中最小的k个，快排
     * @param
     */
    public static int qSort(int[] array,int start,int end){
        int dig=array[start];
        while(start<end){
            while(start<end&&array[end]>=dig){
                end--;
                array[start]=array[end];
            }
            while(start<end&&array[start]<dig){
                start++;
                array[end]=array[start];
            }

        }
        array[start]=dig;
        return start;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int[] array=new int[s1.length-1];
        for(int i=0;i<s1.length-1;i++){
            array[i]=Integer.parseInt(s1[i]);
        }
        int k=Integer.parseInt(s1[s1.length-1]);
        int start=0;
        int end=array.length-1;

        int index=qSort(array,start,end);
        while(index!=k){
            if(index>k) {
                end = index - 1;
                index = qSort(array, start, end);
            }else{
                start=index+1;
                index=qSort(array,start,end);
            }
        }
        Arrays.sort(array,0,k);
        for(int i=0;i<k;i++){
            System.out.print(i==k-1?array[i]:array[i]+" ");
        }





    }
    /**
     * 删除数组中每隔两个数字，删除一个数字
     */
    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }

            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(i);
            }
            int i=0;
            while(list.size()>1){
                i=(i+2)%list.size();//这样写直接i代表的就是要删除元素的下标，但是size每删除一次就-1
                //每次删除的时候，都是把从2位置往后的元素向前移动，全部删完------》Amazing好神奇
                list.remove(i);
            }
            System.out.println(list.get(0));



        }


    }




    static int cnt=6;
    static{
        cnt+=9; //cnt=cnt+9=6+9=15
    }
    public static void main3(String[] args) {
        System.out.println("cnt="+cnt);

    }
    static{
        cnt/=3;
    };
    public  static  void  main2(String [] args){
        new  B().getValue();
        System.out.println(new  B().getValue());
    }
    static class A{
        protected int value;
        public A(int  v) {
            setValue(v);//10
        }
        public  void  setValue(int  value){
            this.value = value;
        }
        public int  getValue(){
            try {
                value++;
                return value;
            } catch (Exception e){
                System.out.println(e.toString());
            } finally  {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }

    }

    static class B extends A {
        public B() {
            super(5);
            setValue(getValue() - 3);
        }

        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }



    private static int x=100;
    public static void main1(String[] args) {
        Test test = new Test();
        x++;
        x++;
        System.out.println(x);
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Object clone;
            Object finalize;
            Object toString;


        }


    }
}
