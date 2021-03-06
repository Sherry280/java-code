package day2;

public class Finder {
    public int findKth(int[]a,int n,int K){
        return findKth(a,0,n-1,K);

    }
    public int findKth(int[]a,int low,int high,int k){
        int part=partation(a,low,high);//经过partition后，基准值停留的下标
        if(k==part-low+1){
            return a[part];
        }else if(k>part-low+1){
            return findKth(a,part+1,high,k-part+low-1);

        }else{
            return findKth(a,low,part-1,k);
        }

    }
    public static int partation(int[] a,int low,int high){
        int key=a[low];
        while(low<high){
            while(low<high&&a[high]<=key){
                high--;
                a[low]=a[high];
            }
            while(low<high&&a[low]>=key){
                low++;
                a[high]=a[low];
            }
        }
        a[low]=key;
        return low;
    }

    public static void main(String[] args) {
        int[] array={2,5,7,3,45,67,34,22,9,0};
        int k=8;
        Finder f=new Finder();
        System.out.println(f.findKth(array, 10, k));
    }

}
