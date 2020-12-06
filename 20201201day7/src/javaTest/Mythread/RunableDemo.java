package javaTest.Mythread;

public class RunableDemo implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<8;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            RunableDemo runableDemo=new RunableDemo();
            Thread t=new Thread(runableDemo);
            t.setName("runnable"+i);
            t.start();
        }
    }


}
