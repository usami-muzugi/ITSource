package cn.ximcloud.itsource.day20.homework;

        import cn.ximcloud.itsource.day3.HomeWork;

        import java.util.concurrent.locks.Condition;
        import java.util.concurrent.locks.Lock;
        import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-07
 * Time: 01:06
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
public class HomeWork2Test {
    public static void main(String[] args) {
        HomeWork2 homeWork1 = new HomeWork2();
        HomeWork2 homeWork2 = new HomeWork2();
        homeWork1.start();
        homeWork2.start();
    }
}

class HomeWork2 extends Thread {
    /*
        线程通信代码实现    lock
     */
    private static int num = 0; //计数
    private static boolean flag = true;    //线程通信
    private static final Lock lock = new ReentrantLock();
    private static final Condition condition = lock.newCondition();


    public void method() {
        try {
            lock.lock();
            if (flag) {
                try {
                    flag = false;
                    condition.await();  //lock 和 condition是所有线程对象共享的，await是释放锁。
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                flag = true;
                condition.signalAll();
            }
        }finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        while (num <= 50) {
            method();
        }
    }
}