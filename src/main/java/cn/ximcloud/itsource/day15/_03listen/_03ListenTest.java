package cn.ximcloud.itsource.day15._03listen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-28
 * Time: 10:48
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

public class _03ListenTest {
    /*
        监听机制

        1.什么是事件驱动机制
            当时间发生狗感知到的

     */
    public static void main(String[] args) {
        //①创建顶层窗体对象，默认布局
        JFrame jFrame = new JFrame();

        jFrame.setLayout(null); //清除默认布局

        //②创建一个jbutton 和 TextFiled
        JButton jButton = new JButton("点我点我\nQAQ"); //创建button
        jButton.setBounds(100,300,100,100); //设置位置
        TextField textField = new TextField();  //创建textfield
        textField.setBounds(100,100,100,100);   //设置位置

        //③需要给按钮添加事件监听

        /* ActionListener是一个接口，addActionListener()传入的是一个ActionListener类，所以就要传入他的具体实现类
        public interface ActionListener extends EventListener {
            public void actionPerformed(ActionEvent e);
         */
//        ActionListener 事件监听接口 interface
        //ActionListener:ActionPerformed() : 当事件发生会调用该方法，完成一些事情
        //明确自己要做的功能，获取值，设置值！
        //已经实现了ActionListener接口的类，覆写的方法未必能够满足自己所有的方法功
        //最好自己实现接口覆写方法！
        MyActionListener myActionListener = new MyActionListener(jButton,textField);    //创建自己的事件监听实现类，并传入jbutton，textfield

        jButton.addActionListener(myActionListener);    //添加事件监听的实现类的对象
        /*
            result: やめてくださいwwwww
         */
        jFrame.add(textField);  //窗体添加textfield
        jFrame.add(jButton);    //窗体添加 jbutton




        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
