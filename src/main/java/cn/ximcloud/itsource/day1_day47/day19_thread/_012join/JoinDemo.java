package cn.ximcloud.itsource.day1_day47.day19_thread._012join;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 16:30
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class JoinDemo {
    /*
     *  等待线程终止      Runnable的实现方式测试
     *  假如A线程和B线程都启动中
     *  但是如果B线程在A中调用了B.join()方法
     *  A这个时候需要等待B执行完毕，A才能继续
     */
    public static void main(String[] args) throws InterruptedException {
        Thread dongChuanThreadImpl = new Thread(new DongChuanThreadImpl());
        dongChuanThreadImpl.start();

        for (int i = 1; i <= 50; i++) {
            /*
                public final void join() throws InterruptedException {
                   join(0);
                }
             */
            if (i == 20) dongChuanThreadImpl.join();
            /*
            当i等于20的时候，东川插进来了，然后东川开始执行
            直到东川这个线程执行结束，耀文才能继续开始执行
             */
            System.out.println("耀文的第" + i + "次");
        }
    }
}

class DongChuanThreadImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i >= 0; i--) {
            System.out.println("川川还剩" + i + "次");
        }
    }
}

