package cn.ximcloud.itsource.before.day24_collections._02hashtree;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-11
 * Time: 17:03
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * 分析:HashMap  TreeMap 键怎么做到唯一的,不重复的
 * 结论:HashMap是通过hashCode的返回值和equals得到的结果来判断两个对象是否为同一个对象
 * TreeMap是通过实现了比较器的对象或者实现了比较方法的对象的Compara的返回的值来确定两个对象是否相同， 0.
 * <p>
 * Map集合下面的实现,键值唯一的,怎么做到的唯一
 * HashMap判断键唯一的方式与HashSet是一样
 * TreeMap判断键唯一的方式与TreeSet一样
 * <p>
 * 当我们使用Map集合,添加自定义了对象[元素],注意判断元素唯一,
 * HashMap需要:自定义元素的类,中,需要覆写hashCode equals
 * TreeMap需要:具有自然排序的能力,或者给指定定制比较器
 **/

public class HashTreeTest {
    private HashMap<Student, Integer> studentIntegerHashMap;
    private TreeMap<Student, Integer> studentIntegerTreeMap;

    @Before
    public void doBefore() {
        studentIntegerHashMap = new HashMap<>();
        //传入一个HComparetor的实现类对象
        studentIntegerTreeMap = new TreeMap<>(new StudentComparetorImpl());
        //或者是这里稳固下知识点匿名对象？貌似不行，这里是需要传入一个泛型...
        //studentIntegerTreeMap = new TreeMap<>();
    }

    @Test
    public void test() {
        //添加三个HashMap   HashMap<Student, Integer>
        studentIntegerHashMap.put(new Student("耀文", 30), 30);
        studentIntegerHashMap.put(new Student("川川", 22), 22);
        studentIntegerHashMap.put(new Student("usami", 21), 21);

        //添加三个TreeMap
        studentIntegerTreeMap.put(new Student("耀文", 30), 30);
        studentIntegerTreeMap.put(new Student("川川", 22), 22);
        studentIntegerTreeMap.put(new Student("usami", 21), 21);

        System.out.println(studentIntegerHashMap);
        System.out.println(studentIntegerTreeMap);

    }

}

class StudentComparetorImpl implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()) {
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return 1;
        } else return o1.getName().compareTo(o2.getName());
    }
}

class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        return name + "--" + age;
    }


    //同HashSet一样，判断是否为同一个对象的标准是equals的到的结果和hashCode的值是否同时一样
    //只有两者同时一样，HashSet和HashMap才会认定这两个对象是同一个对象，才能添加
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Student o) {
        //同HashSet一样，如果不适用比较器，TreeMap会看这个传入的对象是否实现了Comparable如果没有就会报类型不匹配错误
        //但是实现了比较接口后，如果TreeMap的构造方法没有传入比较器的话，就会自动调用传入的对象的比较方法进行比较
        //如果得到的结果是0，就判断两个对象相等，只会保存第一个添加的对象。不会把第二个对象添加进去
        return 0;
    }
}