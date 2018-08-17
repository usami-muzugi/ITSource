package cn.ximcloud.itsource.day1_day47.day20_thread_2._05lock_extends;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-05
 * Time: 11:16
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Ticket extends Thread {
    private final static Lock lock = new ReentrantLock();  //不加static 三把锁
    /*
    学习锁
    JAVA中有隐式锁和显示锁，这个Lock就是显示锁。隐式锁每个对象都有一个自己的锁，使用sync同步监听对象就是给这个对象上个锁，然后其他线程方法同步代码的时候发现这个对象没写解除锁，就会等那个线程释放锁，然后才能执行同步代码
    显示锁就是能看的见的。我们给Ticketu对象添加一个static final 的锁字段，对于Thread继承创建的线程对象，是能共享这个字段的。且不能改变的。
     */
    private static int num = 50;

    public Ticket() {
    }

    public Ticket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (num > 0) {   //循环卖票
            lock.lock();
            try {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num);
                    num--;
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
