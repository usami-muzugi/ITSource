package cn.ximcloud.itsource.before.day33_reflect._99teachercode.javaseplus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

enum A {
    HAHA
}

public class Test2 {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        System.out.println(list.getClass());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        synchronized (Test2.class) {

        }

        Class class1 = String.class;
        Method[] methods = class1.getMethods();


        Class class2 = int.class;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

