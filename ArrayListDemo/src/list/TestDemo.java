package list;

public class TestDemo {
    public static void main(String[] args) {
        Integer a=Integer.valueOf(18);
        Integer b=Integer.valueOf("1024");
        Integer c=Integer.valueOf("10",8);

        System.out.println(Integer.valueOf("1024"));
        System.out.println(Integer.valueOf("20", 8));
        System.out.println(Integer.valueOf("FF", 16));

        System.out.println(Long.toHexString(19));
        System.out.println(Long.toOctalString(19));

        String s=Long.toOctalString(19);
        Long e=Long.parseLong(s,8);
        System.out.println(e);




    }











}
