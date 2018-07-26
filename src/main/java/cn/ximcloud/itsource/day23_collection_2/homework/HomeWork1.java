package cn.ximcloud.itsource.day23_collection_2.homework;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 19:13
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * 第一题：自定义一个学生类，然后创建一组学生对象，
 * 使用TreeSet来存放这些学生对象,实现先按学生的成绩,若成绩相等再按年龄排序。
 **/

public class HomeWork1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new StudentComparator());
        Student[] students = new Student[20];
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("No." + i, random.nextInt(30), random.nextInt(101));
            treeSet.add(students[i]);
        }
        System.out.println(treeSet);
    }
}


class StudentComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1, student2 = (Student) o2;
        if (student1.getSocre() > student2.getSocre()) {
            return -1;
        } else if (student1.getSocre() < student2.getSocre()) {
            return 1;
        } else {
            //score大小相等
            if (student1.getAge() > student1.getAge()) {
                return -1;
            } else if (student1.getAge() < student1.getAge()) {
                return 0;
            } else {
                return 1;
            }
        }
    }

}

class Student {
    private String name;
    private int age;
    private int socre;

    public Student() {
    }

    public Student(String name, int age, int socre) {
        this.name = name;
        this.age = age;
        this.socre = socre;
    }


    @Override
    public String toString() {
        return "\n姓名:" + name + "\t年龄:" + age + "\t成绩:" + socre;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;

        if (age != student.age) return false;
        if (socre != student.socre) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + socre;
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

    public int getSocre() {
        return socre;
    }

    public void setSocre(int socre) {
        this.socre = socre;
    }
}
