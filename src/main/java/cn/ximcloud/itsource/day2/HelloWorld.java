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
        /**
         * 打印自动调用toString(),本质上是println()方法调用了toString()方法
         */
        System.out.println("1");
        /**
         *     public void println(String x) {
         *         synchronized (this) {
         *             print(x);
         *             newLine();
         *         }
         *     }
         *     public void print(String s) {
         *         write(String.valueOf(s));
         *     }
         */
        System.out.println(1);
        /**
         *     public void println(int x) {
         *         synchronized (this) {
         *             print(x);
         *             newLine();
         *         }
         *     }
         *     public void print(int i) {
         *         write(String.valueOf(i));
         *     }
         */

        System.out.println(new HelloWorld());
        /**
         *     public void println(Object x) {
         *         String s = String.valueOf(x);
         *         synchronized (this) {
         *             print(s);
         *             newLine();
         *         }
         *     }
         *     public void print(int i) {
         *         write(String.valueOf(i));
         *     }
         *     public static String valueOf(Object obj) {
         *         return (obj == null) ? "null" : obj.toString();
         *     }
         */

    }
}
