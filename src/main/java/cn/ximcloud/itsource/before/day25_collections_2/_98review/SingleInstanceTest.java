package cn.ximcloud.itsource.before.day25_collections_2._98review;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-13
 * Time: 10:12
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * 测试的结果是饿汉模式是不会出现线程安全的问题
 * 因为在线程调用SingleInstance类的时候，其静态私有字段singleInstance就已经被初始化了
 * 每一次调用，都是返回的同一个对象。
 **/

public class SingleInstanceTest {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        Thread thread4 = new MyThread();
        Thread thread5 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
//        Thread[Thread-0,5,main]cn.ximcloud.itsource.before.day25_collections_2._98review.SingleInstance@6102d376
//        Thread[Thread-4,5,main]cn.ximcloud.itsource.before.day25_collections_2._98review.SingleInstance@6102d376
//        Thread[Thread-3,5,main]cn.ximcloud.itsource.before.day25_collections_2._98review.SingleInstance@6102d376
//        Thread[Thread-2,5,main]cn.ximcloud.itsource.before.day25_collections_2._98review.SingleInstance@6102d376
//        Thread[Thread-1,5,main]cn.ximcloud.itsource.before.day25_collections_2._98review.SingleInstance@6102d376
//        Thread[Thread-线程名，线程优先级，线程组]
    }
}

/**
 * 饿汉模式
 */
class SingleInstance {
    private static final SingleInstance singleInstance = new SingleInstance();


    public static SingleInstance getInstance() {
        return singleInstance;
    }
}

/**
 * 使用继承来操作
 */
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().toString() + "----" + SingleInstance.getInstance());
    }
}

