package cn.ximcloud.itsource.day20_thread_2.homework;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-07
 * Time: 01:46
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
public class HomeWork2_2 {
    public static void main(String[] args) {
        HomeWork2_2Test homeWork1 = new HomeWork2_2Test();
        HomeWork2_2Test homeWork2 = new HomeWork2_2Test();
        homeWork1.start();
        homeWork2.start();
    }
}

class HomeWork2_2Test extends Thread {
    /*
        线程通信代码实现    同步代码块



        1.本文解决的问题
https://blog.csdn.net/SHENMEGUI_32/article/details/77621803
        (1)wait()方法一定要使用sycronized进行同步吗？不用sycronized修饰会有什么问题？
        (2)wait()方法会释放对象锁，那么这里指的锁是什么？
        (3)wait()会释放对象锁，而sleep()不会释放对象锁，这在实际情况中有什么区别？

        2.结论

        (1)wait()一定要使用sycronized进行同步，否则会报“java.lang.IllegalMonitorStateException”异常。这是因为wait方法会释放对象锁，而此时因为没有用sycronized同步，就没有锁，就会报异常。
        (2)锁指的是sycronized修饰的方法、对象、代码块，如下实例中的value。
        (3)因为wait()释放了锁，故其他线程可以执行本来由sycronized修饰的内容。例如下面实例中的run()方法内打印value值（System.out.println(value);）。
     */
    private static int num = 0; //计数
    private static boolean flag = true;    //线程通信


    public void method() {
        synchronized (HomeWork2_2Test.class) {
            if (flag) {
                flag = false;
                try {
                    HomeWork2_2Test.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                flag = true;
                HomeWork2_2Test.class.notifyAll();
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