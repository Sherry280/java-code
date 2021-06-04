package Day0604;

public class Solution1 {
    /**
     *将一个字符A进行复制和粘贴，使得总数等于n
     */
    public int minSteps2(int n) {
        boolean flg=false;
        int maxFactor=1;
        int res=0;
        for(int i=2;i<Math.sqrt(n);i++){
            while (n%i==0){
                maxFactor=i;
                res+=maxFactor;
                n/=maxFactor;
                flg=true;
            }
        }

        //正常退出还是找到符合条件的提前退出？
        if(maxFactor==1){
            return n;
        }
        return res;


    }
    public static int minSteps3(int n){
        if(n==1)
            return 0;
        int ans=0;
        int i=2;
        while(n>1){
            while(n%i==0){
                ans+=i;
                n/=i;
            }
            i++;
        }
        return ans;

    }

    public static int minSteps(int n){
        if(n==1)
            return 0;
        int reminder=1;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                reminder=i;
                break;
            }
        }
        if(reminder==1){
            return n;
        }
        return reminder+minSteps(n/reminder);
    }

    public static void main(String[] args) {
        int n=18;
        System.out.println(minSteps3(n));


    }




}
