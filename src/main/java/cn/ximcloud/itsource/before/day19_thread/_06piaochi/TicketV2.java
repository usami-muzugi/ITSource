package cn.ximcloud.itsource.before.day19_thread._06piaochi;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 11:46
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class TicketV2 extends Thread {
    //int num是对象级别的变量实例变量，这里需要加static让所有对象共享
    private static int num = 50;

    public TicketV2() {
    }

    @Override
    public void run() {
        if (num > 0) {
            System.out.println("你的票号是" + num);
            num--;
        }
    }
}
