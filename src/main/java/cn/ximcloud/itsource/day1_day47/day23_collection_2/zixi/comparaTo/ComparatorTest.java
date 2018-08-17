package cn.ximcloud.itsource.day1_day47.day23_collection_2.zixi.comparaTo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-10
 * Time: 09:26
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 测试Comparator为什么比较大小的时间复杂度是O(n)
 **/

public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>(new Studentimpl());
        treeSet.add(new Student("usamimizugi", 22));
        treeSet.add(new Student("ourinsama", 23));
        treeSet.add(new Student("jestom", 24));
        treeSet.add(new Student("time", 26));
        treeSet.add(new Student("lu", 27));
        System.out.println(treeSet);

    }
}

class Studentimpl implements Comparator {

    //同时测试了HashSet判断两个对象是否相等，是按着equals和Hash共同是否相等
    //TreeSet判断两个对象是否相等，是按着比较器或者是自然排序比较的是否为0来判断的
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("比较了");
        Student student1 = (Student) o1, student2 = (Student) o2;
        if (student1.getAge() > student2.getAge()) {
            return -1;
        } else if (student1.getAge() < student2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Student() {
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("比较了");
        Student student = (Student) o;
        if (this.getAge() > student.getAge()) {
            return -1;
        } else if (this.getAge() < student.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
