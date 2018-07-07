package cn.ximcloud.itsource.day20.homework;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-07
 * Time: 01:58
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
public class HomeWork2_3 {
    public static void main(String[] args) {
        HomeWork2_3Teset homeWork1 = new HomeWork2_3Teset();
        HomeWork2_3Teset homeWork2 = new HomeWork2_3Teset();
        homeWork1.start();
        homeWork2.start();
    }
}

class HomeWork2_3Teset extends Thread {
    /*
        线程通信代码实现    同步方法
     */
    private static int num = 0; //计数
    private static boolean flag = true;    //线程通信

    public synchronized static void method() {
        if (flag) {
            flag = false;
            try {
                HomeWork2_3Teset.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " : " + num);
            num++;
            flag = true;
            HomeWork2_3Teset.class.notify();
        }
    }

    @Override
    public void run() {
        while (num <= 50) {
            method();
        }
    }
}
