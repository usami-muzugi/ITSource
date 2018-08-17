package cn.ximcloud.itsource.day1_day47.day25_collections_2._98review;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-13
 * Time: 10:40
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 实现一个线程安全的单例懒汉模式
 **/

public class SingleInstanceTestSync {
    public static void main(String[] args) {
        Thread thread1 = new MySyncThread();
        Thread thread2 = new MySyncThread();
        Thread thread3 = new MySyncThread();
        Thread thread4 = new MySyncThread();
        Thread thread5 = new MySyncThread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

class SingleInstanceSync {
    private volatile static SingleInstanceSync singleInstanceSync;


//    /**
//     * 方法一，同步方法。
//     * 由于是静态方法，所以监听对象是这个类对象。一个JVM类对象有且只有一个，所以所有会调用这个方法的线程
//     * 都是监听的这同一个对象
//     * @return 返回一个SingleInstanceSync 对象
//     */
//    public static synchronized SingleInstanceSync getInstance() {
//        if (singleInstanceSync == null) return (singleInstanceSync = new SingleInstanceSync());
//        else return singleInstanceSync;
//    }


//    /**
//     * 如果是监听代码块儿，反正就是让调用这个方法的线程都监听的是同一个对象就行了，因为""是常量
//     * 是在方法区里面的常量池的对象，有且只有一个。所有监听的是同一个对象。
//     * 这个常规的写法是监听类对象this.getClass() 类字节码 SingleInstanceSync.class;
//     * 但是这里不会生成多个对象，而且singleInstanceSync对象是在之后初始化的，懒汉模式。
//     * 这里不能使用this.getClass() 方法也是静态方法。全然ダメ。
//     * 可以这样，在类中添加一个字段，private static final Object object = new Object();
//     * 这个字段被该类所有对象和该类共享。这个可以
//     * @return 返回一个SingleInstanceSync 对象
//     */
//    public static SingleInstanceSync getInstance() {
//        synchronized ("") {
//            if (singleInstanceSync == null) return (singleInstanceSync = new SingleInstanceSync());
//            else return singleInstanceSync;
//        }
//    }


    /**
     * 线程的不安全性，本质是被操作的字段在同一时间段对其他线程的不可见性
     * 我们可以在设置字段的时候加上一个 volatile 关键字 private volatile static SingleInstanceSync singleInstanceSync;
     * 这样就能保证字段在任意时刻任意位置对所有线程保持可见性。
     * 通俗的讲，就是一个线程修改了这个对象(数据)其他对象会同时得知这个对象被修改了。或保持被修改后的值。
     * 下面的方法是不会产生线程安全问题的。
     *
     * @return 返回一个SingleInstanceSync 对象
     */
    public static SingleInstanceSync getInstance() {
        if (singleInstanceSync == null) return (singleInstanceSync = new SingleInstanceSync());
        return singleInstanceSync;
    }

}

class MySyncThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().toString() + "---" + SingleInstanceSync.getInstance());
    }
}
