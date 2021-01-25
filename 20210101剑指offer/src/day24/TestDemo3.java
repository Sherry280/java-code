package day24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
}
public class TestDemo3 {
    /**
     * 成绩排序
     * 0：按照从高到低进行排序，1：按照从低到高进行排序
     *
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();//要排序得所有学生得数量
            int flag = sc.nextInt();//升序或者降序
            List<Student> subList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                subList.add(new Student(sc.next(), sc.nextInt()));
            }
            //降序
            if (flag == 0) {
                subList.sort((o1, o2) -> o2.score - o1.score);

            } else if (flag == 1) {
                //升序
                subList.sort((o1, o2) -> o1.score - o2.score);
            }

            for (Student s : subList) {
                System.out.println(s.name + ":" + s.score);
            }
        }

    }
    /**
     * 字串的判断
     * 小写英文字母组成的字符串s和  一个包含较短小写英文字符串的数组p，
     * 请返回一个bool数组，每个元素代表p中的对应字符串是否为s的子串
     */
    public static  boolean[] chkSubStr(String[] p, int n, String s){
        boolean[] b=new boolean[p.length];
        for(int i=0;i<p.length;i++){
            b[i]=s.contains(p[i]);
        }
        return b;

    }
    public static void main1(String[] args) {
        String[] s={"a","b","o","p"};
        int n=4;
        String a="abcd";
        System.out.println(Arrays.toString(chkSubStr(s, n, a)));
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String[] p=new String[n];
//        String s=sc.nextLine();



    }
}
