package day3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Callable支持返回值，并可以被ExecutorService运行，ExecutorService继承自Executors，
 * 而Executors对于一个线程，如果是无需返回的，直接使用execute()方法执行
 * 对于Callable，则使用submit()方法执行
 * Executors的submit()方法会返回一个Future类型的对象
 */
public class CallableDemo {
    public static void main(String[] args) {
        //创建一个单一的线程
        ExecutorService es= Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
            try {
                System.out.println(es.submit(new RunAndReturn(i)).get());
            } catch (InterruptedException| ExecutionException e) {
                e.printStackTrace();
            }
        }
        es.shutdown();
    }
    static class RunAndReturn implements Callable<String> {
        private Integer id;
        public RunAndReturn(Integer serno){
            id=serno;//初始化私有变量

        }

        @Override
        public String call() throws Exception {
            return "RunAndReturn with result:"+id;//返回数据
        }
    }
}
