package cn.ximcloud.itsource.算法学习._01选择排序法.uitls;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-04
 * Time: 22:00
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
public class RandomArrayUtil {
    /**
     * 随机生成数组 [rangeS,rangeE]
     */
    public static int[] getRandomArrayUtil(int size, int rangeS, int rangeE) {
        Random random = new Random();
        return IntStream.of(new int[size]).map(x -> x = random.nextInt((rangeE - rangeS) + 1) + rangeS).toArray();
    }


    /**
     * 测试一个方法的执行时间
     *
     * @param testName   测试名
     * @param className     类名
     * @param methodName 方法名
     * @param pars       方法参数列表
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void testSort(String testName, String className, String methodName, Object... pars) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class<?> aClass = Class.forName(className);
        Arrays.stream(aClass.getDeclaredMethods()).map(x -> x.getName().equals(methodName) ? x : null)
                .findAny().ifPresentOrElse(x -> {
            x.setAccessible(true);
            long l = 0;
                l = System.currentTimeMillis();
            try {
                x.invoke(aClass.newInstance(), pars);
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                e.printStackTrace();
            }
            System.out.println(testName + ": used time -->" + (System.currentTimeMillis() - l));
        }, () -> System.out.println(testName + ": Error! method not found!"));
    }
}
