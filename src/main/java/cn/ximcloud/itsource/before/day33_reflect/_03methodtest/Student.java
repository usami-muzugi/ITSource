package cn.ximcloud.itsource.before.day33_reflect._03methodtest;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-26
 * Time: 16:05
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day33_reflect.homework1
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Student {
    private Student() {

    }

    public Student(String name, int age) {

    }

    private static void say(String name) {
        System.out.println("这个有点意思啊！");
    }

    public void say() {
        System.out.println("我可是大神！");
    }

    private void say(String name, int age) {
        System.out.println("我可是大神呀！");
    }
}
