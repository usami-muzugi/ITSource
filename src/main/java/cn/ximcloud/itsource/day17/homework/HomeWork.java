package cn.ximcloud.itsource.day17.homework;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-03
 * Time: 08:46
 * ProjectName: ITSource
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
 * //         佛祖保佑        永无BUG       永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class HomeWork {

    /*
     * 1、异常的概念？
     * 2、列出到目前为止我们遇到过的所有异常，并对每一种举例说明，排错说明
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        /*
            代码正常运行不会出问题，但是遇到意外，参数变量，不符合要求，发生意外，代码终止运行。
         */

        //空指针异常 NullPointException extends RuntimeException，当一个指向为空的对象，被引用其成员变量或者执行其方法的时候，会抛出空指针异常
        String string = null;
        int length = string.length();
        System.out.println(length);

        //数组下标越界异常 ArrayIndexOutOfBoundsException extends RuntimeException,当调用一个数组索引位置以外的元素的时候，会抛出数组下标越界异常
        int[] arr = {};
        int arrVal = arr[1];
        System.out.println(arr);
        //数字格式化异常 NumberFormatException extends RuntimeException,当一串字符串不符合数字格式化的时候，会抛出 数字格式化异常
        int i = Integer.valueOf("313123q");


        //除数不能为0异常 ArithmeticException extends RuntimeException,当除数为零的时候，会抛出该异常
        System.out.println(1 / 0);


        //栈溢出异常 StackOverflowError extends RuntimeException，当栈内存耗尽时，抛出该异常
        //这个不是异常...是错误...罕见的Error哟
        main(null);

        //文件为找到异常 FileNotFoundException extends Exception，一个文件可能未被找到，编译时异常，需要捕获该异常或直接抛出，调用此方法的方法
        FileInputStream fileInputStream = new FileInputStream( new File(""));


    }
}


