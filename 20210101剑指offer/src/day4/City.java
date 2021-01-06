package day4;

class Country{
    String name="shanxi";
    String value(String name) {
        name = "china";
        return name;
    }
}

public class City extends Country{
    String name;
    String value(String name) {
        name = "Xian";
        super.value("失败");
        //不调用此方法时，super.name返回的是父类的成员变量的值null
        System.out.println(name);
        System.out.println(super.name);
        return name;
    }
//Xian
//china

    public static void main(String[] args) {
        City c=new City();
        c.value("成功");
    }

//Xian
//shanxi


}
