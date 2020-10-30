import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            //输入
            String str1=sc.next();
            String str2=sc.next();
            //截取
            String num1=str1.substring(2,str1.length());
            String num2=str2.substring(1,str2.length());
            //用valueOf（）方法转换
            System.out.print(Integer.valueOf(num1,16)+Integer.valueOf(num2,8));
        }

    }
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            double avg = 0;
            for(int i = 0;i<5;i++){
                avg+=sc.nextInt();
            }
            System.out.println(avg/5.0);
        }
    }

}
