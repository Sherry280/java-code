package Day0621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    /**
     * 串联字符串的最大长度：
     * 给定一个字符串数组arr，s是字符串数组arr某一子序列字符串连接所得
     * 找出字符串拼接后并且无重复字符的最长字符串的长度
     */
    public static int maxLength(List<String> arr) {
        int ans=0;
        //存储的是没有重复字符的字符串
        List<Integer> masks=new ArrayList<>();
        masks.add(0);
        //遍历整个字符串数组
        for(String s:arr){
            int mask=0;//用来标记
            for(int i=0;i<s.length();i++){
                int ch=s.charAt(i)-'a';
                //若mask中已有ch，则说明s中含有重复字母，无法构成可行解
                if(((mask>>ch)&1)!=0){
                    mask=0;
                    break;
                }
                //将ch加入mask中
                mask|=1<<ch;
            }
            if(mask==0){
                continue;
            }
            int n=masks.size();
            for(int i=0;i<n;i++){
                int m=masks.get(i);
                //m和mask无公共元素
                if((m&mask)==0){
                    masks.add(m|mask);
                    ans=Math.max(ans,Integer.bitCount(m|mask));

                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String[] arr={"un","iq","ue"};
        System.out.println(maxLength(Arrays.asList(arr)));

    }
}
