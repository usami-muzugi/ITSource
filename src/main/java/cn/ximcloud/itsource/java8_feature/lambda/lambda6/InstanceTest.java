package cn.ximcloud.itsource.java8_feature.lambda.lambda6;

import org.junit.Test;

import java.util.function.Function;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 17:35
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda.lambda6
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

public class InstanceTest {

    @Test
    public void testInsesnceMethod() {
        /**
         * 需求:
         *   已知String中有一个实例方法(非晶态的方法) ensWith()
         *   想自己写一个类，来封装上面的endWith()方法
         *
         *   借助于JAVA8 JDK提供的一个接口Function
         *
         *   @FunctionalInterface
         * public interface Function<T, R> {
         *
         *     /**
         *      * Applies this function to the given argument.
         *      *
         *      * @param t the function argument
         *      * @return the function result
         *
         *      R apply (T t);
         */

//        使用匿名内部类的方式
        Function fun = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String s) {
                return null;
            }
        };
    }

    @Test
    public void test1() {
        Function<String, Boolean> function = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String s) {
                return null;
            }
        };
    }

    @Test
    public void test2() {
        //        被判断的字符串对象
        String str = "hello itsource";
        Function<String, Boolean> function = new Function<String, Boolean>() {
            @Override
            public Boolean apply(String suffix) {
                return str.endsWith(suffix);
            }
        };
        Boolean apply = function.apply("123");
        System.out.println(apply);
//        这里差一个String对象！！是谁来比较呢？

    }


    /**
     * 使用Lambda表达式
     * 简写实例方法引入
     */
    @Test
    public void test3() {
        //        被判断的字符串对象
        String str = "hello itsource";
//        卧槽！
        Function<String, Boolean> function = str::endsWith;
        Boolean itsource = function.apply("itsource");
        System.out.println(itsource);
    }
}
