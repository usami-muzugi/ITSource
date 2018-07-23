package cn.ximcloud.itsource.day32.junit3;

import junit.framework.TestCase;
import org.junit.Assert;


/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-23
 * Time: 10:44
 * ProjectName: ITSource.cn.ximcloud.itsource.day32.junit3
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

public class JTest3Test extends TestCase {


    /*无参 非静态 无返回 三无*/
    public void testUpLoad() {
        //断言是结果是否正确
        Assert.assertEquals(true,JTest3.upLoad("D:/java/hello.java"));
    }


    /**
     * java.lang.AssertionError:
     * Expected :true
     * Actual   :false
     *  <Click to see difference>
     *
     *
     * 	at org.junit.Assert.fail(Assert.java:88)
     * 	at org.junit.Assert.failNotEquals(Assert.java:834)
     * 	at org.junit.Assert.assertEquals(Assert.java:118)
     * 	at org.junit.Assert.assertEquals(Assert.java:144)
     * 	at cn.ximcloud.itsource.day32.junit3.JTest3Test.testUpLoad(JTest3Test.java:41)
     * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
     * 	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
     * 	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
     * 	at java.base/java.lang.reflect.Method.invoke(Method.java:564)
     * 	at junit.framework.TestCase.runTest(TestCase.java:176)
     * 	at junit.framework.TestCase.runBare(TestCase.java:141)
     * 	at junit.framework.TestResult$1.protect(TestResult.java:122)
     * 	at junit.framework.TestResult.runProtected(TestResult.java:142)
     * 	at junit.framework.TestResult.run(TestResult.java:125)
     * 	at junit.framework.TestCase.run(TestCase.java:129)
     * 	at junit.framework.TestSuite.runTest(TestSuite.java:252)
     * 	at junit.framework.TestSuite.run(TestSuite.java:247)
     * 	at org.junit.internal.runners.JUnit38ClassRunner.run(JUnit38ClassRunner.java:86)
     * 	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
     * 	at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)
     * 	at com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)
     * 	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)
     *
     *
     * Process finished with exit code -1
     */

}