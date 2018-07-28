package cn.ximcloud.itsource.day20_thread_2._01ticket_sync_code_extends;

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
	/*  synchronized (mutex) {
			//需要同步的核心的业务代码块
		}
		mutex : 同步监听对象
			1.必须保证是同步监听对象【是个对象】
			2.达到同步代码的目的,多个线程访问的同步监听对象必须是同一个【多个线程对象监听的是同一个对象】
			3.同步监听对象可以是任意的对象:必须保证前提1和2
			4.偶尔this也可以是同步监听对象[必须保证1 2]
			5.一个类的字节码对象Class,也可以是同步监听对象[当前类的字节码文件作为同步监听对象最常用] 【this.getClass() 等同于 类名.class 】这个Class类的 这个类 的对象 ，整个JVM就只有一个
					1.为什么最常用:因为一个类的字节码对象在JVM中只存在一个【只有一个】
					2.Class是描述的类这一类事物,具体的一个Class对象,就是具体的一个类 【详细的测试可以在_99test Test里看到】
							Student类名.class
							Student对象名.getClass();
					3.所以,有限就使用字节码对象作为同步监听对象
						       测试核心业务代码块的同步问题
					4.测如上可以作为同步监听对象的情况
						static Object obj  = new Object();//静态修饰,被三个对象共享,所以是同一个
						this不可以:因为指代的是当前对象  【因为this是指代的当前对象，创建了三个线程对象，他们就是在堆内存中各自开辟的三个不同的内存空间，所以如果使用同步监听的话，他们就是监听的各自的对象，获取的是自己的钥匙】

        多线程的售票实例
     *  1.明确做什么功能 卖票
     *  2.定义一个类就行 三个窗口是三个线程对象
     *  3.实现卖票的功能
     *  4.只有在票数大于零的时候才能卖票
     */

    public static void main(String[] args) {
        Ticket ticketV31 = new Ticket(50);
        Ticket ticketV32 = new Ticket();
        Ticket ticketV33 = new Ticket();

        ticketV31.start();
        ticketV32.start();
        ticketV33.start();
    }
}
