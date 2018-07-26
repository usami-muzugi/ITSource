package cn.ximcloud.itsource.day23_collection_2.homework;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-09
 * Time: 23:35
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
 * <p>
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
 * 2.	Int[][] arr = {{1,2,3},{4,5,6,7}};请循环遍历数组中所有的元素
 **/
public class HomeWork4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};

        //方法1使用for
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuffer.append("{");
            for (int j = 0; j < arr[i].length; j++) {
                stringBuffer.append(arr[i][j] + ",");
            }
            stringBuffer.append("}");
        }
        stringBuffer.append("]");
        System.out.println(stringBuffer);

        //方法2使用foreach
        stringBuffer = new StringBuffer("[");
        for (int[] ints : arr) {
            stringBuffer.append("{");
            for (int anInt : ints) {
                stringBuffer.append(anInt + ",");
            }
            stringBuffer.append("}");
        }
        stringBuffer.append("]");
        System.out.println(stringBuffer);

        //方法3，使用API
        for (int[] ints : arr) {
            System.out.print(Arrays.toString(ints) + "\t");
        }
        System.out.println(Arrays.toString(arr));
    }


}
