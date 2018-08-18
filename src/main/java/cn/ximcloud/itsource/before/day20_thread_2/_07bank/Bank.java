package cn.ximcloud.itsource.before.day20_thread_2._07bank;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
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
    使用同步监听对象的方式
     */
    //取钱操作
    public void getMoney() {
        synchronized (Bank.class) {    //同步所有线程共同能访问的对象
            //是否有钱
            if (flag) { //没钱
                try {
                    //当前线程等待
                    //Bank.class.wait();      //这里同步监听的对象是Bank.class所以，这里就必须是Bank.class.wait()
                    this.getClass().wait();   //当然也可以皮一下使用这种，但是要记住类的对象一个JVM中只有一个
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
    }

    //存钱操作
    public void saveMoney() {
        synchronized (Bank.class) {
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
}
