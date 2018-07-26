package cn.ximcloud.itsource.day25_collections_2._02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-12
 * Time: 14:28
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 2.学生有名字，年龄，成绩字段，把多个学生放进一个TreeSet集合; （请加上泛型来完成）
 * (1).实现先按学生的成绩升序排序,若成绩相等再按年龄升序排序,若年龄相等再按照名字升序排序，用自然排序实现
 * (2).实现先按学生的成绩逆序排序,若成绩相等再按年龄逆序排序,若年龄相等再按照名字逆序排序，用定制排序实现
 **/

public class JavaBean {
    public static void main(String[] args) {

        Student<String, Integer> stu1 = new Student<>("usami", 18, 18);
        Student<String, Integer> stu2 = new Student<>("mizugi", 17, 50);
        Student<String, Integer> stu3 = new Student<>("ourin", 18, 64);
        Student<String, Integer> stu4 = new Student<>("samacyann", 17, 64);
        Student<String, Integer> stu5 = new Student<>("time", 18, 88);


        TreeSet<Student<String, Integer>> studentTreeSet = new TreeSet();
        studentTreeSet.add(stu1);
        studentTreeSet.add(stu2);
        studentTreeSet.add(stu3);
        studentTreeSet.add(stu4);
        studentTreeSet.add(stu5);


        for (Student<String, Integer> stringIntegerStudent : studentTreeSet) {
            System.out.println(stringIntegerStudent);
        }


        System.out.println("-------------------------------------------------------");
        TreeSet<Student<String, Integer>> treeSet = new TreeSet<>(new StudentComparetorImpl());
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(stu5);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

class StudentComparetorImpl implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getSocre().intValue() > o2.getSocre().intValue()) {
            return -1;
        } else if (o1.getSocre().intValue() < o2.getSocre().intValue()) {
            return 1;
        } else {
            if (o1.getAge().intValue() > o2.getAge().intValue()) {
                return -1;
            } else if (o1.getAge().intValue() < o2.getAge().intValue()) {
                return 1;
            } else {
                return o2.getName().toString().compareTo(o1.getName().toString());
            }
        }
    }
}

class Student<T extends CharSequence, E extends Number> implements Comparable<Student> {
    private T name;
    private E age;
    private E socre;


    public Student(T name, E age, E socre) {
        this.name = name;
        this.age = age;
        this.socre = socre;
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

    public E getSocre() {
        return socre;
    }

    public void setSocre(E socre) {
        this.socre = socre;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                ", socre=" + socre +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getSocre().intValue() > o.getSocre().intValue()) {
            return 1;
        } else if (this.getSocre().intValue() < o.getSocre().intValue()) {
            return -1;
        } else {
            if (this.getAge().intValue() > o.getAge().intValue()) {
                return 1;
            } else if (this.getAge().intValue() < o.getAge().intValue()) {
                return -1;
            } else {
                return this.getName().toString().compareTo(o.getName().toString());
            }
        }
    }
}
