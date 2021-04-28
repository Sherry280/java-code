package Day28;

public class LongestCommonWord {
    /**
     * 求数组中的所有字符串的最长公共字串
     */
    public static  String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return null;
        }
        if(strs.length==1){
            return strs[0];
        }
        String result="";
        for(int i=0;i<strs.length;i++){
                    if(i<strs.length-1&&strs[i].charAt(i)==strs[i+1].charAt(i)){
                        result+=strs[i].charAt(i);
                        strs[i]=result;
                    }else {
                        break;
                    }

            }
        return result;

    }

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
