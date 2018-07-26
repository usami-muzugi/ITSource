package cn.ximcloud.itsource.day16_useful_classes._06stringclass;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-06-30
 * Time: 15:43
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

public class _01StringDemo {
    public static void main(String[] args) {
        /*
            分析

            str --  123
            ssr --  666
            ---------------
            ssr --  123
            ssr --  666
            ---------------
            str --  123
            ssr --  666
         */


        String str = "123";
        String ssr = "666";
        ssr = str;
        ssr = "666";
        System.out.println(str);
        System.out.println(ssr);

        str = "123";
        ssr = "123";

        ssr = "1111";
        System.out.println(str);

        int[] arr = new int[10];
        Integer[] arsr = new Integer[10];

        System.out.println(arr);
        System.out.println(arsr);

        String[] strings = new String[20];
        System.out.println(strings);
        byte[] bytes = new byte[20];
        System.out.println(bytes);
        System.out.println(bytes.getClass().getName());
//        bytes.getClass().newInstance();

        _01StringDemo[] stringDemo = new _01StringDemo[20];
        System.out.println(stringDemo);
    }
}
