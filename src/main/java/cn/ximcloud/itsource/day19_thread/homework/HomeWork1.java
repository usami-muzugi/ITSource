package cn.ximcloud.itsource.day19_thread.homework;

import javax.swing.*;
import java.text.SimpleDateFormat;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 18:20
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class HomeWork1 {

    /*
    第六题：写一个有图形界面的时钟（相当于电子表）
     */

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton();
        jButton.setName("click");

        jFrame.add(jButton);
        jFrame.setName("电子表");
        jFrame.setVisible(true);
        jFrame.setSize(300, 150);
        jFrame.setLocationRelativeTo(null);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd HH时mm分ss秒 E");
        for (; ; ) {
            //jButton.setText(new SimpleDateFormat("yyyy年MM月dd HH时mm分ss秒 E").format(new Date()));
            jButton.setText(simpleDateFormat.format(System.currentTimeMillis()));
            Thread.sleep(999);
        }
    }
}
