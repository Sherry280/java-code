package Eight8;

public class Factory {
    public Phone createPhone(String phoneName){
        if("Huawei".equals(phoneName)){
            return new Huawei();
        }else if("Apple".equals(phoneName)){
            return new Iphone();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Factory factory=new Factory();
        Phone huawei=factory.createPhone("Huawei");
        Phone iphone=factory.createPhone("Apple");
        huawei.brand();
        iphone.brand();
    }
}
