package cn.ximcloud.itsource.before.day14_how_to_using_eclipse;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-25
 * Time: 15:57
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

public class FrameDemo {

    //添加窗体
    public static void main(String[] args) {
        /*
         *     public JFrame(String title) throws HeadlessException {
         *         super(title);
         *         frameInit();
         *     }
         */
        JFrame frame = new JFrame("超级无敌牛皮飙水水计算器");   //窗体对象实例化


        JButton button1 = new JButton("文国印牛逼!");


        button1.setSize(10, 20);
        button1.getIcon();


        frame.add(button1); //添加button
/*        frame.add(button2);
        frame.add(button3);
        frame.add(button4);*/

        frame.setSize(500, 500);     //设置窗体大小
        //frame.setLocation(500,500);   //设置窗体位置
        frame.setLocationRelativeTo(null);  //设置窗体居中
        //    public void setLocationRelativeTo(Component c) {  component对象
        frame.setVisible(true);//设置窗体可见应该设置在最后
    }
}
