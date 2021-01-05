package day3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 固定周期执行的计划任务线程池
 * 第一个参数是：执行任务（一般是一个线程）
 * 第2个参数：执行后多久进行第一次任务执行，第二个任务是其后每次执行间隔是多少
 * 最后一个参数是设置时间单元
 */
public class SchedulePoolDemo {
    public static void main(String[] args) {
        //创建一个计划任务线程池，参数表示线程池的个数
        ScheduledExecutorService es= Executors.newScheduledThreadPool(1);
        es.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("每1秒执行一次："+System.currentTimeMillis());
            }
        },2,1, TimeUnit.SECONDS);
    }
}
