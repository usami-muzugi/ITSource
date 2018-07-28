package cn.ximcloud.itsource.day5_if_for_and_switch;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-13
 * Time: 15:38
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

public class WhileDemo {


    public WhileDemo() {
    }


    public static void main(String[] args) {
        //求出20以内3的倍数的数字和个数
        int index = 1, sum = 0, count = 0;
        do {
            if (index % 3 == 0) {
                sum += index;
                count++;
            }
            index++;
        } while (index <= 20);
        System.out.println("0以内3的倍数的数字之和:" + sum + "\n0以内3的倍数的数字个数" + count);
        add(1, 1);
        add(22, 2);
    }


    /**
     * @param a
     * @param b
     */
    static void add(int a, int b) {

    }
}
