package cn.ximcloud.itsource.before.day20_thread_2._03sync_code_method_extends;

import cn.ximcloud.itsource.before.day20_thread_2._01ticket_sync_code_extends.Ticket;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-05
 * Time: 10:27
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _00TestSync {
    /*
        synchronized ()同步测试
        synchronized (mutex) {
            //需要同步的核心的业务代码块儿
        }
        mutex：同步监听对象

        synchrorized 可以加在方法上，如果方法没有用static修饰，同步的对象就是this，如果加了static修饰，同步的对象就是this.getClass()
     */
    public static void main(String[] args) {
        /*
        冷静分析:

         */
        Ticket ticketV31 = new Ticket(5000);
        Ticket ticketV32 = new Ticket();
        Ticket ticketV33 = new Ticket();

        ticketV31.start();
        ticketV32.start();
        ticketV33.start();
    }
}
