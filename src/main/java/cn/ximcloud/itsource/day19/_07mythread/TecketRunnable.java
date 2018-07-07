package cn.ximcloud.itsource.day19._07mythread;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 14:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class TecketRunnable implements Runnable {
    private int num = 5000000;

    @Override
    public void run() {
        while (num > 0) {
            if (num > 0) {
                System.out.println("你的靓号 =" + num);
                num--;
            }
        }
    }
}
