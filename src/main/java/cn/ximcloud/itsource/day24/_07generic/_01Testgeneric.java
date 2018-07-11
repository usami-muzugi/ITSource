package cn.ximcloud.itsource.day24._07generic;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 15:39
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * 泛型 自定义泛型，自己写一个泛型的类
 **/

public class _01Testgeneric {

    @Test
    public void genericTest() {
        //JAVA1.7之后，如果签名已经写明<Character,Integer>,后面的可以不要
        Student<String, Integer> student = new Student</*String, Integer*/>("usami", 55);
        System.out.println(student);
    }

}


/**
 * 泛型 自定义类的写法
 *
 * @param <T> 指代的是学生的姓名
 * @param <E> 指代的是学生的年龄
 */
class Student<T, E> {
    private T name;
    private E age;


    public Student(T name, E age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }
}
