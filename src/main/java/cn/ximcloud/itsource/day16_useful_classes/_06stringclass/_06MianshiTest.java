package cn.ximcloud.itsource.day16_useful_classes._06stringclass;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 11:28
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

public class _06MianshiTest {
    /*
栈		堆
a1		AAA
a2		BBB
a3		CoThread
a4		DDD
----方法内的局部变量------
a1		HHH		a1 = HHH,方法执行完毕，方法内局部变量销毁
a2		LLL		a2 = LLL,方法执行完毕，方法内局部变量销毁
a3		CCCQQQ		a3.append("QQQ") 操作的是对对象自身进行操作
a4		DDDZZZ		a4 = a4.append("ZZZ") return this。是对对象自身进行操作然后赋值
----------------------------
a1		AAA		外部局部变量变更？不存在的
a2		BBB		外部局部变量变更？不存在的
a3		CCCQQQ
a4		DDDZZZ
     */

    public static void main(String[] args) {

        String a = "123";
        String b = "123132";
        StringBuilder c = new StringBuilder("3123");
        StringBuilder d = new StringBuilder("3123121");

    }

    static void change(String a, String b, StringBuilder c, StringBuilder d) {
        a = "AAABBB";
        b = b.concat("CCCDDD");
        c.append("13123123");
        d = d.append("123123");
    }
}
