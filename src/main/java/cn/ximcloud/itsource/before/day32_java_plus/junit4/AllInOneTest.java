package cn.ximcloud.itsource.before.day32_java_plus.junit4;

import org.junit.*;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-23
 * Time: 18:03
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day32_java_plus.junit4
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
//执行这个测试类就是执行了所有的加上注解的方法
public class AllInOneTest {

    //测试变量初始化
    private static String name;
    private int age;

    @BeforeClass
    public static void a() {
        //BeforeClass不能初始化非static变量
        name = "ourinsama"; //可以初始化static变量
        System.out.println("testBeforeClass");
    }

    @AfterClass
    public static void c() {
        System.out.println("testAfterClass");
    }

    /**
     * JUint测试方法执行流程
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
        test2();//加了@Test注解的方法也能调用加了注解的方法
    }

    @Test
    public void test2() {
        //@Test方法也能打印成员变量
        System.out.println(name);
        System.out.println(age);
        System.out.println("test2");
    }

    @Before
    public void b() {
        //@Before方法能初始化静态变量和非静态变量
        name = "usamimizugi";
        age = 22;
        System.out.println("testBefore");
    }

    @After
    public void d() {
        System.out.println("testAfter");
    }
}
