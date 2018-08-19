package cn.ximcloud.itsource.java8_feature.lambda.lambda1;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 16:20
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda.lambda1
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

public class LambdaTest {
    @Test
    public void testLambdaPublic() {
        MyInterface my = new MyInterface() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
        my.print("卢酱为什么呀？");
    }

    @Test
    public void testLambda1() {
        MyInterface my = (String s) -> System.out.println(s);
        my.print("卢酱为什么呀？");
    }

    @Test
    public void testLambda2() {
        MyInterface my = (s) -> System.out.println(s);
        my.print("卢酱为什么呀？");
    }

    @Test
    public void testLambda3() {
        MyInterface my = s -> System.out.println(s);
        my.print("卢酱为什么呀？");
    }

    @Test
    public void testLambda4() {
        MyInterface my = System.out::println;
        my.print("卢酱为什么呀？");
    }
}
