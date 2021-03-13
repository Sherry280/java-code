import java.util.Scanner;

public class MoveZuobiao {
    /**
     *字符串加解密
     */

    public static final String str1 = "abcdefghijklmnopqrstuvwxyzABCDE" +
            "FGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static final String str2 = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghij" +
            "klmnopqrstuvwxyza1234567890";
    //加密过程
    public static void Encrypt(char[] chars){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<str1.length();j++){
                char c=str1.charAt(i);
                if(c==chars[j]){
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());


    }
    //解密过程
    public static void unEncrypt(char[] chars){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<chars.length;i++){
            for(int j=0;j<str2.length();j++){
                char c=str2.charAt(i);
                if(c==chars[j]){
                    sb.append(chars[i]);
                }
            }
        }
        System.out.println(sb.toString());


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.nextLine();
            char[] ss1 = s1.toCharArray();
            Encrypt(ss1);

            String s2=sc.nextLine();
            char[] ss2 = s2.toCharArray();
            unEncrypt(ss2);


        }

    }
    /**
     * 输入年月日，判断这是这一年的第几天
     */
    public static int getOutDay(int year,int month,int day) {
        int outDay = 0;
        int[] Day={31,28,31,30,31,30,31,31,30,31,30,31};
        if(year<0||month>12||month<0||day>31||day<0){
            return -1;
        }
        if((year%100!=0&&year%4==0)||(year%400==0)){
            Day[1]=29;
        }
        //进行month之前的天数相加
        for(int i=0;i<month-1;i++){
            outDay+=Day[i];
        }
        return outDay+day;




    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            System.out.println(getOutDay(year, month, day));
        }

    }
    /**
     * 求连续子数组的最大的和
     */
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            int max=arr[0];
            for(int i=0;i<n;i++){
                if(sum<0){
                    sum=arr[i];
                }else{
                    sum+=arr[i];
                }
                if(sum>max){
                    max=sum;
                }

//                if(arr[i]>0) {
//                        sum += arr[i];
//                        right++;
//                    if(max<sum){
//                        max=sum;
//                    }
//
//                }else if(arr[i]<0&&right!=n){
//                    left=right+1;
//                    right=right+1;
//                    sum=0;
//                }

            }
            System.out.println(max);


        }
    }
    /**
     * 坐标移动
     * A：左移   D：向右移；  W：向上移   S：向下移
     */
    public static void main3(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            String[] split = s.split(";");
            int x=0;
            int y=0;
            for(String s1:split) {
                if (s1.length()>0&&s1.length() <= 3) {
                    if (s1.charAt(0) == 'A' && s1.substring(1).matches("[0-9]+")) {
                        x -= Integer.parseInt(s1.substring(1));
                    }
                    if (s1.charAt(0) == 'D' && s1.substring(1).matches("[0-9]+")) {
                        x += Integer.parseInt(s1.substring(1));
                    }
                    if (s1.charAt(0) == 'W' && s1.substring(1).matches("[0-9]+")) {
                        y += Integer.parseInt(s1.substring(1));
                    }
                    if (s1.charAt(0) == 'S' && s1.substring(1).matches("[0-9]+")) {
                        y -= Integer.parseInt(s1.substring(1));
                    }
                }
            }
            System.out.println(x+","+y);


        }
        sc.close();

    }
}
