package cn.ximcloud.itsource.before.day25_collections_2._03papapa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 16:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ActionListenerImpl implements Runnable, ActionListener {
    private static ActionEvent actionEvent;
    private boolean flag = false;

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
