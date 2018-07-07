package cn.ximcloud.itsource.day2;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-09
 * Time: 10:39
 * ProjectName: ITSource
 * To change this template use FileDemo | Settings | Editor | FileDemo and Code Templates.
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

import java.io.Serializable;

/**
 * 关键字public 修饰class，访问权限，所有类均可访问
 * 关键字class 修饰类名，定义一个类
 */
public class HelloWorld implements Serializable {
    /**
     * 程序执行入口，main()方法，必须被public static void 修饰
     *
     * @param args void
     */
    public static void main(String[] args) {
        System.out.println("1");


    }
}
