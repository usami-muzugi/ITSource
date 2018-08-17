package cn.ximcloud.itsource.day1_day47.day19_thread._03Play;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 11:12
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

/*
    测试类
    实现自定义线程
    看到了线程安全的本质
    当两个线程在执行的时候，是随机执行的。
    就有可能在两个线程访问同一个资源的时候，会出现数据的差异性
 */
public class _03ThreadGameTest {
    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        PlayMusic playMusic = new PlayMusic();
        playGame.start();
        playMusic.start();
        //线程的执行时随机的
    }
}
