package Day22;

public class Solution2 {
    /**
     * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母
     * 得到与 B 相等的结果，就返回 true ；否则返回 false 。
     */
    public static  boolean buddyStrings(String a, String b) {
        if (a.length() <= 0 || a.length() != b.length()) {
            return false;
        }
        int first = -1;
        int second = -1;
        //若两个字符串相等的话，也是有可能经过交换后相等，只要出现字符串中存在两个相等的字母
        if (a.equals(b)) {
            int[] count = new int[26];
            for (int i = 0; i <a.length(); i++) {
                count[a.charAt(i) - 'a']++;
            }
            for (int c : count) {
                if (c > 1) {
                    return true;
                }
            }
            return false;
        } else {

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
        }
        //直接用两个for循环来判断，并交换位数
//        for(int i=0;i<a.length()-1;i++){
//            for(int j=i+1;j<a.length()-1;j++){
//                char c=a.charAt(i);
//                a.charAt(i)=a.charAt(j);
//                a.charAt(j)=c;
//            }
//        }
        return (second != -1 && a.charAt(first) == b.charAt(second) && a.charAt(second) == b.charAt(first));

    }

    public static void main(String[] args) {
        String a="abcd";
        String b="bacd";
        System.out.println(buddyStrings(a, b));
    }

}
