package cn.ximcloud.itsource.day19._04threadattention;

import cn.ximcloud.itsource.day19._03Play.PlayGame;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 11:24
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _01ThreadAttention {
    /*
        线程的注意事项
        1.其实run方法也是一个方法而已，所以也可以按照普通方法调用，
        普通方法调用，不是启动了一个线程，不会获取CPU资源
        2.调用start方法，就是启动了一个独立的线程
            启动.start()方法的时候，还是调用run方法
        3.线程启动都是独立的，与主线程没有任何关系

     */
    public static void main(String[] args) {
        //main(null);
        //Exception in thread "main" java.lang.StackOverflowError
        PlayGame playGame = new PlayGame();
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "----->main");
        }
        //按照执行流程，主方线程执行完打印之后才是执行这个playgame线程
        playGame.start();

        //如果将playgame放在上面就会出现线程交替
        //主线程结束是在主方法执行结束之后。
    }
}
