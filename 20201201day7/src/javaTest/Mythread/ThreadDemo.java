package javaTest.Mythread;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建10个MyThread对象，并运行
        for(int i=0;i<10;i++){
            MyThread myThread=new MyThread();
            myThread.start();
        }
    }
}
