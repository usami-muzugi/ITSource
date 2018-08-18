package cn.ximcloud.itsource.before.day4_how_to_change_each_other;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-13
 * Time: 01:37
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

public class TypeChangeTest {
    public static void main(String[] args) {
        //强制类型转换，需要在前面添加一个(),并且()里面填写上需要转换的类型
        //强制类型转换，* 可能存在 * 精度丢失
        //这段代码不会存在精度丢失，因为大类型的值在小类型的存储范围之内
        double d = 127D;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        System.out.println(b);

//        //这段代码会存在精度丢失，因为大类型的值在小类型的存储范围之内
//        double d = 0x66CCFF;
//        System.out.println(d);
//        float f = (float) d;
//        long l = (long) f;
//        int i = (int) l;
//        short s = (short) i;
//        byte b = (byte) s;
//        System.out.println(b);
    }

}
