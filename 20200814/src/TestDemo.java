public class TestDemo {
    //求一个数组中前k个最小的数字。

    public static void main(String[] args) {
        int i=0;
        while(i < 10){
            if(i < 1) continue;
            if(i == 5) break;
            i++;
        }
    }

    //求一个有序数组中，两个值相加为key的数字，返回这两个数字的下标。时间复杂度是O(n)【不限语言】
    public static void Search(int key,int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=array.length-1;j>i;j--){
                if(array[i]+array[j]==key){
                    System.out.println(i+"  "+j);
                    //System.out.println(j);
                }
            }
        }
    }

    public static void main2(String[] args) {
        TestDemo test=new TestDemo();
        int[] array={1,3,4,6,7,17,9,6};
        test.Search(8,array);

    }


    //求一个十进制数字在内存中二进制1的个数。要求：正数和负数都可以求，并且时间最优【不限语言】
    public static int binary(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main1(String[] args) {

        TestDemo test=new TestDemo();
        int ret=test.binary(10);
        System.out.println(ret);




//        char c ='a';
//        System.out.println(c);
//        System.out.println(c+1);
    }
}
