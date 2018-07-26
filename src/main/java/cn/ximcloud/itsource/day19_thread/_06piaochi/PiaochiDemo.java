package cn.ximcloud.itsource.day19_thread._06piaochi;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 11:42
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class PiaochiDemo {
    /* 多线程的售票实例
     *  1.明确做什么功能 卖票
     *  2.定义一个类就行 三个窗口是三个线程对象
     *  3.实现卖票的功能
     *  4.只有在票数大于零的时候才能卖票
     */

    public static void main(String[] args) {
//        Thread.currentThread().notify();

//        TicketV1 ticketV11 = new TicketV1();
//        TicketV1 ticketV12 = new TicketV1();
//        TicketV1 ticketV13 = new TicketV1();
//
//        ticketV11.start();
//        ticketV12.start();
//        ticketV13.start();
//
//        /*
//        你的票号是50
//        你的票号是50
//        你的票号是50
//
//        自定义线程类的num字段不是static修饰的，对象之间不共享，
//        所以就是都是50
//         */
//
//
        TicketV2 ticketV21 = new TicketV2();
        TicketV2 ticketV22 = new TicketV2();
        TicketV2 ticketV23 = new TicketV2();

        ticketV21.start();
        ticketV22.start();
        ticketV23.start();

        /*
        三张都是50的情况是，都在执行++操作之前切换了线程

        你的票号是50
        你的票号是50
        你的票号是48
        这个是第一个执行一半打印了50，然后是第二个线程进去打印了50，然后就是回到第一个线程，总票数是49，然后是第二个线程，总票数是48，然后该第三个线程了，打印总票数48


        这里体现了线程的不安全
         */

//        TicketV3 ticketV31 = new TicketV3();
//        TicketV3 ticketV32 = new TicketV3();
//        TicketV3 ticketV33 = new TicketV3();
//
//        ticketV31.start();
//        ticketV32.start();
//        ticketV33.start();
        /*
        你的票号是50
你的票号是49
你的票号是48
你的票号是47
你的票号是46
你的票号是45
你的票号是44
你的票号是43
你的票号是42
你的票号是41
你的票号是40
你的票号是39
你的票号是39
你的票号是39
你的票号是36
你的票号是35
你的票号是34
你的票号是33
你的票号是32
你的票号是31
你的票号是30
你的票号是29
你的票号是28
你的票号是27
你的票号是26
你的票号是25
你的票号是24
你的票号是23
你的票号是22
你的票号是21
你的票号是20
你的票号是19
你的票号是18
你的票号是17
你的票号是16
你的票号是15
你的票号是14
你的票号是13
你的票号是12
你的票号是11
你的票号是10
你的票号是9
你的票号是8
你的票号是7
你的票号是6
你的票号是5
你的票号是4
你的票号是37
你的票号是38
你的票号是2
你的票号是3
你的票号是1

         */
    }


}


