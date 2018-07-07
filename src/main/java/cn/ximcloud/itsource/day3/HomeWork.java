package cn.ximcloud.itsource.day3;


/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-10
 * Time: 22:47
 * ProjectName: ITSource
 * To change this template use FileDemo | Settings | Editor | FileDemo and Code Templates.
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

public class HomeWork {
    public static void main(String[] args) {
        boolean var = true;
        System.out.println("var = " + var);
        System.out.println("another boolean =" + false);
        System.out.println("---------------");

        byte b = 127;
        System.out.println("b = " + b);
        System.out.println("another byte= " + 12);

        short s = 233;
        System.out.println("s = " + s);
        System.out.println("another short = " + 2333);
        System.out.println("---------------");

        int i = 23333;
        System.out.println("i = " + i);
        System.out.println("another int = " + 1222);
        System.out.println("---------------");
        long l = 2333333L;
        System.out.println("l = " + l);
        System.out.println("another long = " + 2333333L);
        System.out.println("---------------");

        //声明两个int类型的变量age1、age2
        int age1, age2;
        //将age1初始化，赋值为你自己的年龄
        age1 = 22;
        int myAge = age1;
        //将age2初始化，赋值为你基友(或蕾丝)的年龄
        age2 = 22;
        int gayFriendAge = 22;
        //计算输出你的年龄与他的年龄之和。
        System.out.println("us's age sum = " + (myAge + gayFriendAge));

        //声明String类型变量name和int类型变量age
        String name;
        int age;

        //让name表示 良辰，age表示45
        name = "良辰";
        age = 45;
        System.out.println(Long.MAX_VALUE);
        System.out.println(0x3e);

        System.out.println(Character.MAX_VALUE);

    }
}
