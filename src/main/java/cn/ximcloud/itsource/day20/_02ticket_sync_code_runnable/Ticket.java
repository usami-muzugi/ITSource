package cn.ximcloud.itsource.day20._02ticket_sync_code_runnable;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-05
 * Time: 11:16
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Ticket implements Runnable {
    private static int num = 50;

    public static void saleOne() {  //【把功能代码写在外面，简练很多】
        if (num > 0) {//卖一张票
            System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num);
            num--;
        }
    }

    @Override
    public void run() {
        while (num > 0) {   //循环卖票
//            synchronized ("") {
//                if (num > 0) {
//                    System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num);
//                    num--;
//                }
//            }
            synchronized (this) {//【创建一个实现类对象，然后创建三个线程，再传入这个实现类对象。这三个线程是共享这个实现类对象的。所以，这里放置this是非常好的】
                saleOne();
            }
        }
    }
}
