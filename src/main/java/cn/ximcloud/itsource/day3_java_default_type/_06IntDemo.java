package cn.ximcloud.itsource.day3_java_default_type;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-10
 * Time: 14:45
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

public class _06IntDemo {
    public static void main(String[] args) {
        /*
            基本数据类型 8大类
            boolean byte short char int long folat double
            还有其对应的包装类
         */

        /**
         * 0x开头的是16进制
         * 0开头的是8进制
         *
         */
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;  //10默认是int类型，所以需要在10后面加L,也可以不加。

        System.out.println(0b1);
        System.out.println();
        System.out.println();
        System.out.println();
        char c = 'A';
        String string = "65";
        System.out.println(c + 35);  //算术相加
        System.out.println(string + 35);  //字符串拼接
        Integer integer = 35;
        System.out.println(string + integer.toString());
    }


}
