package cn.ximcloud.itsource.day1_day47.day14_how_to_using_eclipse;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-27
 * Time: 15:51
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

public class FrameDemo2 {
    //添加按钮
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");
        //设置布局
        //frame.setLayout();
        Button b1 = new Button("确定");
        frame.add(b1);
        Button b2 = new Button("取消");
        frame.add(b2);
        frame.setSize(500, 600);
        frame.setLocation(200, 100);
        frame.setVisible(true);

    }
}
