package cn.ximcloud.itsource.before.day20_thread_2._02ticket_sync_code_runnable;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 11:42
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class PiaochiDemo {
    /*
     *  同步监听接口实现的线程测试
     *
     *
     *
     *
     *
     *
     *
     *  多线程的售票实例
     *  1.明确做什么功能 卖票
     *  2.定义一个类就行 三个窗口是三个线程对象
     *  3.实现卖票的功能
     *  4.只有在票数大于零的时候才能卖票
     */

    public static void main(String[] args) {
        /*
            1.三个线程对象都是独立的线程对象【三个线程都是独立的线程对象】
            2.但是线程对象访问的代码都是ticket对象 【但是他们传入的Runnable的实现类是同一个对象，调用start()方法，实在调用这个实现类的对象的run方法】
            3.应该三个线程都使用的是同一个对象，所以这里this可以的
            【所以，在实现类中，同步监听对象写成this，是可以的。因为是同一个对象。三个线程共享这个实现类。也可以是这个实现类的一个不变的字段，也能是类名.class。因为都是一样的。
            但是常用的还是this】
         */
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket, "小弟弟窗口");
        Thread thread2 = new Thread(ticket, "大姐姐窗口");
        Thread thread3 = new Thread(ticket, "小阿姨窗口");
        thread1.start();
        thread2.start();
        thread3.start();
    }


}


