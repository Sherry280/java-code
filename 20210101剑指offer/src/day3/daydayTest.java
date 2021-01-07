package day3;


public class daydayTest {


    //==和equals的区别：
    //1.==判断的是前后两者的地址是否相同；
    // 2.equals判断的是前后两者的内容是否相等
    public static boolean isAdmin2(String userId){
        return userId.toLowerCase().equals("admin");
    }
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
    }
    public static void main1(String[] args) {
        System.out.println(isAdmin("Admin"));
        System.out.println(isAdmin2("Admin"));

    }
}
