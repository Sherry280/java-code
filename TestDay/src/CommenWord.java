import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommenWord {
    /**
     * 句子逆序：I am a boy
     * 逆序后：boy a am I
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String[] s1 = sc.nextLine().split(" ");
            String s2="";
            for(int i=s1.length-1;i>=0;i--){
                s2+=s1[i]+" ";
            }
            System.out.println(s2.toString());

        }
    }
    /**
     * 输入：
     * They are students.
     * aeiou
     * 输出：Thy r stdnts.
     * 思路：遍历
     */
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            Set<Character> set=new HashSet<>();
            String str="";
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            for(int i=0;i<s2.length();i++) {
                set.add(s2.charAt(i));
            }
            for(int i=0;i<s1.length();i++){
                if(!set.contains(s1.charAt(i))){
                    str+=s1.charAt(i);
                }
            }
            System.out.println(str.toString());

        }

    }
}
