package cn.ximcloud.itsource.day1_day47.day30_test._99test;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-19
 * Time: 10:52
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day30_test._99test
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
 **/

public class Test {
    public static void main(String[] args) {
        int i = 1;
        String s = "1";
        String[] strings = new String[2];

        test(i);
        test(s);
        test(strings);
        System.out.println(i);
        System.out.println(s);
        System.out.println(strings[1]);
        int i1 = s.indexOf('1');
        System.out.println(i1);
        s = "15680055190";
        s.matches("[1]");
    }

    public static void test(int i) {
        i = 2;
    }

    public static void test(String s) {
        s = "2";
    }

    public static void test(String[] strings) {
        strings[1] = "2";
    }
}
