package cn.ximcloud.itsource.算法学习._02插入排序算法;

import cn.ximcloud.itsource.算法学习._01选择排序法.SelectionSort;
import cn.ximcloud.itsource.算法学习._01选择排序法.uitls.RandomArrayUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-05
 * Time: 15:38
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
public class InsertionSortTest {
    private int[] randomArrayUtil;

    @Before
    public void doBefore() {
        randomArrayUtil = RandomArrayUtil.getRandomArrayUtil(100000, 0, 1000000);
    }

    @Test
    public void insertSortPlus() {
        int[] randomArrayUtil = RandomArrayUtil.getRandomArrayUtil(1000000, 0, 1000000);
        InsertionSortPlus.insertSort(randomArrayUtil);
        IntStream.of(randomArrayUtil).forEach(x -> System.out.print(x + " "));
    }

    @Test
    public void insertSort() {
        InsertionSort.insertSort(randomArrayUtil);
        IntStream.of(randomArrayUtil).forEach(x -> System.out.print(x + " "));
    }

    @Test
    public void selectSort() {
        int[] randomArrayUtil = RandomArrayUtil.getRandomArrayUtil(100000, 0, 1000000);
        SelectionSort.selectionSort(randomArrayUtil);
        IntStream.of(randomArrayUtil).forEach(x -> System.out.print(x + " "));
    }
}