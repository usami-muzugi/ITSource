package cn.ximcloud.itsource.day20.homework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-07
 * Time: 01:35
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
public class HomeWork3 {
    public static void main(String[] args) {
        HomeWork3Test homeWork1 = new HomeWork3Test();
        HomeWork3Test homeWork2 = new HomeWork3Test();
        homeWork1.start();
        homeWork2.start();
    }
}

class HomeWork3Test extends Thread {
    /*
        死锁  BUG实现的死锁，依靠的是同步的不是同一个对象
     */
    private static int num = 0; //计数
    private static boolean flag = true;    //线程通信


    public void method() {
        synchronized (this) {
            if (flag) {
                flag = false;
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                flag = true;
                notifyAll();
            }
        }
    }

    @Override
    public void run() {
        while (num <= 50) {
            method();
        }
    }
}