package cn.ximcloud.itsource.java8_feature.interfacee.defaultt;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 15:18
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.interfacee.defaultt
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

public class MyInterfaceImpl implements MyInterface {
//    当然，接口中的default修饰的方法是有方法主体的，所以实现类并没有强制要求其实现类覆写接口中的方法
//    但是default和static修饰的方法是不同的，static修饰的方法子接口和实现类是无法对其进行覆写的
//    但是default修饰的方法子接口和其实现的类是可以对其进行覆写的

//    加上了@Override标签，没有报错，说明实现类是可以覆写其接口的default方法的
    @Override
    public void method() {
//        但是如何调用接口的方法呢
//        default修饰的方法也不是静态的，怎么调用呢？
        MyInterface.super.method();
//        答案是通过这样的形式对其进行调用,当然这个是在类的设计当中才能调用这个方法，在main方法内是不能这样
//        被调用的
        System.out.println("hello default method");
    }

    public static void main(String[] args) {
//        MyInterface.super.method();
    }
}
