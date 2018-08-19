package cn.ximcloud.itsource.java8_feature.lambda.lambda3;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-08-19
 * Time: 16:32
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.lambda.lambda3
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

public class MyInterfaceTest {
    public static void main(String[] args) {
//        局部变量,在老版本中必须加上final
        final int age = 9;
//        匿名内部类可以访问到外部方法的局部变量
        MyInterface my = new MyInterface() {
            @Override
            public void test() {
//                这里的age是不能在匿名内部类中被修改的,并且，在外部也是不能被修改的，
//                被修改就会报错
                System.out.println(age);
//                System.out.println(age++);
            }
        };
        my.test();

        MyInterface my2 = () -> System.out.println(age);
//        age = 10;
        my2.test();
    }

}
