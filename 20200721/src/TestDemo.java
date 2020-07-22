
public class TestDemo {
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    public static int fac(int n){
        if(n<10){
            return n;
        }
        return n%10+fac(n/10);

    }
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
    public static void each(int n){
        if(n>9){
            each(n/10);

        }
        System.out.print(n%10+"   ");

    }
    //递归求 1 + 2 + 3 + ... + 10
    public static int add(int n){
        if(n==1){
            return 1;
        }
        return n+add(n-1);

    }
    //递归求 N 的阶乘
    public static int mul(int n){
        if(n==1){
            return 1;
        }
        return n*mul(n-1);
    }
    //汉诺塔求解
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+"  ");
    }
    public static void hanuo(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }
        else{
            hanuo(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanuo(n-1,pos2,pos1,pos3);
        }


    }

    //青蛙跳台阶问题求解
    public static int jumpFloor(int n){
        if(n<0){
            return 0;
        }
        if(n==1||n==2){
            return n;
        }
        else{
            return jumpFloor(n-1)+jumpFloor(n-2);
        }
    }


    public static void main(String[] args) {
        System.out.println(jumpFloor(10));


//        hanuo(1,'A','B','C');
//        System.out.println();
//        hanuo(2,'A','B','C');
//        System.out.println();
//        hanuo(4,'A','B','C');
//        System.out.println();


        //System.out.println(mul(5));
        //System.out.println(add(10));
        //System.out.println(fac(1234));
        //each(1234);

    }



}
