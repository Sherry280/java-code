package Test09.Test0923;

public class Solution1 {
    /**
     *计算字符串中不含有重复字符的最长字符串
     */
    public static int findNoRepeatSubStringLength (String str) {
        int start=0;
        int end=0;
        char[] chars = str.toCharArray();
        int length=0;
        int max=0;
        while(end<chars.length){
            char c=chars[end];
            for(int i=start;i<end;i++){
                if(c==chars[i]){
                    start=i+1;
                    length=end-start;
                    break;
                }
            }
            length++;
            end++;
            max=max<length?length:max;
        }
        return max;
    }
    public static void main(String[] args) {
        String s="abcabcadbb";
        System.out.println(findNoRepeatSubStringLength(s));

    }
}
