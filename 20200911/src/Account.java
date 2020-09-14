import java.util.Date;
public class Account {

    private String id;
    private String name;
    private double balance;//定义余额
    private Date openDay;
    //定义构造方法，一个类有多个构造方法
    public Account(){


    }
    //定义一个需要参数的构造方法
    public Account(String id,String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
        this.openDay=new Date();
    }
    //以下开始定义该类对象的方法
    public String getName(){
        return this.name;
    }
    //一个存款方法，将余额增加到余额上
    public void deposit(double amount){
        this.balance=this.balance+amount;
        saveToDB();
        return;
    }
    //定义一个取款方法，将存款额从余额中减去
    public void withdraw(int amount){
        this.balance-=amount;
        saveToDB();
    }
    //返回一个账户的当前余额
    public double getBalance(){
        return this.balance;
    }
    private void saveToDB(){
        //省略保存操作到数据库的代码
    }






    public static void main(String[] args) {
        Account a=new Account("001","小艾",1000);
        a.withdraw(100);
        a.deposit(150);
        a.deposit(150);
        System.out.println(a.getBalance());


    }








}





