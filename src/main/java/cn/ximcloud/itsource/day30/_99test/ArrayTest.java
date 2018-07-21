package cn.ximcloud.itsource.day30._99test;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-21
 * Time: 10:15
 * ProjectName: ITSource.cn.ximcloud.itsource.day30._99test
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

public class ArrayTest {

    public void solution(int[] a, int[] b) {

    }


    /**
     * 对一个int[]类型的数组进行冒泡排序，并且去除重复的元素
     *
     * @param a 传入一个int[]类型的数组
     */
    public void babosolution(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    j = 0;
                } else if (a[j] == a[j + 1]) {
                    a[j + 1] = 0;
                }
            }
        }
    }

    @Test
    public void test() {
        int[] a = {1, 3, 3, 3, 21, 12, 2, 1, 1, 123, 1, 1, 1, 23, 11, 23, 1, 4, 5, 7, 7, 5, 1};
        babosolution(a);
        System.out.println(Arrays.toString(a));

    }


}
