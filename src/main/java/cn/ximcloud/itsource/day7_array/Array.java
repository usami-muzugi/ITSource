package cn.ximcloud.itsource.day7_array;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-15
 * Time: 16:06
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
 * //         佛祖保佑        永无BUG      永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class Array {
    public static void main(String[] args) {

        /*
        方法内的局部变量，需要先声明初始化后才能使用，
        成员变量则不必初始化，因为他有默认初始值
         */
        int i = 0;
        String string = null;
        int[] arr = {};
        System.out.println(arr);
        System.out.println(string);
        System.out.println(i);

        /*
        数组有多种初始化方式
         */

        int[] a = null;
        int[] b = null;//int 和 [] 不必在一起
        int[] array = {}; //初始化 1，数组长度为0
        int[] array1 = new int[100];  //初始化2 初始化必须int[]类必须定义数组的长度
        int[] array3 = new int[]{}; //初始化3  ,new int[] 可以省略掉，不省略掉的话int[]的括号内也不能带上声明的数组长度
        System.out.println(array3.length);  //初始化4，数组长度为0

        /*
        数组不能直接被打印输出，需要循环输出每一个值
         */

        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("------------");
        for (int index : a
        ) {
            System.out.print(index + " ");
        }

        /*
        将int转换成String类型的方法

         */

        Integer integer = 12; //自动装箱

        String integerString = integer.toString();  //装箱然后调用.toString() 方法
        integerString = integer + "";   //使用 + ""进行拼接也能转换为String类型
        String.valueOf(integer);    //使用 String类的静态方法.valueOf() 也能将int类型转换为String类型

        /*
        将String类型的值转换为int类型
         */

        //integer = Integer.valueOf(string);  //NumberFormatException 可能会遇到NumberFormatException异常，就是说String类型的数据不能被int类型格式话，也就是说不是存数字

        /*
        数组是引用类型的变量，
         */

        int[] fake = new int[10];
        Integer[] fakes = new Integer[10];
        System.out.println(fakes.length);   //数组内有.length变量
        System.out.println(new String("12312313").length());    //然后String类有.length()方法 两者不要混析了
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        int iq = 10;
        int[] sb = new int[iq];

        int[][] arras = new int[10][];
        System.out.println(arras[1]);
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
