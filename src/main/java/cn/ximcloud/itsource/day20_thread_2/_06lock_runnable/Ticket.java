package cn.ximcloud.itsource.day20_thread_2._06lock_runnable;

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

public class Ticket implements Runnable {
    private static int num = 50;
    private final Lock lock = new ReentrantLock();  //采用实现的方式创建线程，只有一个对象，所以三个线程对象是共享这个对象的，所以这里就不用static修饰
    //实现Runnable，Thread new了三个线程但是都是传入的同一个对象。可以不用static
    //相对于synchronized,lock更灵活
    //但是使用lock的话，需要使用try...finally来进行。就是怕出现异常，导致无法释放锁，导致线程堵塞。

    public Ticket(int num) {
        Ticket.num = num;
    }

    public Ticket() {
    }


    @Override
    public void run() {
        while (num > 0) {   //循环卖票
            lock.lock();
            if (num > 0)
                System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num--);
        }

    }
}
//    @Override
//    public void run() {
//        while (num > 0) {   //循环卖票
//            lock.lock();
//            try {   //try...finally 不管try结构体中语句最后都会执行finally，体现了finally是用于*释放资源释放锁*
//                if (num > 0)
//                    System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num--);
//            }finally {
//                lock.unlock();
//            }
//
//        }
//    }


