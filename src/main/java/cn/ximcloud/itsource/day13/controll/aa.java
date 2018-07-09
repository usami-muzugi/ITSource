package cn.ximcloud.itsource.day13.controll;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-25
 * Time: 11:44
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class aa {
    /*
        java中的接口:一个跟类很相似的结构
        语法：
            interface 接口名{
            }

        1.一般也是写在一个独立的.java原文件中,编译会生成独立的字节码文件
        2.接口里面有什么东西[ 比较着类的结构认识 ]
            HashSetTest)可以有字段：默认public static final 修饰的全局常量
            b)方法全部都是抽象方法【没有 static final修饰 因为修饰的不能覆写，抽象方法需要覆写才有意义 】
            c)构造方法没有
    ----------------------------------
        3.类实现接口
            语法:
                interface USB{}
                class UsbImpl implements USB{}//相当于继承:干爹
                    1.类允许同时实现多个接口:可以有多个干爹
                    2.类允许,实现接口的同时继承其他类:继承先于接口:亲爹还是比干爹亲
        4.从结构上来看，接口中有全局常量和抽象方法
            HashSetTest)全局常量  ： 接口名.常量名 直接调用
            b)抽象方法  ： 类实现接口覆写接口中的方法
    */
    public static void main(String[] args) {
        System.out.println(USB.name);//全局常量  ： 接口名.常量名 直接调用
        USB sb = new Usb();
        sb.code();

    }
}

interface USB {
    String name = "你好";//字段,  默认public static final 修饰的全局常量 所以必须初始化值

    //void code(){}//_10Interface.java:20: 错误: 接口抽象方法不能带有主体
    abstract void code();//抽象方法没有方法主体
    //void run();//抽象方法，可以不加abstract，在接口默认的
    //USB(){}//没有构造方法
}

class Usb implements USB {
    @Override
    public void code() {
        System.out.println("类实现接口覆写接口中的方法");
    }
}

interface B {
}

interface C {
}

class A implements C {//类实现接口，
}

class D implements B, C {//类可以实现多个接口
}

class H extends Object implements B, C {//类允许,实现接口的同时继承其他类。但是必须是继承在前，实际接口在后
}