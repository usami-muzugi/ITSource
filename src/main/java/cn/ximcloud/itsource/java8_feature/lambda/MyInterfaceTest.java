package cn.ximcloud.itsource.java8_feature.lambda;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 15:40
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda
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

public class MyInterfaceTest {
    //    常规方式
    @Test
    public void testSum() {
        MyInterface my = new MyInterfaceImpl();
        System.out.println(my.sum(123, 666));
    }

    //    匿名对象的方式
    @Test
    public void noNameSun() {
//        接口是不能直接new 的
//        但是可以这样补全为实现，抽象的方法
//        new MyInterface()
        MyInterface my = new MyInterface() {
            @Override
            public int sum(int x, int y) {
                return x + y;
            }
        };
    }

    //    使用lambda表达式λ的方法,常规写法!
    @Test
    public void testLambdaSum() {
        MyInterface my = (int x, int y) -> {
            return x + y;
        };
        System.out.println(my.sum(1, 2));
    }

    /**
     * lambda表达式的简写
     * 1.形参列表中的数据类型可以不写，会自动类型推断，
     * 2.如果方法体中的代码只有一句，可以省略掉{}
     * 如果是return返回数据的，可可以省略掉return
     */
    @Test
    public void testLambdaSum2() {
        MyInterface my = (x, y) -> x + y;
        System.out.println(my.sum(123, 555));
    }
}
