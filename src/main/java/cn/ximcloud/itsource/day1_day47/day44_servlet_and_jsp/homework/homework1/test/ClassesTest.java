package cn.ximcloud.itsource.day1_day47.day44_servlet_and_jsp.homework.homework1.test;

import cn.ximcloud.itsource.day1_day47.day44_servlet_and_jsp.homework.homework1.domain.User;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-11
 * Time: 22:17
 * ProjectName: itsource.cn.ximcloud.itsource.day1_day47.day44_servlet_and_jsp.homework.homework1.test
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

public class ClassesTest {
    /**
     * 测试字段
     * private java.lang.Integer cn.ximcloud.itsource.day1_day47.day44_servlet_and_jsp.homework.homework1.domain.User.id
     * private java.lang.String cn.ximcloud.itsource.day1_day47.day44_servlet_and_jsp.homework.homework1.domain.User.username
     * private java.lang.String cn.ximcloud.itsource.day1_day47.day44_servlet_and_jsp.homework.homework1.domain.User.password
     */
    @Test
    public void testFields() {
        Field[] fields = new User().getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + field.getType());
        }
    }

    /**
     *
     */
    @Test
    public void testClass() {
        String simpleName = String.class.getSimpleName();
        System.out.println(simpleName);
    }

    /**
     * 测试方法
     */
    @Test
    public void testMethod() {
        Method[] declaredMethods = new User().getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    @Test
    public void testAnyWay() {
        String[] strings = {"123123", "1231231", "1231231", "123123", "12312312",};
        String string = Arrays.toString(strings);
        System.out.println(string.substring(1, string.length() - 1));
    }
}
