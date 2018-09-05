package cn.ximcloud.itsource.算法学习._03归并排序;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-05
 * Time: 17:44
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
public class MergeSort {
    /**
     * 提供给公共访问的方法
     *
     * @param arr 需要被排序的数组
     */
    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }


    /**
     * 真正的归并算法实现
     *
     * @param arr    需要被排序的数组
     * @param index  起始索引
     * @param offset 结束索引
     */
    private static void sort(Comparable[] arr, int index, int offset) {
//        1.如果起始索引等于结束索引就代表这个数组已经是不能再分割的了，也就是说这个数组只有一个元素(伪)
        if (index >= offset) {
//        2.如果相等，就结束方法
            return;
        }
//        3.如果不相等，就表示这个数组(伪)最少有两个或已上的元素个数，就能够进行递归操作
//        4.这里首先获得它的中间索引
        int midIndex = (offset + index) / 2;
//        5.再进行左数组sort()
        sort(arr, index, midIndex);
//        6.再对右数组进行排序
        sort(arr, midIndex + 1, offset);

//        这里有个逻辑就是arr这个数组必须都要带上的，不然之后的方法递归就没有设置参数然后就是index和offset是在每次递归调用
//        会改变的，这个比较好理解。反正就是arr是要带上的
//        如果offset是1的话就表示，这个数组(伪)只有两个元素了，
//        然后进行判断，index == offset肯定是不相等了，所以执行下一部操作，也就是给midIndex 赋值，这里就是0
//        然后是调用左递归方法sort(arr,0,0); 最终执行sort()方法之后是直接返回
//        然后是调用右递归方法sort(arr,1,1); 最终执行sort()方法之后是直接返回
//        然后是调用这个merge()方法
        merge(arr, index, midIndex, offset);

    }


    /**
     * 这个方法就是重头戏了，arr是每次递归方法完成之后进行操作的数组，index表示这个起始位置，然后midIndex表示中间位置，offset表示末尾位置
     * 意思就是，sort()方法执行之后，对左数组(伪)[index,midIndex]  和右数组(伪)[minIndex,offset] 进行归并操作
     *
     * @param arr      还是这个数组
     * @param index    左数组的起始索引
     * @param midIndex 左数组的结束索引
     * @param offset   右数组的结束索引
     */
    private static void merge(Comparable[] arr, int index, int midIndex, int offset) {
//        定义一个新的数组出来
        Comparable[] comparables = Arrays.copyOf(arr, offset + 1);

//        长度取出来
        int length = comparables.length;
//        这里就要定义并初始化两个数组的索引位置了
        int i = index, j = midIndex + 1;
//        然后是真正的操作，进行归并了
        for (int k = i; k < length; k++) {
            // 如果左半部分元素已经全部处理完毕
            if (i > midIndex) {
                arr[k] = comparables[j - index];
                j++;
            }// 如果右半部分元素已经全部处理完毕
            else if (j > offset) {
                arr[k] = comparables[i - index];
                i++;
            }// 左半部分所指元素 < 右半部分所指元素
            else if (comparables[i - index].compareTo(comparables[j - index]) < 0) {
                arr[k] = comparables[i - index];
                i++;
            }// 左半部分所指元素 >= 右半部分所指元素
            else {
                arr[k] = comparables[j - index];
                j++;
            }
        }
    }

}
