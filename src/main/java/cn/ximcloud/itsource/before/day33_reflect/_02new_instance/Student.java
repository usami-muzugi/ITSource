package cn.ximcloud.itsource.before.day33_reflect._02new_instance;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-26
 * Time: 16:05
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day33_reflect.homework1
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Student {
    public String name;
    public int age;

    private Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    private Student(String name) {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
