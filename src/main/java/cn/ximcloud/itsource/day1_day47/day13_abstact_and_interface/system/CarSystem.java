package cn.ximcloud.itsource.day1_day47.day13_abstact_and_interface.system;

import cn.ximcloud.itsource.day1_day47.day13_abstact_and_interface.Menu;
import cn.ximcloud.itsource.day1_day47.day13_abstact_and_interface.utils.Init;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-24
 * Time: 12:36
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

public class CarSystem {
    //超级用户名
    public static final String SUPER_ADMIN_NAME = "usamimizugi";
    //超级用户密码
    public static final String SUPER_ADMIN_PASSWORD = "ourinsama";
    private static CarSystem instance = new CarSystem();

    private CarSystem() {

    }

    public static CarSystem getInstance() {
        return instance;
    }

    public void start() {
        //初始化操作
        Init.start();

        //UI人机交互
        Menu.start();
    }

}
