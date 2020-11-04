package Hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            float s = b * b - 4 * a * c;
            double ss = Math.sqrt(s);

        }


    }





    public static void main7(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int weight=sc.nextInt();
            int high=sc.nextInt();
            float h=(float)high/100;
            float BMI=(float)(weight/Math.pow(h,2.0));



        }
    }
    public static void main5(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            //根据三角形的体的条件来判断是否是三角形，在判断是否为等腰三角形
            //两边之和大于第三边   两边之差小于第三边
            if(((a+b>c)||(a+c>b)||(b+c>a))&&((a-b<c||a-c<b||b-c<a||c-b<a))){
                //判断是否为等腰三角形
                if((a==b||a==c||b==c)){
                    if(a==b&&b==c){
                        System.out.println("Equilateral triangle!");
                    }
                    System.out.println("Isosceles triangle!");
                }else{
                    System.out.println("Ordinary triangle!");
                }
            }else {
                System.out.println("Not a triangle!");
            }
        }
    }




    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+">"+b);
        }else if(a==b){
            System.out.println(a+"="+b);
        }else{
            System.out.println(a+"<"+b);
        }
    }



    public static void main3(String[] args) {
        //KiKi想完成字母大小写转换，有一个字符，判断它是否为大写字母，
        // 如果是，将它转换成小写字母；反之则转换为大写字母。
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=s.charAt(0);

//       if(s.matches("[A-Z]")){
//           System.out.println(s.toUpperCase());
//       }
       if(c>='a'&&c<='z'){
           System.out.println(s.toUpperCase());
       }else {


           System.out.println(s.toLowerCase());
       }


        //如果它是大写字母，则把它转为小写字母





    }




    public static void word(String s){
        int len=s.length();



    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()<16){
            if(str.matches("^[a-zA-Z]*")){

            }
        }
    }

    public static void main1(String[] args) {
//        Set<String> set=new HashSet<>();
//        set.add("xixi");
//        set.add("haha");
//        System.out.println(set);
//
//
//        System.out.println(set.size());
//        System.out.println(set.contains("yiyi"));
//
//        System.out.println(set.isEmpty());
        //输出为一行，如果输入字母是元音（包括大小写），输出“Vowel”，如果输入字母是非元音，输出“Consonant”。
        Set<String> set=new TreeSet<>();
        String[] array={"a","e","i","o","u","A","E","I","O","U"};
        for(String ch:array){
            set.add(ch);
        }
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();


            if(set.contains(s)){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }


        }



    }
}
