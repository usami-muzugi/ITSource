package cn.ximcloud.itsource.before.day20_thread_2.homework;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-07
 * Time: 00:57
 * ProjectName: ITSource
 * To change this template use File | Settings | File Templates.
 * <p>
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/
public class HomeWork1 {
    /*
        同步线程方式选二实现
        继承 同步代码块
     */

    public static void main(String[] args) {
        TestThread testThread1 = new TestThread();
        TestThread testThread2 = new TestThread();
        TestThread testThread3 = new TestThread();
        TestThread testThread4 = new TestThread();
        testThread1.start();
        testThread2.start();
        testThread3.start();
        testThread4.start();
        /*
            Thread-0 : 48
            Thread-2 : 48
            Thread-3 : 47
            Thread-1 : 48
         */

        /*
            Thread-0 : 50
            Thread-2 : 49
            Thread-3 : 48
            Thread-1 : 47
         */

    }
}

class TestThread extends Thread {
    private static int num = 50;

    @Override
    public void run() {
        if (num > 0) {
            synchronized (this.getClass().getName()) {  //可见性，原子性
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num--;
            }
        }

    }
}

