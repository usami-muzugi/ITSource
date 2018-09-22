package cn.ximcloud.itsource.java8_feature.语法糖;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author: wzard
 * Date: 2018-09-11
 * Time: 20:17
 * ProjectName:  itsource.cn.ximcloud.itsource.java8_feature.语法糖
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 * YOU ARE NOT EXPECTED TO UNDERSTAND THIS CODE.
 */
public class 还有一颗语法糖 {

    @Test
    public void test() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void test_String() {
        String s = "1" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + "2" + "2";
        s = s + "5";
        s = s + "3";
        System.out.println(s);

    }
}
