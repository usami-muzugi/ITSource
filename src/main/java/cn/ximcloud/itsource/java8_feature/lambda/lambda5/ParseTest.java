package cn.ximcloud.itsource.java8_feature.lambda.lambda5;

import org.junit.Test;

import java.util.function.IntConsumer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 17:00
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda.lambda5
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

public class ParseTest {
    /**
     * 使用匿名内部类的方式
     */
    @Test
    public void testParse() {
        ParseInterface parseInterface = new ParseInterface() {
            @Override
            public int parse(String string) {
                return Integer.parseInt(string);
            }
        };
        System.out.println(parseInterface.parse("666"));
    }

    /**
     * 使用Lambda表达式
     */
    @Test
    public void testParse2() {
        ParseInterface parseInterface = (String string) -> Integer.parseInt(string);
        System.out.println(parseInterface.parse("666"));
    }

    /**
     * 使用Lambda表达式
     */
    @Test
    public void testParse3() {
        ParseInterface parseInterface = string -> Integer.parseInt(string);
        System.out.println(parseInterface.parse("666"));
    }


    /**
     * 使用Lambda表达式
     * 简写，如果传入的值仅仅是这个被操作的值，就可以这么写
     */
    @Test
    public void testParse4() {
//        有点类是构造方法的引用
        ParseInterface parseInterface = Integer::parseInt;
        System.out.println(parseInterface.parse("666"));
    }
}
