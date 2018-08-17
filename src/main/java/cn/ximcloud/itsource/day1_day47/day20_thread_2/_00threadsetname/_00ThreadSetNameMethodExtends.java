package cn.ximcloud.itsource.day1_day47.day20_thread_2._00threadsetname;

import cn.ximcloud.itsource.day1_day47.day20_thread_2._03sync_code_method_extends.TicketV3;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-05
 * Time: 10:13
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _00ThreadSetNameMethodExtends {
    /*
        给线程设置线程名
        1.内置一个字段
        2.Thread类中会不会有name字段？如果有那肯定有getset方法
        3.父类存在name字段，name字段是用于设置线程名的，
            子类构造方法调用父类的这个设置名字的构造方法 将设置名字的字段传入给父类

        给线程设置名字，①可以在对象实例化的时候，调用父类设置名字构造方法
        ②也可以在创建线程对象之后，在start()方法调用之前，使用线程对象.setName()方法给线程设置名字
    */
    public static void main(String[] args) {
//        Ticket ticketV31 = new Ticket("程序猿窗口");
//        Ticket ticketV32 = new Ticket("军人窗口");
//        Ticket ticketV33 = new Ticket("普通人窗口");
//
//        ticketV31.start();
//        ticketV32.start();
//        ticketV33.start();
        TicketV3 ticketV31 = new TicketV3();
        TicketV3 ticketV32 = new TicketV3();
        TicketV3 ticketV33 = new TicketV3();

        ticketV31.setName("程序猿窗口");
        ticketV32.setName("小姐窗口");
        ticketV33.setName("小姐姐窗口");
        ticketV31.start();
        ticketV32.start();
        ticketV33.start();

    }
}
