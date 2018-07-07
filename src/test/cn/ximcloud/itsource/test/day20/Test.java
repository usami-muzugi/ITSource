package cn.ximcloud.itsource.test.day20;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-05
 * Time: 13:38
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //验证一个类的的getclass()方法，和类名.class是否是Class的对象。
        //然后就是验证这两个得到的对象是否相同一个。
        System.out.println(Test.class == new Test().getClass());

//        synchronized (Sync1.class) {
//            Sync1.method1();
//        }
        Class testClass = Test.class;
        Test test = (Test) testClass.newInstance();
        test.method();




    }
    public static void method() {
        System.out.println("666");
    }
}
