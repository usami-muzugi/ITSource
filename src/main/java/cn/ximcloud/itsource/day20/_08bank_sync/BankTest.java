package cn.ximcloud.itsource.day20._08bank_sync;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-05
 * Time: 14:40
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class BankTest {
    public static void main(String[] args) {
//        //所以这里只创建了一个Bank的对象，然后将这个对象传入取钱线程和存钱线程的构造方法中
//        //线程获得这个对象，将其作为自己的一个字段然后进行操作，但是注意的是不要new了一个新的Bank对象。应该是使用bank对象的getset方法对bank对象里的字段进行操作
//        Bank bank = new Bank();
//        GetMoneyThread getMoneyThread = new GetMoneyThread(bank);
//        SaveMoneyThread saveMoneyThread = new SaveMoneyThread(bank);
//        //saveMoneyThread.setPriority(10);
//        getMoneyThread.start();
//        saveMoneyThread.start();
    }
}
