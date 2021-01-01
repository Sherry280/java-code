package day1.Test1;

/**
 * 种花问题：相邻的两块土地不能种花
 */
public class PlantFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                n--;
                if(n<=0){
                    return true;
                }
                flowerbed[i]=1;
            }
        }
        return n<=0;

//        int count=0;
//        int sum=0;
//        if(flowerbed.length==0){
//            count++;//可以种一朵花
//        }else{
//            for(int i=0;i<flowerbed.length;i++){
//                while(flowerbed[i]==0){
//                    sum++;//连续进行相加，加0操作
//                    if((sum+1)%3==0){
//                        count++;
//                    }
//                    i++;
//                }
//            }
//            if(count>=n){
//                return true;
//            }
//        }
//        return false;

    }

    public static void main(String[] args) {
        int[] flowerbed={1,0,1,0,1,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }



}
