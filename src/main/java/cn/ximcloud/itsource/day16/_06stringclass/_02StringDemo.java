package cn.ximcloud.itsource.day16._06stringclass;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-01
 * Time: 10:08
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
 * //         佛祖保佑        永无BUG       永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class _02StringDemo {
    /*
        String 因为是不可变的，所以每一次变化都是在new一个对象
        所以如果大量拼接，执行效率低下
     */
    public static void main(String[] args) {
        test(1000);
    }

    static void test(int sum) {
        long l = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i < sum; i++) {
            string += i;
        }
        System.out.println(string);
        System.out.println(System.currentTimeMillis() - l);
    }
}
