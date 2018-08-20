package cn.ximcloud.itsource.java8_feature.lambda;

import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 22:35
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class AllTest {

    @Test
    public void testThread() {
//        常规
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("凉了呀，马飞飞");
            }
        };
        new Thread(runnable).start();

//        或者
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JAVA8");
            }
        }).start();

//        Lambda
        new Thread(() -> System.out.println("????")).start();
    }

    @Test
    public void testJButton() {
//        普通操作
        class MyActionListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("好麻烦的说！！");
            }
        }
        ActionListener myActionListener = new MyActionListener();
        new JButton().addActionListener(myActionListener);


//        一般操作
        new JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("添加一个事件监听");
            }
        });

//        秀
        new JButton().addActionListener(x -> System.out.println("秀"));
    }
}
