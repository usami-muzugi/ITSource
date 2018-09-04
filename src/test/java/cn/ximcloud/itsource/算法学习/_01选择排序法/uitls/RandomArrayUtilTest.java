package cn.ximcloud.itsource.算法学习._01选择排序法.uitls;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-04
 * Time: 22:31
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
 * //         佛祖保佑          永无BUG          永不修改             //
 * ////////////////////////////////////////////////////////////////////
 **/
public class RandomArrayUtilTest {

    @Test
    public void getRandomArrayUtil() {
            int[] randomArrayUtil = RandomArrayUtil.getRandomArrayUtil(100, 20, 50);
            IntStream.of(randomArrayUtil).forEach(x -> System.out.print(x + " "));
    }

    @Test
    public void testSort() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        RandomArrayUtil.testSort("Test--1", RandomArrayUtil.class, "getRandomArrayUtil", 100000, 0, 20);
    }
}