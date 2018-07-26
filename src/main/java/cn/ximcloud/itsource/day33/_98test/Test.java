package cn.ximcloud.itsource.day33._98test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-26
 * Time: 18:35
 * ProjectName: ITSource.cn.ximcloud.itsource.day33
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
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {
    @org.junit.Test
    public void test() {
        System.out.println("构造方法:");
        for (Constructor<?> constructor : A.class.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
        System.out.println("所有方法:");
        for (Method declaredMethod : A.class.getDeclaredMethods()) {
            System.out.println(declaredMethod);
        }
        System.out.println("所有字段");
        for (Field field : A.class.getDeclaredFields()) {
            System.out.println(field);
        }
        System.out.println("所有类:");
        for (Class<?> aClass : A.class.getClasses()) {
            System.out.println(aClass.getName());
        }
    }
}


class A {
    private String name;
    private int age;
    private Card card;



    class Card{
        private int id;
    }

    static class B{

    }


}
