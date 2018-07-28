package cn.ximcloud.itsource.day34_anno_and_xml._98teacher_code._01cn.itsource.anno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 这是一个人类
 */
@SuppressWarnings({"unused", "rawtypes"})
@Deprecated
public class Person extends Animal {

    @Override
    void eat() {
        super.eat();
    }

    @Deprecated
    void t1() {
        @Deprecated
        int age;
        String name;
        age = 10;
    }

    void t2() {
        int age;
        String name;
        List list = new ArrayList();

        Date d = new Date();
        System.out.println(d.getDay());
        System.out.println(d.toString());

        t1();
    }

}
