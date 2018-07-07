package cn.ximcloud.itsource.day15._02selfdemo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-28
 * Time: 10:33
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

public class SeftDemo {

    /*
        计算器布局设置，简易计算器分析和基础代码
     */
    public static void main(String[] args) {
        //①创建顶层窗体对象，默认布局
        JFrame jFrame = new JFrame();


        //②清空默认布局
        jFrame.setLayout(null);

        //③准备组件
        int index = 10;
        JButton[] jButtons = new JButton[index];

        //④组件的这只大小及位置

        //⑤将组件添加到顶层窗体中

        TextField textField = new TextField();
        textField.setBounds(100,100,300,100);

        /*
         *  分析需求完成点击按钮将值传入文本框
         *      1.当点击的时候获取按钮中的值
         *
         */

        char ch = '1';
        for (int i = 0; i < jButtons.length; i++) {
            (jButtons[i] = new JButton(ch+"")).setBounds(100,100,300,100);
            ch++;
        }

        jFrame.add(textField);

        for (JButton jb:jButtons
             ) {
            jFrame.add(jb);
        }
        //④设置组件的大小和位置





        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
