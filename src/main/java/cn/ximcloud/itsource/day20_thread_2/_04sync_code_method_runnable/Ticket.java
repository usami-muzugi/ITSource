package cn.ximcloud.itsource.day20_thread_2._04sync_code_method_runnable;

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

    @Override
    public void run() {
        while (num > 0) {   //循环卖票
//            synchronized ("") {
//                if (num > 0) {
//                    System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num);
//                    num--;
//                }
//            }
            saleOne();
        }
    }

    public synchronized void saleOne() {    //这个线程是实现Runnable，所以每个线程调用的这个方法都是这个实现Runnable类的对象的方法，每个线程都是使用的同一个对象，共享这个对象的所有数据。所以这里加不加不用static修饰，
        if (num > 0) {//卖一张票
            System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num);
            num--;
        }
    }
}
