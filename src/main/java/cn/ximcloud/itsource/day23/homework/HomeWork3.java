package cn.ximcloud.itsource.day23.homework;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-09
 * Time: 23:30
 * ProjectName: itsource
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
 * 1.	请写出创建线程的两种方式
 **/
public class HomeWork3 {
    public static void main(String[] args) {
        MyThead myThead = new MyThead("小线程");
        myThead.run();  //myThread.run仅仅是调用这个线程的这个方法，并没有创建一个线程
        myThead.start();    //使用start方法才是真正的让CPU调度这个线程

        ThreadImpl threadImpl = new ThreadImpl();

        Thread thread1 = new Thread(threadImpl);
        Thread thread2 = new Thread(threadImpl);
        Thread thread3 = new Thread(threadImpl);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class ThreadImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("我是通过实现Runnable的run方法，在创建一个线程然后我把作为参数传递进去就可以使用了哟\t由于多个线程可以使用同一个我作为线程来启动，所以我会被多个线程同时共享");
    }
}

class MyThead extends Thread {
    public MyThead(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("我是通过继承Thread来创建的对象，我可以不用在生成一个新的线程对象，直接调用start方法就可使用");
    }
}