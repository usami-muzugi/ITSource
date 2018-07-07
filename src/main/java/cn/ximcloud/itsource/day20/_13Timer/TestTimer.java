package cn.ximcloud.itsource.day20._13Timer;

import java.util.Timer;

public class TestTimer {
    /*
     * 定时任务:
     *  java.util.TimerTask由 Timer 安排为一次执行或重复执行的任务。
     *  Timer 一种工具，线程用其安排以后在后台线程中执行的任务
     *
     * 	Timer()  创建一个新计时器。
     *
     * */
    public static void main(String[] args) {
        Timer timer = new Timer();
        //void schedule(TimerTask task, long delay) 安排在指定延迟后执行指定的任务。
        MyTimerTask mtt = new MyTimerTask();
        //timer.schedule(mtt, 3000);
        // void schedule(TimerTask task, Date time)安排在指定的时间执行指定的任务。
        //timer.schedule(mtt, new Date( System.currentTimeMillis()+5000  ));

        MyThread myThread = new MyThread();
        //timer.schedule(myThread, 5000);
    }

}
