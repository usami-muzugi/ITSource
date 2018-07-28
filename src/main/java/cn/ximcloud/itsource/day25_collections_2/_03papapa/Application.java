package cn.ximcloud.itsource.day25_collections_2._03papapa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 14:51
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 3.做出如下的效果：
 * 功能：
 * 先点击“来一首”  --》 在左边显示框中，开始播放一首歌曲；
 * 在点击“一起来”  --》 在左边显示框中，每间隔一秒打印一次“啪啪啪。。。”，每次都换行
 * 提示: 可能会用到多线程
 **/

public class Application {
    static boolean b = false;

    public static void main(String[] args) {
        Frame jFrame = new Frame("计算器");
        jFrame.setLayout(null);

        TextArea textArea = new TextArea();
        Button jB1 = new Button("one");
        Button jB2 = new Button("more");

        textArea.setBounds(50, 100, 200, 300);
        jB1.setBounds(350, 100, 100, 80);
        jB2.setBounds(350, 300, 100, 80);

        jB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = false;
                textArea.append("来一首\r\n");
            }
        });
        jB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("啪啪啪啪啪软\r\n");
                while (true) {
                    try {
                        Thread.sleep(1000);
                        return;
                    } catch (InterruptedException e1) {
                    }
                }
            }
        });

        jFrame.add(jB2);
        jFrame.add(jB1);
        jFrame.add(textArea);

        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }

}
