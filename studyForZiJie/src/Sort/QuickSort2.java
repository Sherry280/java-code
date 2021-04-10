package Sort;

import java.util.Arrays;
import java.util.Stack;

public class QuickSort2 {
    /**
     * 非递归分治
     * 快排
     */
    public static void quickSort(int[] array){
        Stack<Integer> stack=new Stack<>();
        stack.push(array.length-1);
        stack.push(0);

        while(!stack.isEmpty()){
            int left=stack.pop();
            int right=stack.pop();
            if(left>=right){
                continue;
            }
            int pivot=partition(array,left,right);
            stack.push(right);
            stack.push(pivot+1);

            stack.push(pivot-1);
            stack.push(left);
        }

    }

    private static int partition(int[] array,int left,int right){
        int i=left;
        int j=right;
        int pivot=array[left];
        while(i<j){
            while(i<j&&array[j]>=pivot){
                j--;
            }
            array[i]=array[j];
            while(i<j&&array[i]<=pivot){
                i++;
            }
            array[j]=array[i];
        }
        array[i]=pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] array={3,56,4,3,7,9,8};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
