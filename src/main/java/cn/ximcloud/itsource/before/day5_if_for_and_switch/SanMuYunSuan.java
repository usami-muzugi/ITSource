package cn.ximcloud.itsource.before.day5_if_for_and_switch;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-13
 * Time: 11:28
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

public class SanMuYunSuan {
    public static void main(String[] args) {
        System.out.println(1 == 1 ? "true" : "false");
        System.out.println(true ? 10 : 20);


        String string = false ? "String" : "string";
        int sum = false ? 10 : 10;

        int var1 = 10086;
        int var2 = 10000;
        System.out.println(var1 > var2 ? var1 : var2);

        System.out.println(var1 % 2 == 0 ? "true" : "false");

        int score = 100;
        String result = score == 100 ?
                "陈独秀同学请坐下" : score >= 90 ? "陈独秀" : score >= 80 ?
                "独秀" : score >= 70 ? "优秀" : score >= 60 ? "铁蛋" : score < 60 ?
                "李时珍的皮" : "";
        System.out.println(result);

        String response = score >= 60 ? (score >= 70 ? (score >= 80 ?
                (score >= 90 ? (score == 100 ? "陈独秀同学请坐下" : "陈独秀")
                        : "独秀") : "优秀") : "铁蛋") : "李时珍的皮";
        System.out.println(response);
    }


}
