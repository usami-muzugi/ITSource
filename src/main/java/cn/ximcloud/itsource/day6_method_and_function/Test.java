package cn.ximcloud.itsource.day6_method_and_function;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-14
 * Time: 17:52
 * ProjectName: ITSource
 * To change this template use FileDemo | Settings | Editor | FileDemo and Code Templates.
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {
    public static void main(String[] args) {
        //stop talk show me your code.
        //打星星
        for (int i = 1; i <= 5; i++) {    //外层循环决定了大星星5层
            for (int j = 1; j <= i; j++) {    //内部随着层数的增加，星星数也一同增加
                System.out.print("* ");    //打印一个星星
            }
            System.out.println();        //当内部循环执行完一次之后，换行一次，形成层结构
        }
        System.out.println("----------");        //华丽的分割线

        //反向打星星
        for (int i = 1; i <= 5; i++) {        //外层循环决定了大星星5层
            for (int j = 0; j <= 5 - i; j++) {    //内部随着层数的增加，星星数从5层开始随着外层变量i的增加而减少
                System.out.print("* ");    //打印一个星星
            }
            System.out.println();        //当内部循环执行完一次之后，换行一次，形成层结构
        }

        //三角形
        System.out.println("----------");

        int length = 10;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        //倒三角
        System.out.println("----------");

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < length - i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }


        /*
        *
* *
* * *
* * * *
* * * * *
----------
* * * * *
* * * *
* * *
* *
*
----------
           *
          * *
         * * *
        * * * *
       * * * * *
      * * * * * *
     * * * * * * *
    * * * * * * * *
   * * * * * * * * *
  * * * * * * * * * *
----------
  * * * * * * * * * *
   * * * * * * * * *
    * * * * * * * *
     * * * * * * *
      * * * * * *
       * * * * *
        * * * *
         * * *
          * *
           *

         */

        Integer integer = Integer.valueOf(123);
        Integer integer1 = Integer.valueOf(123);
        System.out.println(integer == integer); //true
        Integer integer2 = 123;
        Integer integer3 = 123;
        System.out.println(integer3 == integer2);   //true
        Integer integer4 = new Integer(123);
        Integer integer5 = new Integer(123);
        System.out.println(integer4 == integer5);   //true
        System.err.println(123);
        String[] strings = {};
        System.out.println(strings);
    }
}
