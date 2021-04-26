package Day26;

public class TestDemo1 {
    /**
     * 二维数组中的查找：查找某个数组是否存在数组中
     */
    public static boolean Find(int target, int [][] array) {
        int h=array.length;
        int l=array[0].length;
        for(int i=0;i<h;i++){
            for(int j=l-1;j>=0;j--){
                if(target==array[i][j]){
                        return true;
                }else if(target>array[i][j]){
                    break;
                }else{
                    continue;
                }
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Find(5, arr));

    }
}
