package cn.ximcloud.itsource.before.day23_collection_2._02treeset.v1_Comparable;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-09
 * Time: 14:15
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class TreeSetTest {
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
     * 当前为使用Comparable实现自然排序
     */
    public static void main(String[] args) {
        /**
         * Constructs a new, empty tree set, sorted according to the
         * natural ordering of its elements.  All elements inserted into
         * the set must implement the {@link Comparable} interface.
         * Furthermore, all such elements must be <i>mutually
         * comparable</i>: {@code e1.compareTo(e2)} must not throw a
         * {@code ClassCastException} for any elements {@code e1} and
         * {@code e2} in the set.  If the user attempts to add an element
         * to the set that violates this constraint (for example, the user
         * attempts to add a string element to a set whose elements are
         * integers), the {@code add} call will throw a
         * {@code ClassCastException}.
         */
//    public TreeSet() {
//            this(new TreeMap<>());
//        }
        TreeSet treeSet = new TreeSet();
        /**
         * Adds the specified element to this set if it is not already present.
         * More formally, adds the specified element {@code e} to this set if
         * the set contains no element {@code e2} such that
         * {@code Objects.equals(e, e2)}.
         * If this set already contains the element, the call leaves the set
         * unchanged and returns {@code false}.
         *
         * @param e element to be added to this set
         * @return {@code true} if this set did not already contain the specified
         *         element
         * @throws ClassCastException if the specified object cannot be compared
         *         with the elements currently in this set
         * @throws NullPointerException if the specified element is null
         *         and this set uses natural ordering, or its comparator
         *         does not permit null elements
         */
//        public boolean add(E e) {
//            return m.put(e, PRESENT)==null;
//        }
//        treeSet.add(12312);
//        treeSet.add("12312");
        treeSet.add('1');
        treeSet.add('1');
        System.out.println(treeSet);

    }
}

class Student implements Comparable {   //实现Comparable 重写接口compareTo()方法
    String name;
    int age;

    @Override
    public int compareTo(Object o) {    //比较两个对象，大于返回1，等于返回0，小于返回-1
        Student stundent = (Student) o;
        if (age > stundent.age) {
            return 1;
        } else if (age < stundent.age) {
            return -1;
        } else {
            return name.compareTo(stundent.name);
        }
    }
}

