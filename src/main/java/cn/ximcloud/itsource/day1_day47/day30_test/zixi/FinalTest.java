package cn.ximcloud.itsource.day1_day47.day30_test.zixi;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-21
 * Time: 14:45
 * ProjectName: ITSource.cn.ximcloud.itsource.day1_day47.day30_test.zixi
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

public class FinalTest extends D {
    static {
        System.out.println("我是子类静态代码块，我在类被加载的时候执行，是第二个执行的。并且我也仅执行一次");
    }

    {
        System.out.println("我是子类构造代码块，我是在构造方法被调用的时候执行，是第五个执行的，我会随着对象实例化而每次执行");
    }

    public FinalTest() {
        super();

        System.out.println("我是子类构造方法，我是在构造代码块执行完毕之后执行的，是第六个执行的，我会睡着对象实例化而每次执行");
    }


    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        FinalTest finalTest1 = new FinalTest();
        FinalTest finalTest2 = new FinalTest();
        FinalTest finalTest3 = new FinalTest();
        FinalTest finalTest4 = new FinalTest();
    }
}

class D {
    static {
        System.out.println("我是父类静态代码块，我在类被加载的时候执行，是第一个执行的。并且我只会执行一次");
    }

    {
        System.out.println("我是父类构造代码块，我是在构造方法被调用的时候执行，也就是new关键字创建对象的时候执行，是第三个执行的，我会随着每次的对象创建而执行很多次");
    }

    //类中是不能出现功能执行语句的，但是初始化字段是可以的。

    public D() {

        System.out.println("我是父类构造方法，我是在执行完构造代码块之后被执行的，我是第四个执行的");
    }
}
