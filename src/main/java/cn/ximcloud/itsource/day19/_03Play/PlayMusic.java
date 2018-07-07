package cn.ximcloud.itsource.day19._03Play;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 11:13
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class PlayMusic extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("抹茶抹茶摩擦" + i);
        }
    }
}
