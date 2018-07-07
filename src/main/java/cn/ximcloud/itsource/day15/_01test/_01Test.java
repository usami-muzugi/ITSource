package cn.ximcloud.itsource.day15._01test;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-28
 * Time: 10:12
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

public class _01Test {

    /*
        组合布局
     */
    public static void main(String[] args) {
        //创建顶层窗体对象，默认布局
        JFrame jFrame = new JFrame();


        //准备组件放入到JFrame

        JButton jButton1 = new JButton("E");
        JButton jButton2 = new JButton("S");
        JButton jButton3 = new JButton("C");

        //设置jpanel布局模式
        JPanel jPanel = new JPanel(new GridLayout(2,2));

        for (int i = 0; i <4; i++) {
            jPanel.add(new JButton(i + ""));
        }

        jFrame.add(jPanel);

//        jFrame.add(jButton1,BorderLayout.EAST);
//        jFrame.add(jButton2,BorderLayout.SOUTH);
//        jFrame.add(jButton3,BorderLayout.CENTER);





        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
