package day3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 从运行结果可以看出来，缓存线程池的线程在执行完一个任务之后，会继续执行下一个任务，其中pool-1- thread-1和
 * pool-1- thread-2有执行了一遍
 * 缓存线程池的工作原理：如果有空闲线程，使用空闲线程执行新任务，否则判断线程池是否已经是最大线程数
 * 如果不是，则创建一个新线程执行任务，否则，进入等待队列。
 */
public class ThreadTest {
    public static void main(String[] args) {
        ExecutorService cachePool= Executors.newCachedThreadPool();//创建缓存线程池
        for(int i=0;i<15;i++){
            final int index=i;
            cachePool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()
                            +"正在运行! index="+index);
                }
            });
        }
        cachePool.shutdown();//关闭线程池

    }
}
