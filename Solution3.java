package Test09.Test0916;

public class Solution3 {
    /**
     * 1. 转换后的字符串只保留字母[a-zA-Z]和数字[0-9]，去除其他字符；
     * 2. 输入字符串中的字母字符的前一字符如非字母或数字，该字母转换后为大写，其他字母转换后为小写；
     *     例外：转换后的字符串第一个字符如果是字母，则该字母转换后为小写；
     * 3. 转换后的字符串保留数字字符。
     * 4. 字符串如果为空或者无[a-zA-Z]和数字[0-9]中字符，请默认输出如下字符串"shopee"
     */
    public static String camelCase(String newString) {
        if(newString==""||newString.length()==0){
            return "shopee";
        }
        StringBuilder res= new StringBuilder();
        int cnt=0;
        for(char ch:newString.toCharArray()){
            //计算字符串中非字符或者非数字的个数
            if(!isalpha(ch)&&!isdigit(ch)){
                cnt++;
            }
        }
        if(cnt==newString.length()){
            return "shopee";
        }
        //"hello_world"   "helloWorld"
        char[] chars=newString.toCharArray();
        char ch=chars[0];
        int index=0;
        while(index<chars.length) {
            if (!isalpha(ch) && !isdigit(ch)) {
                while (!isalpha(chars[index]) && !isdigit(chars[index])) {
                    index++;
                }
                //转为大写
                res.append(ch - 'a');
                index++;
            } else if (isalpha(ch)) {
                res.append(ch - 'a');
                index++;
            } else {
                res.append(ch);
                index++;
            }
        }

        for(int i=index;i<chars.length;i++){
            char c=chars[i];
            if(!isalpha(c)&&!isdigit(c)){
                if(i==chars.length-1){
                    continue;
                }
                while(!isalpha(c)&&!isdigit(c)){
                    i++;
                    res.append(chars[i] - 'a');
                }
            }else{
                if(isalpha(c)){
                    res.append(c - 'a');

                }else{
                    res.append(c);
                }
            }

        }

        return res.toString();



    }
    public static boolean isalpha(char c){
        if(c>='a'&&c<='z'){
            return true;
        }
        if(c>='A'&&c<='Z'){
            return true;
        }
        return false;

    }
    public static boolean isdigit(char c){
        int i= (int) c;
        if(c <= 9){
            return true;
        }else{
            return false;
        }

    }
    /**
     * 对数组进行排序，要求0排在前面，且非0的元素相对位置不变化
     */
    public int[] sort_data(int[] list_data) {
        int i=0;
        int n=list_data.length;
        int k=n-1;
        for(i=n-1;i>=0;--i){
            if(list_data[i]!=0){
                if(list_data[k]==0){
                    list_data[k]=list_data[i];
                    list_data[i]=0;
                }
                --k;
            }
        }
        return list_data;
    }
    public static void main(String[] args) {
        String s="hello_world";
        System.out.println(camelCase(s));

    }
}
