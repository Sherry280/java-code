package LeetCode;



import java.util.Scanner;

public class CodeFirst {
    public static void main(String[] args) {
        //655 = 6 * 55 + 65 * 5
        //1461 = 1*461 + 14*61 + 146*1
        //求出 5位数中的所有 Lily Number

        for(int i=0;i<100000;i++){


        }


    }

    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        float price=sc.nextFloat();
        int month=sc.nextInt();
        int day=sc.nextInt();
        int flag=sc.nextInt();

        if(month==12&&day==12){
            if(flag==1){
                double finalPrice=price*0.8-50;
                if(finalPrice<=0){
                    System.out.println(0.00);
                }else {
                    System.out.printf("%.2f", finalPrice);
                }
            }else{
                double finalPrice=price*0.8;
                if(finalPrice<=0){
                    System.out.println(0.0);
                }else {

                    System.out.printf("%.2f", finalPrice);
                }
            }
            //System.out.println(finalPrice);
        }else  if(month==11&&day==11){

            if(flag==1){
                double finalPrice2 = price * 0.7 - 50;
                if(finalPrice2<=0){
                    System.out.println(0.0);
                }else {
                    System.out.printf("%.2f",finalPrice2);
                }
            }else{
                double finalPrice2 = price * 0.7;
                if(finalPrice2<=0){
                    System.out.println(0.0);
                }else {
                    System.out.printf("%.2f",finalPrice2);
                }
            }

        }else{
            System.out.printf("%.2f",price);
        }
    }




    public static void main3(String[] args) {
        //一行，输入一个人的体重（千克）和身高（米），中间用一个空格分隔。
        //。例如：一个人的身高为1.75米，体重为68千克，
        // 他的BMI=68/(1.75^2)=22.2（千克/米^2）。当BMI指数为18.5～23.9时属正常，
        // 否则表示身体存在健康风险。编程判断人体健康情况。
        Scanner sc=new Scanner(System.in);
        int weight=sc.nextInt();
        float tall=sc.nextFloat();
        float BMI=weight/(tall*tall);
        if(BMI>=18.5&&BMI<=23.9){
            System.out.println("Normal");
        }else {
            System.out.println("Abnormal");
        }









    }

    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            char c = sc.next().charAt(0);
            if((c>=65&&c<=90)||(c>=97&&c<=122)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }



//            String p = ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) ? "Yes" : "No";
//            System.out.println(p);
        }
    }


    public static void main1(String[] args) {
        //多组输入，每组输入仅一行，包括n，h和m（均为整数）。输入数据保证m <= n * h。
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//总共牛奶的总总数
        int h=sc.nextInt();//分钟
        int m=sc.nextInt();//剩余的牛奶数量
        int f=m%h==0?m/h:m/h+1;
        System.out.println(n-f);

    }




}
