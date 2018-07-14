package cn.ximcloud.itsource.day26._09method;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-14
 * Time: 16:21
 * ProjectName: ITSource.cn.ximcloud.itsource.day26._09method
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
 * <p>
 * 递归调用
 **/

public class MethodTest {

    public int methodTest(int n) {
        if (n == 1 || n == 2) return n;                           //如果n的值为0||1，直接返回结果n
        return methodTest(n - 1) + methodTest(n - 2); //如果n的值不为零，递归调用自身
    }

    @Test
    public void test() {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(methodTest(50));
    }

    @Test
    public void IntegerTest() {
        System.out.println(intTest(Byte.MAX_VALUE));
    }


    /**
     * 溢出不会报错
     *
     * @param n
     * @return
     */
    public byte intTest(byte n) {
        return (byte) (n * 3);
    }


}
