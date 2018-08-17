package cn.ximcloud.itsource.day1_day47.day30_test.zixi;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-21
 * Time: 16:43
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day30_test.zixi
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

public class Test3 {
    private static Test3 test3 = new Test3();

    static {
        System.out.println("123123");
        test3 = null;
    }

    public Test3() {
        System.out.println("11131231");
    }

    public static void main(String[] args) {
        new Test3();
        //System.out.println(0 / 0);
        System.out.println(0.0 / 0.0);
    }
}
