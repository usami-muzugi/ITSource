package cn.ximcloud.itsource.day5_if_for_and_switch;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-11
 * Time: 16:25
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

public class SuanSu {
    public static void main(String[] args) {
        System.out.println(3 - 2);
        System.out.println("宇佐美" + 2);
        System.out.println(3 + 4 + 1.5);    //result:8.5
        //浮点数反正就是不准确
        System.out.println(4 - 1.5);
        System.out.println(4.0 - 1.5);
        System.out.println(2 - 1.1);
        System.out.println(1.0 / 0);  //Infinity 无限大
        System.out.println(0.0 / 0.0);  //NaN Not HashSetTest Number 不是一个数字，这个一种比较特殊的情况
        //JAVA中比较特殊的情况，自身不等与自身
        System.out.println(0.0 / 0.0 == 0.0 / 0.0); //result: false
//        System.out.println(NaN ==NaN);  //这里的NaN被当成了一个标识符（变量）
    }


}
