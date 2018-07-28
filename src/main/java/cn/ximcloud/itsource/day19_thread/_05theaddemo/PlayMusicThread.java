package cn.ximcloud.itsource.day19_thread._05theaddemo;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 11:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class PlayMusicThread extends Thread {
    public PlayMusicThread() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + "----->吃音乐");
        }
    }

    public PlayMusicThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
    }
}
