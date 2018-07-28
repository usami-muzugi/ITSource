package cn.ximcloud.itsource.day25_collections_2._98review;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-13
 * Time: 10:21
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 测试在多线程的情况下懒汉模式下是否会导致线程不安全
 * <p>
 * 测试结果:获取了不止一个对象
 * 冷静分析:
 * 每一个线程都是一个独立的对象，每一个线程不共享其他线程的数据，每一个线程不共享 singleInstanceBigBrother字段
 * 1开始，创建线程对象
 * 2开始，线程对象启动。
 * 执行3，run(）方法 SingleInstanceBigBrother.getInstance() 语句
 * 4，跳转到SingleInstanceBigBrother 的getInstance()方法
 * 当一个线程执行到5，并且判断成功的时候。这时可能是时间片耗尽，也可能是JVM调度线程切换，导致线程切换到其他线程
 * 其他线程判断字段为空，创建并返回字段。然后跳转到最开始的线程，该线程继续执行，创建一个实例对象。
 * 这就导致了线程不安全。
 * 不安全的本质是字段的可见性和执行的原子性
 * <p>
 * SingleInstanceTestSync自己给出解决办法
 **/

public class SingleInstanceTest2 {


    public static void main(String[] args) {
        Thread thread1 = new MyBigBrotherThread();
        Thread thread2 = new MyBigBrotherThread();
        Thread thread3 = new MyBigBrotherThread();
        Thread thread4 = new MyBigBrotherThread();
        Thread thread5 = new MyBigBrotherThread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
//        Thread[Thread-4,5,main]---cn.ximcloud.itsource.day25_collections_2._98review.SingleInstanceBigBrother@29c0469b
//        Thread[Thread-3,5,main]---cn.ximcloud.itsource.day25_collections_2._98review.SingleInstanceBigBrother@50e2feb2
//        Thread[Thread-2,5,main]---cn.ximcloud.itsource.day25_collections_2._98review.SingleInstanceBigBrother@50e2feb2
//        Thread[Thread-0,5,main]---cn.ximcloud.itsource.day25_collections_2._98review.SingleInstanceBigBrother@50e2feb2
//        Thread[Thread-1,5,main]---cn.ximcloud.itsource.day25_collections_2._98review.SingleInstanceBigBrother@50e2feb2
    }

}

class SingleInstanceBigBrother {
    //私有化静态字段仅声明，不初始化
    private static SingleInstanceBigBrother singleInstanceBigBrother;


    /**
     * 单列模式，一个类仅可获取一个实例,如果实例并未初始化。
     * 则创建一个实例，并赋值给字段singleInstanceBigbrother。
     * <p>
     * *错误写法* return new SingleInstanceBigBrother();我这里仅仅是判断字段是否为空，为空就new一个实例返回
     * 但是并未对字段赋值，下一次获取实例的时候还是会判断字段是否为空，然后又new一个对象返回出去。这样不可取
     * 正确的做法是赋值给字段然后再返回
     *
     * @return 返回一个实例
     */
    public static SingleInstanceBigBrother getInstance() {
        if (singleInstanceBigBrother == null) return (singleInstanceBigBrother = new SingleInstanceBigBrother());
        return singleInstanceBigBrother;
    }

}

class MyBigBrotherThread extends Thread {

    /**
     * 继承线程父类之后，需要重写run方法。线程才能执行run方法内部的语句
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().toString() + "---" + SingleInstanceBigBrother.getInstance());
    }
}
