package cn.ximcloud.itsource.day1_day47.day16_useful_classes._06stringclass;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 10:26
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

public class _04StringAllTest {

    /*
     * StringBuilder构造方法
     *
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();// 创建了一个无参的stringBuilder对象
        /*
            public StringBuilder() {
                super(16);
            }
         */
        StringBuilder stringBuilder1 = new StringBuilder(50);

        /*
            public StringBuilder(String str) {
                super(str.length() + 16);
                append(str);
            }
         */
        StringBuilder stringBuilder2 = new StringBuilder("6666");
        StringBuilder stringBuilder3 = new StringBuilder(stringBuilder2);
    }
}
