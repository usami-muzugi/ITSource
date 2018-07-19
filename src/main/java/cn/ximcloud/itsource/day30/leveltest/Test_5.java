package cn.ximcloud.itsource.day30.leveltest;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-19
 * Time: 14:27
 * ProjectName: ITSource.cn.ximcloud.itsource.day30.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 5.	写出至少两种不同方式的单例模式的类，并说说他们的区别单利模式的意义
 **/

public class Test_5 {

    @Test
    public void solution() {
        SingleInstanceDemoOne instance1_1 = SingleInstanceDemoOne.getInstance();
        SingleInstanceDemoOne instance1_2 = SingleInstanceDemoOne.getInstance();
        SingleInstanceDemoOne instance1_3 = SingleInstanceDemoOne.getInstance();
        System.out.println(instance1_1 == instance1_2);
        System.out.println(instance1_1 == instance1_3);
        SingleInstanceDemoTwo instance2_1 = SingleInstanceDemoTwo.getInstance();
        SingleInstanceDemoTwo instance2_2 = SingleInstanceDemoTwo.getInstance();
        SingleInstanceDemoTwo instance2_3 = SingleInstanceDemoTwo.getInstance();
        System.out.println(instance2_1 == instance2_2);
        System.out.println(instance2_1 == instance2_3);

    }
}

class SingleInstanceDemoOne {
    private static final SingleInstanceDemoOne sido = new SingleInstanceDemoOne();

    private SingleInstanceDemoOne() {
    }

    public static SingleInstanceDemoOne getInstance() {
        return sido;
    }


}

class SingleInstanceDemoTwo {
    private static SingleInstanceDemoTwo sidw;

    private SingleInstanceDemoTwo() {
    }

    public static synchronized SingleInstanceDemoTwo getInstance() {    //线程安全
        if (sidw == null)
            return sidw = new SingleInstanceDemoTwo();
        return sidw;
    }
}
