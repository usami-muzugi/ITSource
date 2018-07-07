package cn.ximcloud.itsource.day20._99test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-06
 * Time: 23:36
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
public class CoThread extends Thread {
    /*
    main : num自增完成,当前num值:50
    main : num自增完成,当前num值:49
    main : num自增完成,当前num值:48
    Thread-0 : num自增完成,当前num值:47
    Thread-1 : num自增完成,当前num值:46
    Thread-2 : num自增完成,当前num值:46

    main : num自减完成,当前num值:49
    main : num自减完成,当前num值:48
    main : num自减完成,当前num值:47
    Thread-0 : num自减完成,当前num值:46
    Thread-2 : num自减完成,当前num值:44
    Thread-1 : num自减完成,当前num值:44

    使用了lock
    main : num自减完成,当前num值:49
    main : num自减完成,当前num值:48
    main : num自减完成,当前num值:47
    Thread-0 : num自减完成,当前num值:46
    Thread-2 : num自减完成,当前num值:45
    Thread-1 : num自减完成,当前num值:44
     */
    private static int num = 50;
    private static final Lock lock = new ReentrantLock();

    public CoThread() {
        try {
            lock.lock();
            num--;
            System.out.println(Thread.currentThread().getName() + " : " + "num自减完成,当前num值:" + num);
        } finally {
            lock.unlock();
        }
    }

    //@Override
    public static int getNum() {
        return num;
    }

    @Override
    public void run() {
        //System.out.println(Thread.currentThread().getName() + " : " + "构造方法开始执行,当前num值:" + num);

        if (num > 0) {
            new CoThread();
        }

    }
}
