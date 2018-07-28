package cn.ximcloud.itsource.day16_useful_classes._03systemclass;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-30
 * Time: 14:13
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

public class _01TestSystem {
    public static void main(String[] args) {








        /*
         * @param      src      the source array.
         * @param      srcPos   starting position in the source array.
         * @param      dest     the destination array.
         * @param      destPos  starting position in the destination data.
         * @param      length   the number of array elements to be copied.
         * @exception  IndexOutOfBoundsException  if copying would cause
         *               access of data outside array bounds.
         * @exception  ArrayStoreException  if an element in the <code>src</code>
         *               array could not be stored into the <code>dest</code> array
         *               because of HashSetTest type mismatch.
         * @exception  NullPointerException if either <code>src</code> or
         *               <code>dest</code> is <code>null</code>.

        public static native void arraycopy(Object src,  int  srcPos,
        Object dest, int destPos,
        int length);

         */
        Integer[] integers = new Integer[10];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = i + 1;
        }

        System.out.println(Arrays.toString(integers));
        Integer[] integers1 = new Integer[20];
//        for (int i = 0; i < integers1.length; i++) {
//            integers1[i] = i + 1;
//        }
        System.out.println(Arrays.toString(integers1));
        System.arraycopy(integers, 0, integers1, 10, 10);
        /*
            源数组 integers
            源数组起始位置
            目标数组
            目标数组起始位置
            复制长度
         */
        System.out.println(Arrays.toString(integers1));
//        for (;;) {
//            System.out.println(System.nanoTime());
        System.gc();
//        }

        /*
    public static void gc() {
        Runtime.getRuntime().gc();
    }
         */
        Map map = System.getenv();
        System.out.println(map);

        //在 UNIX 系统中，name 的字母大小写通常很重要，而在 Microsoft Windows 系统中，
        // 这通常不重要。例如，表达式 System.getenv("FOO").equals(System.getenv("foo")) 在 Microsoft Windows 中可能为真。
        System.out.println(System.getenv("USERDOMAIN_ROAMINGPROFILE").equals(System.getenv("u   SERDOMAIN_ROAMINGPROFILE")));

    }
}
