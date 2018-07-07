package cn.ximcloud.itsource.day19._08sleep;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 15:05
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class _01Sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("12313");
        //线程休眠
        //public static native void sleep(long millis) throws InterruptedException extends Exception;
        Thread.sleep(1000); //millis毫秒
        System.out.println("asdf2");

        //倒计时

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
