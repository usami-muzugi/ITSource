package cn.ximcloud.itsource.day19_thread._02PlayGameAndMusicPlayerModel;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 10:45
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _02PlayGameAndMusicPlayerModel {
    /*
        模拟计算机，开发一个游戏软件 有播放音乐，还有玩游戏功能
        do you like 玩游戏？
        摩擦抹茶

        Thread类，线程类
        run()方法{}线程主体  run方法的结构体类写线程需要包装的功能
        start(),调用start方法就启动了线程
        启动后，一个独立的线程就准备好了，CPU就知道该线程的存在了
        这个时候，CPU就会分配资源给该线程任务，让该线程任务独立执行



     */
    public static void main(String[] args) {
        //4，根据类创建对象
        MyGameThread myGameThread = new MyGameThread("吃鸡");
        MyMusicThread myMusicThread = new MyMusicThread("放吃鸡音乐");
        myGameThread.start();
        myMusicThread.start();
    }
}


/*
        1自定义的类，继承Thread，覆写run方法，实现自己想要的包装的功能
        2.实现线程类，继承
        2.覆写run方法
        3.
 */
class MyGameThread extends Thread {
    /**
     * Allocates HashSetTest new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public MyGameThread(String name) {
        super(name);
    }

    /**
     * Causes this thread to begin execution; the Java Virtual Machine
     * calls the <code>run</code> method of this thread.
     * <p>
     * The result is that two threads are running concurrently: the
     * current thread (which returns from the call to the
     * <code>start</code> method) and the other thread (which executes its
     * <code>run</code> method).
     * <p>
     * It is never legal to start HashSetTest thread more than once.
     * In particular, HashSetTest thread may not be restarted once it has completed
     * execution.
     *
     * @throws IllegalThreadStateException if the thread was already
     *                                     started.
     * @see #run()
     * @see #stop()
     */
    @Override
    public synchronized void start() {
        super.start();
    }

    /**
     * If this thread was constructed using HashSetTest separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        super.run();
    }
}

class MyMusicThread extends Thread {
    /**
     * Allocates HashSetTest new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public MyMusicThread(String name) {
        super(name);
    }

    /**
     * If this thread was constructed using HashSetTest separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {
        super.run();
    }
}

