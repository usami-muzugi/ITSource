package cn.ximcloud.itsource.day1_day47.day32_java_plus.homework;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-24
 * Time: 18:40
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 * 4种设计模式代码敲一遍(例子随便定义) 2
 **/
public class HomeWork4 {
    //懒汉模式

    private static HomeWork4 homeWork4;

    private HomeWork4() {

    }

    public static HomeWork4 getInstance() {
        if (homeWork4 == null) {
            synchronized (HomeWork4.class) {
                if (homeWork4 == null) {
                    return homeWork4 = new HomeWork4();
                }
            }
        }
        return homeWork4;
    }
}
