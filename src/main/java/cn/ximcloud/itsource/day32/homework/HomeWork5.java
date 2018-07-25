package cn.ximcloud.itsource.day32.homework;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-24
 * Time: 18:43
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
public class HomeWork5 {
    //装饰者模式

    @Test
    public void test() {
        B b = new B("彭瑞",22);
        b.say();

        A a = new A(new B("彭瑞",22));
        a.say();

    }
}

class A extends B {
    private B b;

    private A() {
        super(null, 0);
    }

    public A(B b) {
        super(b.getName(), b.getAge());
    }

    @Override
    public void say() {
        System.out.println(getName() + ": " + getAge() + ":" + "我的吃相好看多了");
    }
}

class B {
    private String name;
    private int age;

    public B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(name + ": " + age + ":" + "我的吃相很难看");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
