package cn.ximcloud.itsource.before.day14_how_to_using_eclipse.homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-27
 * Time: 17:55
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

public class HomeWork6 {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);


        JButton[] jButtons = new JButton[24];
        String[] strings = new String[]{"±", "0", ".", "=", "1", "2", "3", "+", "4", "5", "6", "-",
                "7", "8", "9", "×", "CE", "C", "DEL", "÷", "%", "√", "x^2", "1/x"};

        int x = 30;
        int y = 490;

        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i] = new JButton(strings[i]);
        }

//        5 6 7 8 9
//        0 1 2 3 4

        for (int i = 0; i < jButtons.length; i++) {
            if (i % 4 == 0) {
                x = 10;
                y -= 45;
                jButtons[i].setBounds(x, y, 80, 40);
            } else {
                x += 85;
                jButtons[i].setBounds(x, y, 80, 40);
            }
        }


        for (JButton jButton : jButtons
        ) {
            jFrame.add(jButton);
        }


//        jButton0.setBounds(115,450,80,40);
//        jButton1.setBounds(30,405,80,40);
//        jButton2.setBounds(115,405,80,40);
//        jButton3.setBounds(200,405,80,40);
//        jButton4.setBounds(30,360,80,40);
//        jButton5.setBounds(115,360,80,40);
//        jButton6.setBounds(200,360,80,40);
//        jButton7.setBounds(115,180,80,40);
//        jButton8.setBounds(115,135,80,40);
//        jButton9.setBounds(115,90,80,40);
//
//
//
////        jFrame.add(borderLayout,jButton1);
//        jFrame.add(jButton0);
//        jFrame.add(jButton1);
//        jFrame.add(jButton2);
//        jFrame.add(jButton3);
//        jFrame.add(jButton4);
//        jFrame.add(jButton5);
//        jFrame.add(jButton6);
//        jFrame.add(jButton7);
//        jFrame.add(jButton8);
//        jFrame.add(jButton9);
//

        TextField textField = new TextField();
        textField.setText("1 + 1 = 2");
        textField.setBounds(0, 0, 380, 100);

        jFrame.add(textField);

        jFrame.setSize(380, 540);
        jFrame.setTitle("草鸡无敌牛逼飙水水计算器");
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
