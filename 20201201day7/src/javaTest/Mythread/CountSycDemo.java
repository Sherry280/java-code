package javaTest.Mythread;

public class CountSycDemo extends Thread{
    private PersonSyc personSyc;
    private static Object obj=new Object();
    public CountSycDemo(PersonSyc person){
        personSyc=person;
    }

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            PersonSyc person=new PersonSyc();
            person.setName("王"+i);
            CountSycDemo crush=new CountSycDemo(person);
            crush.start();
        }
    }



    public void getWater(PersonSyc person){
        synchronized (obj){
            System.out.println(person.getName()+"开始打水");
            try{
                Thread.currentThread().sleep(500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(person.getName()+"开始打水");
        }
    }

    @Override
    public void run() {
        this.getWater(personSyc);
    }
}
