package cn.ximcloud.itsource.day25_collections_2._04;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 14:52
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 4 写一个单例模式，注意考虑线程安全问题
 * <p>
 * 饿汉
 **/

public class SingleInstanceDemo {
    private static final SingleInstanceDemo singleInstanceDemo = new SingleInstanceDemo();

    private SingleInstanceDemo() {
    }

    public synchronized static SingleInstanceDemo getInstance() {
        return singleInstanceDemo;
    }

    public static void main(String[] args) {
        System.out.println(SingleInstanceDemo.getInstance() == SingleInstanceDemo.getInstance());
    }

}
