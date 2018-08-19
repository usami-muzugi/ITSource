package cn.ximcloud.itsource.java8_feature.interfacee.staticc;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 15:13
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.interfacee.staticc
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

//    实现类并没有提示要强制覆写接口的方法，因为接口中的方法是静态方法，并且是有方法主体的

//    @Override 加上@Override注解对其进行覆写判定，结果是子类是不能覆写接口的静态方法的。
//    但是子类是可以自己写一个和父接口的静态方法一样的方法
    static void method() {

//        调用接口的静态方法可以是
        MyInterface.method();
    }

    public static void main(String[] args) {
        MyInterfaceImpl.method();
    }

}
