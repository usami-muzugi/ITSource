package cn.ximcloud.itsource.day23.zixi.attention;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 10:15
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class StaticTest {
    static {        //静态代码块是类级别的只能初始化类类级别的字段，且在该类被加载的时候只且只加载一次
        anStaticInt = 3;
    }

    {       //构造代码块是对象级别的在使用new关键字创建对象的时候，会最先调用构造代码块，
        anStaticInt = 1;
        anInt = 1;
    }

    StaticTest() {  //同理，构造方法能够对静态字段和非静态字段进行操作
        anInt = 5;
        anStaticInt = 1;
    }
    private static int anStaticInt;
    private int anInt;
    private String string;
}

