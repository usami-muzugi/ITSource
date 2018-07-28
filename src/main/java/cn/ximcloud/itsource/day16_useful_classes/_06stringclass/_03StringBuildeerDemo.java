package cn.ximcloud.itsource.day16_useful_classes._06stringclass;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 10:11
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

public class _03StringBuildeerDemo {
    /*
     * CharSequence （字符序列）
     *  CharSequence
     *   |
     *   |----String
     *   |
     *   |----StringBuilder
     *   |
     *   |----StringBuffer
     *
     * */
    public static void main(String[] args) {
        test(100000);
        test2(100000);
        test3(100000);
    }

    static void test3(int sum) {
        long l = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < sum; i++) {
            stringBuffer.append(i);
        }
        System.out.println(stringBuffer);
        System.out.println(System.currentTimeMillis() - l);

    }

    static void test2(int sum) {
        long l = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sum; i++) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
        System.out.println(System.currentTimeMillis() - l);
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
