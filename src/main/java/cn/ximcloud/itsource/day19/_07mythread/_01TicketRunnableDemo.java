package cn.ximcloud.itsource.day19._07mythread;


/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 14:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _01TicketRunnableDemo {

    /*
          解决线程安全的问题，涉及到同步监听对象

     */
    public static void main(String[] args) {
        TecketRunnable tecketRunnable = new TecketRunnable();
        /*
         * t1,t2,t3都是独立的线程独享
         * 但是线程对象访问的代码都是tecketRunnable中的同一个对象已经被共享到了
         *
         *
         */



        /*
            What will be run.
            private Runnable target;
         */
        Thread thread1 = new Thread(tecketRunnable);
        Thread thread2 = new Thread(tecketRunnable);
        Thread thread3 = new Thread(tecketRunnable);
        thread1.start();
        thread2.start();
        thread3.start();

//        TicketV1 ticketV11 = new TicketV1();
//        TicketV1 ticketV12 = new TicketV1();
//        TicketV1 ticketV13 = new TicketV1();
//        ticketV11.start();
//        ticketV12.start();
//        ticketV13.start();

}
}
