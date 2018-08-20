package cn.ximcloud.itsource.java8_feature.init;

import cn.ximcloud.itsource.java8_feature.init.SubClass;
import cn.ximcloud.itsource.java8_feature.init.SuperClass;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-20
 * Time: 15:35
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
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

public class InitTest {
    /**
     * result:
     * SuperClass init
     * 123
     * 结果是仅仅是父类的类被加载了，子类并没有被加载，被动引用
     * <p>
     * 因此，通过子类来引用父类的静态字段的时候，只会触发父类的初始化而不会触发子类的初始化
     * 至于是否要触发子类的加载和验证，在虚拟机会犯中并未明确规定，这点取决于虚拟机的具体实现。
     */
    @Test
    public void testInit1() {
        System.out.println(SubClass.value);
        SubClass.print();
    }

    /**
     * 被动使用类字段演示二
     * 通过数组定义来引用类，不会触发此类的初始化
     */
    @Test
    public void testInit2() {
        SuperClass[] superClasses = new SuperClass[10];
    }

    /**
     *
     */
    @Test
    public void testInit3() {
        System.out.println(ConstClass.HELLOWORD);
        ConstClass.method();
    }
}
