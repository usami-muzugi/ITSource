package cn.ximcloud.itsource.day25._03papapa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-12
 * Time: 16:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ActionListenerImpl implements Runnable, ActionListener {
    private boolean flag = false;
    private static ActionEvent actionEvent;

    @Override
    public void actionPerformed(ActionEvent e) {
        flag = true;
        actionEvent = e;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
