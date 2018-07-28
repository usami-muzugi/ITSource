package cn.ximcloud.itsource.day14_how_to_using_eclipse;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-27
 * Time: 16:34
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class FrameDemo6 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        BorderLayout borderLayout = new BorderLayout();

        jFrame.setLayout(borderLayout);

        JButton jButton1 = new JButton("文国印牛逼！");
        JButton jButton2 = new JButton("文国印牛逼！");
        JButton jButton3 = new JButton("文国印牛逼！");
        JButton jButton4 = new JButton("文国印牛逼！");
        JButton jButton5 = new JButton("文国印牛逼！");
        JButton jButton6 = new JButton("文国印牛逼！");

        jButton1.setPreferredSize(new Dimension(1000, 100));

        jFrame.add(jButton1, BorderLayout.EAST);
        jFrame.add(jButton2, BorderLayout.NORTH);
        jFrame.add(jButton3, BorderLayout.CENTER);
        jFrame.add(jButton4, BorderLayout.SOUTH);
        jFrame.add(jButton5, BorderLayout.WEST);
        jFrame.add(jButton6, BorderLayout.NORTH);

        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);


        /*
         *
        Frame frame = new Frame();


        BorderLayout borderLayout = new BorderLayout();

        frame.setLayout(borderLayout);

        Button jButton1 = new Button("文国印牛逼！");
        Button jButton2 = new Button("文国印牛逼！");
        Button jButton3 = new Button("文国印牛逼！");
        Button jButton4 = new Button("文国印牛逼！");
        Button jButton5 = new Button("文国印牛逼！");
        Button jButton6 = new Button("文国印牛逼！");

        jButton1.setPreferredSize(new Dimension(1000,100));

        frame.add(jButton1,BorderLayout.EAST);
        frame.add(jButton2,BorderLayout.NORTH);
        frame.add(jButton3,BorderLayout.CENTER);
        frame.add(jButton4,BorderLayout.SOUTH);
        frame.add(jButton5,BorderLayout.WEST);
        frame.add(jButton6,BorderLayout.NORTH);

        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
         */

    }
}
