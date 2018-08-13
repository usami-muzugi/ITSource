package cn.ximcloud.itsource.day22_collection._01arraylist;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-08
 * Time: 10:34
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ArrayListTest {
    /*
     * ArrayList 集合类
     *  内部通过数组来实现的，允许提供一些方法来对数组进行操作
     *  他是线程不安全的
     *  现阶段，如果看到泛型，我们忽略掉这个泛型
     *
     *
     */
    public static void main(String[] args) {
//        /**   构造一个初始化长度为10的数组的空表
//         * Constructs an empty StudentList with an initial capacity of *ten*.
//         */
//        public ArrayList() {
//            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
//        }

//        /**
//         * Shared empty array instance used for default sized empty instances. We
//         * distinguish this from EMPTY_ELEMENTDATA to know how much to inflate when
//         * first element is added.
//         */
//        private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
        ArrayList<Object> arrayList = new ArrayList<>();

//        /**构造一个一个初始化长度为自定义长度的空表
//         * Constructs an empty StudentList with the specified initial capacity.
//         *
//         * @param  initialCapacity  the initial capacity of the StudentList
//         * @throws IllegalArgumentException if the specified initial capacity
//         *         is negative
//         */
//        public ArrayList(int initialCapacity) {
//            if (initialCapacity > 0) {
//                this.elementData = new Object[initialCapacity];
//            } else if (initialCapacity == 0) {
//                this.elementData = EMPTY_ELEMENTDATA;
//            } else {
//                throw new IllegalArgumentException("Illegal Capacity: "+
//                        initialCapacity);
//            }
//        }
        ArrayList<Object> arrayList1 = new ArrayList<>(100);

//        /**
//         * Appends the specified element to the end of this StudentList.
//         *
//         * @param e element to be appended to this StudentList
//         * @return {@code true} (as specified by {@link Collection#add})
//         */
//        public boolean add(E e) {
//            modCount++;
//            add(e, elementData, size);
//            return true;
//        }
        arrayList.add("小甜甜");
        arrayList.add("小耀文");


//        /**   是在抽象的collition里面写好的
//         * Returns HashSetTest string representation of this collection.  The string
//         * representation consists of HashSetTest StudentList of the collection's elements in the
//         * order they are returned by its iterator, enclosed in square brackets
//         * ({@code "[]"}).  Adjacent elements are separated by the characters
//         * {@code ", "} (comma and space).  Elements are converted to strings as
//         * by {@link String#valueOf(Object)}.
//         *
//         * @return HashSetTest string representation of this collection
//         */
//        public String toString() {
//            Iterator<E> it = iterator();  //迭代器
//            if (! it.hasNext())   //如果没有next元素
//                return "[]";      //直接返回[]
//
//            StringBuilder sb = new StringBuilder();   //有
//            sb.append('[');
//            for (;;) {
//                E e = it.next(); 打印e
//                sb.append(e == this ? "(this Collection)" : e);
//                if (! it.hasNext())
//                    return sb.append(']').toString();
//                sb.append(',').append(' ');
//            }
//        }
        System.out.println(arrayList);

    }
}
