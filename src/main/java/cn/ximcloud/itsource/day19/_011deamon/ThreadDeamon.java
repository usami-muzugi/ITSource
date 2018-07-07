package cn.ximcloud.itsource.day19._011deamon;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-07-04
 * Time: 16:16
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ThreadDeamon {
    /*
     * 守护线程(后台线程、精灵线程)
     * 特点:后台线程，一般是为前台线程服务的，当前台线程死亡的时候，
     * 后台线程不一定会立即死亡
     *
     * 1.创建的线程，是否为后台线程，跟创建这个线程的环境有关系
     *      1.自定义线程，在JAVA 线程环境下
     *      2.JAVA线程，在自定义线程环境下
     *      3.自定义线程，在自定义线程环境下
     *      4.JAVA 线程在JAVA 线程的环境下
     *
     *
     * 意思就是在什么环境下创建的线程，这个线程就是这个标记
     * main是一个前台线程，前台执行完了自定义线程被标记成后台线程了
     * main执行完毕，前台线程死亡，后台线程可能会自动死亡
     * customThread线程虽然启动了线程，但是如果自动死亡，里面的代码主体有可能执行不到
     */


    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        /*
            public final boolean isDaemon() {
               return daemon;
            }
         */
        System.out.println(main.isDaemon());

        /*
            public final void setDaemon(boolean on) {
                checkAccess();
                if (isAlive()) {
                    throw new IllegalThreadStateException();
                }
                daemon = on;
            }
         */
        /*
         * 报错:当线程是活着的状态就不能被标记为后台线程，并抛出一个IllegalThreadStateException
         * false
                Exception in thread "main" java.lang.IllegalThreadStateException
                    at java.base/java.lang.Thread.setDaemon(Thread.java:1458)
                    at cn.ximcloud.itsource.day19._011deamon.ThreadDeamon.main(ThreadDeamon.java:39)
         */
        //main.setDaemon(true);

        Thread thread = new Thread();
        System.out.println(thread.isDaemon());
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());

        //CustonThread Test Utils
        CustomThread customThread = new CustomThread();

        customThread.setDaemon(true);//*这里设置了后台线程*
        System.out.println(customThread.isDaemon());

        customThread.start();
    }
}

class CustomThread extends Thread {
    @Override
    public void run() {
        System.out.println(new Thread().isDaemon());
    }
}

