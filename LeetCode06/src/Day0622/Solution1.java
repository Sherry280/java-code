package Day0622;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    /**
     *字符串的全排列：用list来对字符串的所有结果进行全排列
     * 回溯法：
     */
    List<String> rec;
    boolean[] vis;
    public String[] permutation(String s) {
        int n=s.length();
        rec=new ArrayList<>();
        vis=new boolean[n];
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        StringBuffer perm=new StringBuffer();
        backtrack(arr,0,n,perm);
        //将list中存放的字符串放到字符串数组中
        int size=rec.size();
        String[] recArr=new String[size];
        for(int i=0;i<size;i++){
            recArr[i]=rec.get(i);
        }
        return recArr;


    }
    public void backtrack(char[] arr,int i,int n,StringBuffer perm){
        if(i==n){
            rec.add(perm.toString());
            return;
        }
        for(int j=0;j<n;j++){
            //用来进行判断相邻的字符是否相等，排除重复排序的可能
            if(vis[j]||(j>0&&!vis[j-1]&&arr[j-1]==arr[j])){
                continue;
            }
            vis[j]=true;
            perm.append(arr[j]);
            backtrack(arr,i+1,n,perm);
            perm.deleteCharAt(perm.length()-1);
            vis[j]=false;

        }
    }
    public static void main(String[] args) {
        String s="abc";
        Solution1 solution1=new Solution1();
        System.out.println(Arrays.toString(solution1.permutation(s)));

    }
}
