package cn.ximcloud.itsource.day32.sigletom;

public class StringUtil {

    // 2 提供一个私有的自身类型的静态的变量;
    private static StringUtil instance;

    /*
     * 单例模式: 懒汉式 1 构造器私有化 2 提供一个私有的自身类型的静态的变量; 3 提供一个public
     * static的getInstance()方法返回该类的对象; 4 工具方法
     *
     * 饿汉式 1 构造器私有化 2 直接创建一个私有的类的对象作为静态成员变量; 3 提供一个public
     * static的getInstance()方法返回该类的对象; 4 工具方法
     *
     *
     */
    // 1 构造器私有化
    private StringUtil() {
    }

    // 3 提供一个public static的getInstance()方法返回该类的对象;
    public static StringUtil getInstance() {
        // 双重验证:外面的条件是为了减少同步的次数,里面的条件才是为了解决某种问题
        if (instance == null) {
            synchronized (StringUtil.class) {
                if (instance == null) {
                    instance = new StringUtil();
                }
            }
        }
        return instance;
    }
}
