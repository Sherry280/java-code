package Day28;

public class LongestCommonWord {
    /**
     * 求数组中的所有字符串的最长公共字串
     */

//    public static String longestCommonPrefix2(String[] str){
//        if(str.length==0){
//            return null;
//        }
//        if(str.length==1){
//            return str[0];
//        }
//        //特殊情况就是所有数组没有共同的最长的字串头
//
//
//
//    }
    //思路：对这一个数组字符串进行遍历，判断前一个字符串是否包含后一个字符串，如果不包括的话；
    //则按照
    public static String longestCommonPrefix2(String[] str){
        if(str.length==0){
            return null;
        }
        if(str.length==1){
            return str[0];
        }
        String s=str[0];
        for(String ss:str){
            //startsWith是用来测试字符串是否以指定的字符开头的
            while (!ss.startsWith(s)){
                if(s.length()==0){
                    return null;
                }
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }



    public static  String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return null;
        }
        if(strs.length==1){
            return strs[0];
        }
        String result = "";
        int i = 0;
        //现在需要拿出前两个字符串，以次比较对应位处的字符是否相等
        while (i < strs.length - 1) {
            int length = Math.min(strs[i].length(), strs[i + 1].length());
            strs[i] = strs[i].substring(0, length);
            strs[i + 1] = strs[i + 1].substring(0, length);

            for (int j = 0; j < length; j++) {
                //先截取相等的长度，以最小的长度为基准
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    result += strs[i].charAt(j);
                    if (result == null) {
                        return null;
                    }
                    strs[i + 1] = result;

                } else {
                    break;
                }

            }
            i++;
        }

        return result;

    }

    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(str));
    }
}
