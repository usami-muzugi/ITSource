package cn.ximcloud.itsource.day32.sigletom;

public class StringUtil1 {

    // 2 直接创建一个私有的类的对象作为静态成员变量;
    // volatile关键字 是为了解决多线程环境下主存跟工作内存之间数据不同步的问题
    private static volatile StringUtil1 instance = new StringUtil1();

    /*
     * 单例模式: 饿汉式 1 构造器私有化 2 直接创建一个私有的类的对象作为静态成员变量; 3 提供一个public
     * static的getInstance()方法返回该类的对象; 4 工具方法
     *
     *
     */
    // 1 构造器私有化
    private StringUtil1() {
    }

    // 提供一个public static的getInstance()方法返回该类的对象;
    public static StringUtil1 getInstance() {
        return instance;
    }

}
