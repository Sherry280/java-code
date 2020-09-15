import java.util.Arrays;

public class TestDemo {

    //有 1000 瓶药物，但是其中有一瓶是有毒的，小白鼠吃了一个星期以后就会死掉！请问，在一个星期内找出有毒的
    //药物，最少需要多少只小白鼠？


    //调整数组中元素的位置，使得奇数位于偶数之前.【不限语言】
    public static void reOrderArray(int[] array){
        if(array==null||array.length==0){
            return;
        }
        int start=0;
        int end=array.length-1;
        while(start<end){
            //如果是奇数一直往后
            while(array[start]%2!=0){
                start++;
            }
            while(array[end]%2==0){
                end--;
            }
            if(start<end){
                int tmp=array[start];
                array[start]=array[end];
                array[end]=tmp;
            }
        }


    }

    public static void main(String[] args) {
        TestDemo test=new TestDemo();
        int[] array={1,2,3,4,5,6,7,8,9};
        test.reOrderArray(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }



//在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个
//函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    public static boolean Find(int target,int[][] array){
        int row=(int)array.length;
        int col=(int)array[0].length;
        if(row==0&&col==0){
            return false;
        }
        if(target<array[0][0]||target>array[row-1][col-1]){
            return false;
        }
        int i=0;
        int j=col-1;
        while(i<row&&j>=0){
            if(array[i][j]<target){
                i++;
            }else if(array[i][j]>target){
                j--;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main2(String[] args) {
        TestDemo test=new TestDemo();
        int[][] arr={{1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}};
        boolean ret=test.Find(6,arr);
        System.out.println(ret);
    }

    public static void main1(String[] args) {

//        int i = 15;
//        i = i++;
//        System.out.println("i:" + i);
//        int i = 2;
//        int j = i++ * 3;
//        System.out.println(j);
//        int i = 2;
//        int j = ++i * 3;
//        System.out.println(j);


    }



}
