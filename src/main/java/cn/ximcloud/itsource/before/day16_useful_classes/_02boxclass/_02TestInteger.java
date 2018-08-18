package cn.ximcloud.itsource.before.day16_useful_classes._02boxclass;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-06-30
 * Time: 11:08
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

public class _02TestInteger {
    /*
        包装类的学习
            通过包装类Integer类来学习
            Integer概念:
     */
    public static void main(String[] args) {
        //构造方法
        Integer i = new Integer(10);    //构造方法没有不带参数列表的
        Integer integer = new Integer("10");    //构造方法2 传入字符串
        System.out.println(integer);
        Integer integer1 = new Integer("10");    //构造方法2 传入字符串
        System.out.println(integer1);

        //最大最小值
        System.out.println(i);  //Integer肯定覆写toString()
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);

        //Integer integer2 = new Integer("A");
        //排错

        //包装类的自动装箱和拆箱
        int i1 = integer1;


        int test1 = 20;
        Integer test2 = Integer.valueOf(20);
        System.out.println("test1 == test ? " + (test1 == test2));//自动拆箱

        int test3 = test1 + test2;
        Integer test4 = test3 + test2;
        System.out.println(test4);
        //Long var = new Integer(1);  //Long和Integer 不是父子类关系，
        Long var = Long.valueOf(Integer.valueOf(1));



        /*
            boolean、byte、char ≤127
            -128≤shor、integet≤127


    private static class ByteCache {
        private ByteCache(){}

        static final Byte cache[] = new Byte[-(-128) + 127 + 1];

        static {
            for(int i = 0; i < cache.length; i++)
                cache[i] = new Byte((byte)(i - 128));
        }
    }


    private static class CharacterCache {
        private CharacterCache(){}

        static final Character cache[] = new Character[127 + 1];

        static {
            for (int i = 0; i < cache.length; i++)
                cache[i] = new Character((char)i);
        }
    }


    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }

            float、double没有


         */
    }
}
