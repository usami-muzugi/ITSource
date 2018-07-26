package cn.ximcloud.itsource.day16_useful_classes._02boxclass;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-30
 * Time: 10:47
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

public class _02BoxIntegerDemo {
    /*
     *  包装类
     *      JAVA中为每一个*基本数据类型*的 类型，提供了一个对应的包装类
     *      int Integer
     *      int 10;表示了一个整数10
     *      Integer的一个对象，本质意义也是一样的。
     *
     *      提供了包装类有什么好处
     *
     *          1.类中可以提供一些方法
     *          2.可以通过数据类型的转换   【可以将Integer转换为Float】
     *          3.常量字段:存储位数32，最大值，最小值
     *          4.JAVA是面向对象编程的，所以基本数据的对应的对象，可以有！
     *
     *
     *          Integer 举例i怎么体现包装的
     *      class Integer{
     *          private static int i;
     *
     *          Integer(int i){
     *              this.i = i;
     *          }
     *
     *          //各种方法
     *
     *      }
     *
     *      包装类的继承体系
     *
     *      java.lang.Object
     *      |
     *      |----java.lang.Number
     *              |
     *              |
     *              |----AtomicInteger,AtomicLLong,BigDecimal,BigInteger,Byte,Double,Float,Short,Boolean,Integer,Long,Character
     *
     */

}
