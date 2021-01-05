package day3;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Future对象用于存储Callable结果的返回值对象
 * 对于这个返回值，可以使用get()方法来获取，get()方法是阻塞的，
 * 直到Callable的执行结果已经出来了
 * 如果不想阻塞，可以调用isDone()来查询结果是否已经得出。
 */
public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个缓存线程池
        ExecutorService es= Executors.newCachedThreadPool();
        //创建一个链表用于存放Future对象
        List<Future<String>> list=new LinkedList<>();

        for(int i=0;i<10;i++){
            final int index=i;
            list.add(es.submit(new Callable<String>() {
                //添加一个Callable对象并返回存放到链表中
                @Override
                public String call() throws Exception {
                   String name=Thread.currentThread().getName();
                    System.out.println(name+"开始执行!index="+index);
                    return name+"开始执行！index="+index;
                }
            }));
        }
        int count=0;
        while(true){
            for(Future<String> f:list){
                //遍历list，获取返回对象Future
                if(f.isDone()){//如果计算已经完成
                    try {
                        System.out.println("计算结束，计算结果是："+f.get());//获取结果
                        count--;//计数器减1
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }

                }
            }
            //遍历结束后，所有的数据都已经拿到了，跳出while循环，否则休眠10ms
            if(0==count){
                break;//如果所有的结果都已经执行完毕，则跳出循环
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        es.shutdown();//关闭线程
    }
}
