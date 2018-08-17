package cn.ximcloud.itsource.day1_day47.day23_collection_2._02treeset.v2_Comparator;

import java.util.TreeSet;

/**
 * public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>
 * , Cloneable, java.io.Serializable
 * <p>
 * TreeSet继承了AbstractSet 并实现了NavigableSet 和cloneable和Serializable
 * <p>
 * TreeSet特点:
 * 1.无序
 * 2.不重复
 * 3.可以存储任意类型任意个数
 * 4.当第一个元素存储进来之后，这个容器只能存取这个第一个元素的类型的数据
 * 5.线程不安全
 * 6.继承TreeMap实现的
 * 7.存入的元素必须具有排序能力，也就是实现Comparable 或者是 Comparator
 * <p>
 * 自然排序:implements Comparable
 * 客制化排序: implements Comparator    【定制器，需要放在TreeSet构造器中创建对象使用】
 * <p>
 * 当前为使用Comparator实现的定制器来实现排序
 */

public class TreeSetTest {
    public static void main(String[] args) {
        /** public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>
         * , Cloneable, java.io.Serializable
         *
         *  TreeSet继承了AbstractSet 并实现了NavigableSet 和cloneable和Serializable
         *
         *  TreeSet特点:
         *  1.无序
         *  2.不重复
         *  3.可以存储任意类型任意个数
         *  4.当第一个元素存储进来之后，这个容器只能存取这个第一个元素的类型的数据
         *  5.线程不安全
         *  6.继承TreeMap实现的
         *  7.存入的元素必须具有排序能力，也就是实现Comparable 或者是 Comparator
         *
         *  自然排序:implements Comparable
         *  客制化排序: implements Comparator    【定制器，需要放在TreeSet构造器中创建对象使用】
         *
         *  当前为使用Comparable实现自然排序
         */

//    public TreeSet() {
//            this(new TreeMap<>());
//        }
        TreeSet treeSet = new TreeSet(new StudntComparator());//如果要使用定制器来堆自定义类的对象添加到TreeSet，就需要在new TreeSet的时候，添加参数new一个定制比较器的对象
//        public boolean add(E e) {
//            return m.put(e, PRESENT)==null;
//        }
        treeSet.add(new Student("usamimizugi", 11));
        treeSet.add(new Student("ourinsama", 14));
        treeSet.add(new Student("jestom", 13));
        treeSet.add(new Student("Tim", 12));
        System.out.println(treeSet);
        //result: [Student{name='usamimizugi', age=11}, Student{name='Tim', age=12}, Student{name='jestom', age=13}, Student{name='ourinsama', age=14}]

        TreeSet treeSetTry = new TreeSet();
        treeSetTry.add(new Student("usamimizugi", 11));
        treeSetTry.add(new Student("ourinsama", 14));
        treeSetTry.add(new Student("jestom", 13));
        treeSetTry.add(new Student("Tim", 12));
        //result: [Student{name='usamimizugi', age=11}]
        System.out.println(treeSetTry);

    }
}

class Student implements Comparable {   //因为使用了定制比较器，这里的自定义对象不太应该实现Comparable接口
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    @Override
//    public int compareTo(Object o) {
//        Student stundent = (Student) o;
//        if (age > stundent.age) {
//            return 1;
//        } else if (age < stundent.age) {
//            return -1;
//        } else {
//            return name.compareTo(stundent.name);
//        }
//    }
    @Override   //这里是为了测试传入定制比较器的TreeSet对象，使用的到底是定制器的比较方法还是自定义类实现了Comparable的比较方法，结果是使用的定制器的比较方法
    public int compareTo(Object o) {
        return 0;   //这里返回0，是和任意对象比较都是相等了。为了测试这个TreeSet能不能传入同一个相等的值
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

