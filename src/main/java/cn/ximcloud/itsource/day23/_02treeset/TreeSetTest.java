package cn.ximcloud.itsource.day23._02treeset;

import cn.ximcloud.itsource.day23._0hashset.Stundent;

import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 14:15
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class TreeSetTest {
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
        treeSet.add(12312);
        treeSet.add("12312");
        treeSet.add('1');


    }
}
class Student implements Comparable{
    String name;
    int age;

    @Override
    public int compareTo(Object o) {
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

