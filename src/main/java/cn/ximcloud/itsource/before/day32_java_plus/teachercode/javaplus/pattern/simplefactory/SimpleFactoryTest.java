package cn.ximcloud.itsource.before.day32_java_plus.teachercode.javaplus.pattern.simplefactory;

import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void testGetPhone() {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getPhone("mi"));
    }

}
