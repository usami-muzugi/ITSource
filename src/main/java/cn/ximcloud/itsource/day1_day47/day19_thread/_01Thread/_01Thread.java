package cn.ximcloud.itsource.day1_day47.day19_thread._01Thread;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 10:12
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _01Thread {
    /*
        线程的概念:【概念掌握】
        线程可以看作时一个很小的代码块，
        进程中的最小的单位，CPU处理任务的最小单位就是线程
        作用:
        包装独立的软件任务[独立的获取CPU资源]
     */
    public static void main(String[] args) {
        //Thread thread = new Thread();//JAVA中线程也是一种类，线程的实现就是线程的对象
        //lambda表达式
        new Thread(() -> {
            System.out.println("可以这样");
        }).start();
    }
}
