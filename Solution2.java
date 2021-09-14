package Test09.Test0913;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {

    public int[] max_sub_matrix (int[][] matrix) {
        //先求出最大的子矩阵,再求出子矩阵的和
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] res=new int[m][n];
        for(int i=0;i<m;i++){
            res[i][0]=matrix[i][0];

        }
        for(int j=0;j<n;j++){
            res[0][j]=matrix[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==1){
                    res[i][j]=Math.min(res[i][j-1],Math.min(res[i-1][j-1],res[i-1][j]))+1;
                }else{
                    res[i][j]=0;
                }
            }
        }
        int max=res[0][0];
        int max_i=0;
        int max_j=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]>max){
                    max=res[i][j];
                    max_i=i;
                    max_j=j;
                }
            }
        }
        int sum=0;
        for(int i=max_i-max+1;i<max_i;i++){
            for(int j=max_j-max+1;j<max_i;j++){
                sum+=matrix[i][j];
            }
        }
        int[] ret=new int[5];
        for(int i=0;i<5;i++){
            ret[0]=sum;

        }
        return  ret;
    }
    public static int findMediaArrays(int[] arr1,int[] arr2){
        return 0;
    }
    /**
     *"DKAFWADCBEILBCEEA","BCA"
     * 找到字符串b在a中的最小的子串
     *
     */
    public static String minSplitWords(String a,String b){
        Set<String> set=new HashSet<>();
        for(int i=0;i<=a.length()-b.length();i++){
            char a1=a.charAt(i);
            char b1=b.charAt(i);
            for(int j=0;j<b.length();j++){

            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String A=sc.nextLine();
            String B=sc.nextLine();
            System.out.println(minSplitWords(A, B));
        }

    }
}
