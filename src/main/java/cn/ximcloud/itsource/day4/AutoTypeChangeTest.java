package cn.ximcloud.itsource.day4;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-13
 * Time: 01:31
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

public class AutoTypeChangeTest {


    public static void main(String[] args) {

    /*
        由小类型转换为大类型，自动类型转换
     */

        //声明并初始化一个 byte类型的变量aByte并赋值127
        byte aByte = 127;
        short aShort = aByte;  //将byte赋值给声明的变量aShort，自动类型转换
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;
        System.out.println(aDouble);
    }

}
