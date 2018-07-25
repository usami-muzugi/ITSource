package cn.ximcloud.itsource.day32.teachercode.javaplus.pattern.simplefactory;

import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void testGetPhone() {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getPhone("mi"));
    }

}
