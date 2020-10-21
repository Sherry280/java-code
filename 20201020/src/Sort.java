import java.util.Arrays;

public class Sort {
    public static void bubbleSort(int[] array){

        int len=array.length;
        boolean flag=true;
        for(int i=0;i<len-1;i++){

            for(int j=0;j<len-i-1;j++){
                if(array[j]<=array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        while(flag){
            break;
        }
    }


    public  static void bubbleSort1(int[] array){

        boolean flag=true;
        for(int i=array.length;i>0;i--){

            for(int j=0;j<i-1;j++){
                flag=false;
                if(array[j]>array[j+1]){
                    int t=array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
        while(flag){
            break;
        }
    }

    public static void main(String[] args) {
        int[] array1={24,78,9,8,65,45,12};
        int[] array2={2,3,4,5,6,7};
        int[] array3={9,8,7,6,5,4,1};

        bubbleSort1(array3);
        System.out.println(Arrays.toString(array3));
    }

}
