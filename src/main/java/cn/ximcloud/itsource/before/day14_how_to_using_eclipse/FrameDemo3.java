package cn.ximcloud.itsource.before.day14_how_to_using_eclipse;

import javax.swing.*;
import java.awt.*;


/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-27
 * Time: 16:18
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

public class FrameDemo3 {

    //给顶层窗体添加流式布局
    public static void main(String[] args) {
        //第一步，准备顶层窗体对象
        JFrame jFrame = new JFrame();

        //第五步，准备布局模式
        FlowLayout flowLayout = new FlowLayout();


        //第六步，设置顶层窗体的布局模式
        jFrame.setLayout(flowLayout);


        //第七步，准备按钮
        JButton jButton1 = new JButton("文国印牛逼！");
        JButton jButton2 = new JButton("文国印牛逼！");
        JButton jButton3 = new JButton("文国印牛逼！");
        JButton jButton4 = new JButton("文国印牛逼！");

        //第八步，将按钮添加到顶层窗体
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);


        //第二步，设置顶层窗体大小
        jFrame.setSize(500, 500);
        //第三部，设置顶层窗体的位置
        jFrame.setLocationRelativeTo(null);

        //显示顶层窗体
        jFrame.setVisible(true);


    }
}
