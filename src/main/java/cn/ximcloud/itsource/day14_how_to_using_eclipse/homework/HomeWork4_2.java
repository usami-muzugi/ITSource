package cn.ximcloud.itsource.day14_how_to_using_eclipse.homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-27
 * Time: 19:38
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


public class HomeWork4_2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("HomeWork4_2-边框布局");

        jFrame.setLayout(null);

        BorderLayout borderLayout = new BorderLayout();
        jFrame.setLayout(borderLayout);

        JButton jButton1 = new JButton("北海北");
        JButton jButton2 = new JButton("夏东海");
        JButton jButton3 = new JButton("西游记");
        JButton jButton4 = new JButton("南山南");
        JButton jButton5 = new JButton("党中央");


        jFrame.add(jButton1, BorderLayout.NORTH);
        jFrame.add(jButton2, BorderLayout.EAST);
        jFrame.add(jButton3, BorderLayout.WEST);
        jFrame.add(jButton4, BorderLayout.SOUTH);
        jFrame.add(jButton5, BorderLayout.CENTER);


        jFrame.setSize(550, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
