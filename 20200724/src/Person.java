import java.util.Arrays;

public  class  Person{
    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }// 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }



    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 3, 1, 8, 0};
        transform(arr);
        System.out.println(Arrays.toString(arr));

    }
}

//        public class Person{
//
//            private String name = "Person";
//
//            int age=0;
//
//        }

//        public class Child extends Person{

            //public String grade;

//            public static void main(String[] args){

//                Person p = new Child();
//
//                System.out.println(p.name);


//
//        public int aMethod(){
//          int i = 0;
//            i++;
//            return i;
//        }
//        static boolean Paddy;
//
//        private float f=1.0f;
//        int m=12;
//        static int n=1;
//        public static void main(String[] args) {
//
//
//
//
//            MyApplication t=new MyApplication();
//            System.out.println(t.f);
//            System.out.println(MyApplication.n);
//
//
//
//            System.out.println(Paddy);


//            MyApplication test = new MyApplication();
//            test.aMethod();
//            int j = test.aMethod();
//            System.out.println(j);



        // TODO Auto-generated method stub
//            Test test=new Test();
//            test.hello();






