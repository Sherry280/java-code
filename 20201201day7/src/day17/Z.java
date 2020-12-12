package day17;

public class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        int sun=0;
        for(int i=1000;i<=2000;i++){
            if((i%100==0&&i%400==0)||(i%100!=0&&i%4==0)){
                sun++;
            }
        }
        System.out.println(sun);


//        String foo1=args[1];
//        String foo2=args[2];
//        String foo3=args[3];
        //new Z();
    }
}
