package cn.ximcloud.itsource.day22._02arraylist_method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
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
//         * Removes all of the elements from this list.  The list will
//         * be empty after this call returns.
//         */
//        public void clear() {
//            modCount++;
//            final Object[] es = elementData;
//            for (int to = size, i = size = 0; i < to; i++)
//                es[i] = null;
//        }
        //list.clear();

//        /**   如果此列表总包含指定的元素，则返回true
//         * Returns {@code true} if this list contains the specified element.
//         * More formally, returns {@code true} if and only if this list contains
//         * at least one element {@code e} such that
//         * {@code Objects.equals(o, e)}.
//         *
//         * @param o element whose presence in this list is to be tested
//         * @return {@code true} if this list contains the specified element
//         */
//        public boolean contains(Object o) {
//            return indexOf(o) >= 0;
//        }
        ((ArrayList) list).contains("");

        //        /**   返回一个对象在ArrayList第一次出现的位置
//         * Returns the index of the first occurrence of the specified element
//         * in this list, or -1 if this list does not contain the element.
//         * More formally, returns the lowest index {@code i} such that
//         * {@code Objects.equals(o, get(i))},
//         * or -1 if there is no such index.
//         */
//        public int indexOf(Object o) {
//            if (o == null) {
//                for (int i = 0; i < size; i++)
//                    if (elementData[i]==null)
//                        return i;
//            } else {
//                for (int i = 0; i < size; i++)
//                    if (o.equals(elementData[i]))
//                        return i;
//            }
//            return -1;
//        }
        System.out.println(list.indexOf("黄瓜"));
//        /**   返回一个对象在ArrayList最后一次次出现的位置
//         * Returns the index of the last occurrence of the specified element
//         * in this list, or -1 if this list does not contain the element.
//         * More formally, returns the highest index {@code i} such that
//         * {@code Objects.equals(o, get(i))},
//         * or -1 if there is no such index.
//         */
//        public int lastIndexOf(Object o) {
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
//         * Returns an array containing all of the elements in this list
//         * in proper sequence (from first to last element).
//         *
//         * <p>The returned array will be "safe" in that no references to it are
//         * maintained by this list.  (In other words, this method must allocate
//         * a new array).  The caller is thus free to modify the returned array.
//         *
//         * <p>This method acts as bridge between array-based and collection-based
//         * APIs.
//         *
//         * @return an array containing all of the elements in this list in
//         *         proper sequence
//         */
//        public Object[] toArray() {
//            return Arrays.copyOf(elementData, size);
//        }

        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.print(object + " ");
        }

//        /**   返回该ArrayList的长度
//         * Returns the number of elements in this list.
//         *
//         * @return the number of elements in this list
//         */
//        public int size() {
//            return size;
//        }
//
//        /**   返回该ArrayList是否为空
//         * Returns {@code true} if this list contains no elements.
//         *
//         * @return {@code true} if this list contains no elements
//         */
//        public boolean isEmpty() {
//            return size == 0;
//        }
    }
}
