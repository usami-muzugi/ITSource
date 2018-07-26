package cn.ximcloud.itsource.day20_thread_2.homework;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-07
 * Time: 01:03
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
public class HomeWork1_1 {
        /*
        同步线程方式选二实现
        实现 同步方法
     */

    public static void main(String[] args) {
        TestThread1 testThread = new TestThread1();
        Thread thread1 = new Thread(testThread);
        Thread thread2 = new Thread(testThread);
        Thread thread3 = new Thread(testThread);
        Thread thread4 = new Thread(testThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}

class TestThread1 implements Runnable {
    private static int num = 50;

    public synchronized /*static*/ void method() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + num);
            num--;
        }
    }


    @Override
    public void run() {
        method();
    }
}
