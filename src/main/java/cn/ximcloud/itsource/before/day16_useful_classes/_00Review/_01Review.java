package cn.ximcloud.itsource.before.day16_useful_classes._00Review;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-30
 * Time: 10:13
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

public class _01Review {
    /*
        1.面向对象
        2.GUI编程（不常用，但是了解）

        Next:
        1.常用类（一天半）
        2.异常机制（Exception）

        Final:
        考试：查缺补漏

     */

    /*
        1.关于类：
            什么是一个类:
                1）类:抽象地描述一类事物，不具体的
                2）静态属性: 字段
                3）动态属性: 方法
                4）构造方法 没有返回值方法名()参数列表{}
                5）内部类
            对象:通过类调用构造方法创建出来的
                描述具体事物

            Java语言的设计思想:希望将现实生活中的对象与对象之间的关系在计算机中得以体现

        2.如何学习一个类:
             1）第一个得知道是哪个类
             2）一个类是用来描述什么的，概念! (类是用来干什么的)
             3）类的成员变量
                （1）JavaBean私有化字段，getSet方法，构造方法
                （2）public static final 修饰的字段全局变量，类名.字段名直接访问
             4）方法:普通方法和构造方法
                （1）普通方法:
                    1.方法是用来干什么的
                    2.方法的调用方式
                        方法签名（方法名 方法参数列表 方法返回值）
                        方法修饰 权限修饰，静态修饰
                    *返回值*没有返回值不一定方法就什么事儿都没干
                    * Array.sort() return void
                    * 参数传递，值传递，引用传递
                    * 值传递:值的本身
                    * 引用传递:地址值
                    *
                    * 参数类型:
                    *   类;对象
                    *   抽象类:子类
                    *   接口:实现类对象
                    *
                 （2）构造方法
                        * what
                        * 构造方法也是一个方法
                        * 创建对象new关键字调用构造方法
                        * how
                        * 可以创建对象的时候初始化值
                        *
                        * 构造方法怎么用
                        * 使用new关键字
                        * this
                        * super

             5）静态代码块 构造代码块
                *了解类的初始化的执行流程！*
                * 父类静态代码块-子类静态代码块-父类构造代码块-父类构造方法-子类构造代码块-子类构造方法-....
                *
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
