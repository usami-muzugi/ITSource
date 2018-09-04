package cn.ximcloud.itsource.算法学习._01选择排序法;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-04
 * Time: 20:56
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
 * <p>
 * 选择排序 <泛型>
 **/
public class selectionSort_泛型 {
    /**
     * 选择排序
     * 思路:
     * 1.确定这个数组的长度。
     * 2.使用for循环进行循环遍历，找出最小的值，然后将其和i进行交换
     */
    <T extends Comparable<T>> void selectionSort(T[] arr) {
        //获取数组的长度
        int length = arr.length;

        //外层for循环控制将要循环的次数
        for (int i = 0; i < length; i++) {
//            拿索引，拿索引！！！！
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
//            for循环结束，将会拿到这次遍历得到的最小值的索引！！
//            进行交换
            if (i != minIndex) {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }


    @Test
    public void testSelectSort() {
        Integer[] ints = {9, 8, 7, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 1, 1, 12, 6, 5, 4, 3, 2, 1};
        selectionSort(ints);
        Stream.of(ints).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(ints.length);
        System.out.println(Stream.of(ints).count());
    }
}
