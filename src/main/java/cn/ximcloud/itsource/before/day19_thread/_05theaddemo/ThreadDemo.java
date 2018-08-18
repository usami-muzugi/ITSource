package cn.ximcloud.itsource.before.day19_thread._05theaddemo;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 11:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ThreadDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "----->main方法其实是调用主线程");
        }
        //创建两个自定义线程对象实例
        PlayGameThread playGameThread = new PlayGameThread();
        PlayMusicThread playMusicThread = new PlayMusicThread();

        //执行线程的run()方法只是执行了一遍run方法里面的内容，
        //并没有创建一个独立的线程，获得CPU资源

        //执行线程.start()方法
        playGameThread.start();
        playMusicThread.start();

    }
}
