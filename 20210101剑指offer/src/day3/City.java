package day3;

class Country{
    String name="xianfan";
    String value(String name){
        name="China";
        return name;

    }
}
public class City extends Country{
    String name;
    String value(String name){
        //super.value("失败");
        name="hefei";
        super.value("失败");//不调用此方法的时候，
        // super.name()返回的是父类中的成员变量的值null
        System.out.println(name);
        System.out.println(super.name);
        System.out.println(super.value("失败"));
        return name;
    }
//hefei
//xianfan
    public static void main(String[] args) {
        City c=new City();
        c.value("成功");
        //此时super.name返回的值是父类成员变量的值xianfan，而此时super.value是不起作用的
    }

}
