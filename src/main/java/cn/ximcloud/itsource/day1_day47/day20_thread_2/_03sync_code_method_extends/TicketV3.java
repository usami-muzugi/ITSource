package cn.ximcloud.itsource.day1_day47.day20_thread_2._03sync_code_method_extends;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 11:46
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class TicketV3 extends Thread {
    private static int num = 50;
    //int num是对象级别的变量实例变量，这里需要加static让所有对象共享
    String name;

    public TicketV3() {
    }

    public TicketV3(int num) {
        TicketV3.num = num;
    }

    public TicketV3(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (num > 0) {

            saleOne();
        }
    }

    /*
    synchronized 同步方法   【同步监听只有两种，一种是同步监听代码块儿，另一种是同步监听方法】
    加了static就是同步的类的字节码
    不加就是同步this
    */
    public synchronized void saleOne() {
        if (num > 0) {//卖一张票
            System.out.println(Thread.currentThread().getName() + "\t你的票号是" + num);
            num--;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
