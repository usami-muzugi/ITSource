package cn.ximcloud.itsource.before.day22_collection._02arraylist_method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-08
 * Time: 10:51
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ArrayList_Method {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        /*private void add(E e, Object[] elementData, int s) */
        list.add("电脑");
        list.add("苹果");
        list.add("黄瓜");
        System.out.println(list.size());
        System.out.println(list);
        Collection cla = new ArrayList();
        ((ArrayList) cla).add(1231323);
        ((ArrayList) cla).add("131231");
        ((ArrayList) cla).add("dafa123");
        list.add("黄瓜");
        list.add(cla);
        System.out.println(list);
        list.remove(cla);
        System.out.println(list);
//        /**   把数组中所有的元素null掉
//         * Removes all of the elements from this StudentList.  The StudentList will
//         * be empty after this call returns.
//         */
//        public void clear() {
//            modCount++;
//            final Object[] es = elementData;
//            for (int to = size, i = size = 0; i < to; i++)
//                es[i] = null; //把数组的所有元素null掉
//        }
        //StudentList.clear();

//        /**   如果此列表总包含指定的元素，则返回true
//         * Returns {@code true} if this StudentList contains the specified element.
//         * More formally, returns {@code true} if and only if this StudentList contains
//         * at least one element {@code e} such that
//         * {@code Objects.equals(o, e)}.
//         *
//         * @param o element whose presence in this StudentList is to be tested
//         * @return {@code true} if this StudentList contains the specified element
//         */
//        public boolean contains(Object o) {
//            return indexOf(o) >= 0;   //indexOf(Object obj)是返回这个对象在这个表里面的索引，如果有的话就返回索引值，没有的话就返回-1.所以contains是判断一个列表中是否包含这个对象
//        }
        ((ArrayList) list).contains("");

//        /**   返回一个对象在ArrayList第一次出现的位置
//         * Returns the index of the first occurrence of the specified element
//         * in this StudentList, or -1 if this StudentList does not contain the element.
//         * More formally, returns the lowest index {@code i} such that
//         * {@code Objects.equals(o, get(i))},
//         * or -1 if there is no such index.
//         */
//        public int indexOf(Object o) {
//            if (o == null) {  //如果传入的对象是null的话，就判断ArrayList的里面第一个null在哪儿
//                for (int i = 0; i < size; i++)    //迭代
//                    if (elementData[i]==null)
//                        return i; //找到，返回i
//            } else {
//                for (int i = 0; i < size; i++)
//                    if (o.equals(elementData[i])) //判断两个对象是否相等需要使用.equals()
//                        return i;
//            }
//            return -1;        //没找到返回-1
//        }
        System.out.println(list.indexOf("黄瓜"));
//        /**   返回一个对象在ArrayList最后一次次出现的位置
//         * Returns the index of the last occurrence of the specified element
//         * in this StudentList, or -1 if this StudentList does not contain the element.
//         * More formally, returns the highest index {@code i} such that
//         * {@code Objects.equals(o, get(i))},
//         * or -1 if there is no such index.
//         */
//        public int lastIndexOf(Object o) {        //和indexOf()方法相反，是反向遍历的
//            if (o == null) {
//                for (int i = size-1; i >= 0; i--)
//                    if (elementData[i]==null)
//                        return i;
//            } else {
//                for (int i = size-1; i >= 0; i--)
//                    if (o.equals(elementData[i]))
//                        return i;
//            }
//            return -1;
//        }
        System.out.println(list.lastIndexOf("黄瓜"));


//        /**   返回一个数组把这个ArrayList的数组返回出去
//         * Returns an array containing all of the elements in this StudentList
//         * in proper sequence (from first to last element).
//         *
//         * <p>The returned array will be "safe" in that no references to it are
//         * maintained by this StudentList.  (In other words, this method must allocate
//         * HashSetTest new array).  The caller is thus free to modify the returned array.
//         *
//         * <p>This method acts as bridge between array-based and collection-based
//         * APIs.
//         *
//         * @return an array containing all of the elements in this StudentList in
//         *         proper sequence
//         */
//        public Object[] toArray() {
//            return Arrays.copyOf(elementData, size);  //返回一个拷贝的数组
//        }
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.print(object + " ");
        }

//        /**   返回该ArrayList的长度
//         * Returns the number of elements in this StudentList.
//         *
//         * @return the number of elements in this StudentList
//         */
//        public int size() {
//            return size;
//        }
//
//        /**   返回该ArrayList是否为空
//         * Returns {@code true} if this StudentList contains no elements.
//         *
//         * @return {@code true} if this StudentList contains no elements
//         */
//        public boolean isEmpty() {
//            return size == 0;
//        }
    }
}
