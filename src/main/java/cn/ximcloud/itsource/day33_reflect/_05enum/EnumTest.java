package cn.ximcloud.itsource.day33_reflect._05enum;

import java.lang.reflect.Constructor;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-26
 * Time: 19:02
 * ProjectName: ITSource.cn.ximcloud.itsource.day33_reflect._05enum
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class EnumTest {
    @org.junit.Test
    public void testEnum() {
        for (Constructor<?> declaredConstructor : Test.class.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }

    }

}

enum Test {
    haha
}
