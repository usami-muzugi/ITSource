package cn.ximcloud.itsource.day32.junit4;

import org.junit.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-23
 * Time: 18:03
 * ProjectName: ITSource.cn.ximcloud.itsource.day32.junit4
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

public class AllInOneTest {


    /**
     * testBeforeClass
     * testBefore
     * test1
     * testAfter
     * testBefore
     * test2
     * testAfter
     * testAfterClass
     */
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @BeforeClass
    public static void a() {
        System.out.println("testBeforeClass");
    }

    @Before
    public void b() {
        System.out.println("testBefore");
    }

    @AfterClass
    public static void c() {
        System.out.println("testAfterClass");
    }

    @After
    public void d() {
        System.out.println("testAfter");
    }
}
