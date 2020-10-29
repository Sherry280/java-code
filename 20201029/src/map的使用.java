import java.util.Map;
import java.util.TreeMap;

public class map的使用 {

    public static void main(String[] args) {
        Map<String,Integer> 通讯录=new TreeMap<>();
        //不能设置为int类型的值
        Integer v=通讯录.put("123",890);
        v=通讯录.put("345",789);
        v=通讯录.put("908",567);



        v=通讯录.get("345");
        v=通讯录.remove(789);
        System.out.println(v);
    }



}
