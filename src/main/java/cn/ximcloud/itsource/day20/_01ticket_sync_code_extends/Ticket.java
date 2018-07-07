package cn.ximcloud.itsource.day20._01ticket_sync_code_extends;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 11:46
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Ticket extends Thread {
    //int num是对象级别的变量实例变量，这里需要加static让所有对象共享
    String name;
    private static int num = 50;
    private static final String string = "";

    public Ticket() {
    }

    public Ticket(int num) {
        Ticket.num = num;
    }

    public Ticket(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (num > 0) {
            synchronized (string) {    //使用继承，创建几个线程对象。这几个线程对象都是独立存放在堆内存里的。
                /*
                这里应该使用什么对象作为同步监听对象呢？
                答案是一个被三个线程共享的且不会被修改的字段。所以，这里使用this.getClass()是不二之选。
                同时，我这里新添加了一个private static final String string字段，这个也是同时被三个对象共享的也是不能修改的。这个也可以的
                 */
                if (num > 0) {
                    System.out.println(super.getName() + "\t你的票号是" + num);
                    num--;
                    Thread.yield();
                }
            }
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
