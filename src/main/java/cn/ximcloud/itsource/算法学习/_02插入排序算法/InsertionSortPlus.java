package cn.ximcloud.itsource.算法学习._02插入排序算法;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-09-05
 * Time: 13:32
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
public class InsertionSortPlus {

    public static void insertSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
//            存储这个需要被排序的元素的值
            int tempVar = arr[i];
//            存储这个需要被排序的元素的索引(在外面能取到这个j)
            int j;
            for (j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
//                  做的操作就仅仅是把前一个元素往后面移动而已了，不再是之前的需要进行三次赋值操作
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
//            排序进行到这里，该被排序的元素的正确的位置已经找到了，但是没有值
//            这里进行一次赋值操作，完成当前列排序
            arr[j] = tempVar;
        }
    }

    private static void swap(int[] arr, int indexA, int indexB) {
        int tempVar = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tempVar;
    }
}
