import java.util.Arrays;

public class TestDemo {

    //给定一个数组，将数组中的元素向右移动k个位置
    public static void rotate(int[] nums,int k){
        int length=nums.length;
        int newK=k%length;//旋转K次后的新的k
        int tmp=0;
        for(int i=0;i<newK;i++){//控制旋转的次数
            tmp=nums[length-1];
            for(int j=length-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=tmp;
        }

    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums,4);
        System.out.println(Arrays.toString(nums));
    }
    public String toLowerCase(String str){
        if(str==null){
            return null;
        }
        //遍历每一个字符，如果是大写的，则转成小写，否则不管
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if('A'<=chars[i]&&chars[i]<='Z'){
                chars[i]+=32;
            }
        }
        String s="";
        for(int i=0;i<chars.length;i++){
            s+=chars[i];
        }
        return s;
//        for (char chars :
//                str.toCharArray()) {
//
//        }
    }

    public static void main2(String[] args) {
        String str="ADGFRs";
        TestDemo t=new TestDemo();
        System.out.println(t.toLowerCase(str));
    }


    public static void main1(String[] args) {
        int x=20;
        int y=5;
        System.out.println(x+y+" "+(x+y)+y);//25+ 25+5
    }
}
