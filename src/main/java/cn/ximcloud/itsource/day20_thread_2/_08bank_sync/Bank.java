package cn.ximcloud.itsource.day20_thread_2._08bank_sync;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-05
 * Time: 14:27
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Bank {
    double money;//用于存放钱
    boolean flag = true;    //用于线程通信 是否没钱？ 默认为没钱

    /*
    使用同步方法监听来实现Bank线程存取钱
     */
    //取钱操作
    public synchronized void getMoney() {       //使用同步方法监听对象，这里监听的对象是this，所以就需要采用多个线程共享这个对象。
        //是否有钱
        if (flag) { //没钱
            try {
                //当前线程等待
                Bank.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //存取操作
        System.out.println("取钱之前:" + money);
        money -= 1000;
        System.out.println("取钱之前:" + money);
        //设置标识
        flag = true;
        //唤醒操作
        Bank.class.notify();
    }

    //存钱操作
    public synchronized void saveMoney() {
        //是否没钱
        if (!flag) {  //有钱
            try {
                Bank.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //存取操作
        System.out.println("存钱之前:" + money);
        money += 1000;
        System.out.println("存钱之前:" + money);
        //设置标识
        flag = false;
        //唤醒操作
        Bank.class.notify();
    }

}
