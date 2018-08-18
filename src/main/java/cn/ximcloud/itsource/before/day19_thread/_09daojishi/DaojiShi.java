package cn.ximcloud.itsource.before.day19_thread._09daojishi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 15:08
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class DaojiShi {
    /*
        trash code
     */
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame();
        final JButton jButton = new JButton();

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText(jButton.getText().substring(0, 9) + (Integer.valueOf(jButton.getText().substring(9, jButton.getText().length())) + 1) + "");

            }
        });

        jFrame.add(jButton);
        jButton.setFont(new Font("黑体", Font.BOLD, 60));
        jFrame.setName("搞基倒时器");
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        for (int i = 600; i > 0; i--) {
            jButton.setText("剩余时间---->" + i);
            Thread.sleep(1000);
        }
        jFrame.dispose();
    }
}
