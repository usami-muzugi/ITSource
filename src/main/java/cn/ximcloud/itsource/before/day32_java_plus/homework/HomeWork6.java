package cn.ximcloud.itsource.before.day32_java_plus.homework;

import org.junit.Test;

interface Phone {

}

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-24
 * Time: 18:52
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 * 4种设计模式代码敲一遍(例子随便定义) 3
 **/
public class HomeWork6 {
    //简单公厂模式

    private Apple apple;
    private Mi mi;

    private HomeWork6() {

    }

    public static Phone getInstance(String s, String name) {
        if (s == null || s.length() == 0) return null;
        if (s.equals("apple")) {
            return new Apple(name);
        } else if (s.equals("mi")) {
            return new Mi(name);
        }
        return null;
    }

}

class PhoneTest {

    @Test
    public void test() {

        Phone instance = HomeWork6.getInstance("apple", "iphoneX");
        System.out.println(((Apple) (instance)).getName());

    }

}

class Apple implements Phone {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public Apple() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Mi implements Phone {
    private String name;

    public Mi(String name) {
        this.name = name;
    }

    public Mi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



