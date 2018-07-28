package cn.ximcloud.itsource.day20_thread_2._05lock_extends;

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
    /* 多线程的售票实例
     *  1.明确做什么功能 卖票
     *  2.定义一个类就行 三个窗口是三个线程对象
     *  3.实现卖票的功能
     *  4.只有在票数大于零的时候才能卖票
     */

    public static void main(String[] args) {
        //实际上是三把锁
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        ticket1.start();
        ticket2.start();
        ticket3.start();
    }


}


