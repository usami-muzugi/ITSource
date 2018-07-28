package cn.ximcloud.itsource.day33_reflect._99teachercode.constructor;

public class Student {
    private int age;
    private String name;


    public Student() {

    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
