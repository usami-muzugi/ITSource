package cn.ximcloud.itsource.day20_thread_2._08bank_sync;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-05
 * Time: 14:28
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class GetMoneyThread extends Thread {
    //取钱线程
    private Bank bank;

    public GetMoneyThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            bank.getMoney();    //使用bank对象的getMoney对bank对象的字段money进行操作
        }
    }
}
