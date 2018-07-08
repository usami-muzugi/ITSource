package cn.ximcloud.itsource.day22._04arraylist_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-08
 * Time: 11:34
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

//        /**   返回一个Iterator类的对象
//         * Returns an iterator over the elements in this list in proper sequence.
//         *
//         * <p>The returned iterator is <a href="#fail-fast"><i>fail-fast</i></a>.
//         *
//         * @return an iterator over the elements in this list in proper sequence
//         */
//        public Iterator<E> iterator() {
//            return new Itr();
//        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
