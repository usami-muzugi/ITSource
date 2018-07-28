package cn.ximcloud.itsource.day16_useful_classes._08testrandom;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 14:27
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

public class _01TestRandom {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println(random(4));
        }

    }

    private static String random(int sum) {
        final String string = "0123456789abcdefghijklmnopqrstuvwxxyzABCDEFGHIJKLNMOPQRSTUVWXYZ";
        final int length = string.length();

        long l = System.currentTimeMillis();

        String code = "";
        Random random = new Random();

        for (int i = 0; i < sum; i++) {
            /*
             int nextInt() 返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
             int nextInt(int n) 返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。

             */
            code += string.charAt(random.nextInt(length));
//            int nextInt = _10random.nextInt(length);
//            char ch = string.charAt(nextInt);
//            code += ch;
//            char ch = string.charAt((int) (Math._10random() * (length + 1)));
//            code += ch;
        }

        //System.out.println(System.currentTimeMillis() - l);

        return code;
    }


}
