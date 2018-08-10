package cn.ximcloud.itsource.day22_collection._06linkedlist;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-08
 * Time: 15:21
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i + "");
        }

//        /**   把一个值传入到表的头部 实质上是在调用addFirst(E e)
//         * Pushes an element onto the stack represented by this List.  In other
//         * words, inserts the element at the front of this List.
//         *
//         * <p>This method is equivalent to {@link #addFirst}.
//         *
//         * @param e the element to push
//         * @since 1.6
//         */
//        public void push(E e) {
//            addFirst(e);
//        }
//        /**
//         * Links e as first element.
//         */
//        private void linkFirst(E e) {
//            final Node<E> f = first;
//            final Node<E> newNode = new Node<>(null, e, f);
//            first = newNode;
//            if (f == null)
//                last = newNode;
//            else
//                f.prev = newNode;
//            size++;
//            modCount++;
//        }
//        /**
//         * Inserts the specified element at the beginning of this List.
//         *
//         * @param e the element to add
//         */
//        public void addFirst(E e) {
//            linkFirst(e);
//        }
        linkedList.push("123123");
        System.out.println(linkedList);

//        /**   从此列表弹出第一个元素
//         * Pops an element from the stack represented by this List.  In other
//         * words, removes and returns the first element of this List.
//         *
//         * <p>This method is equivalent to {@link #removeFirst()}.
//         *
//         * @return the element at the front of this List (which is the top
//         *         of the stack represented by this List)
//         * @throws NoSuchElementException if this List is empty
//         * @since 1.6
//         */
//        public E pop() {  //如果此列表为空 抛出NoSuchElementException
//            return removeFirst(); //实质是在调用removeFirst()
//        }
//        public E removeFirst() {
//            final Node<E> f = first;
//            if (f == null)
//                throw new NoSuchElementException();
//            return unlinkFirst(f);
//        }
        System.out.println(linkedList.pop());
        System.out.println(linkedList);//返回了第一个元素，并且在链表中移除了这个元素


//        /**   获取并移除此列表的头（第一个元素）
//         * Retrieves and removes the head (first element) of this List.
//         *
//         * @return the head of this List, or {@code null} if this List is empty
//         * @since 1.5
//         */
//        public E poll() {     //poll
//            final Node<E> f = first;
//            return (f == null) ? null : unlinkFirst(f);
//        }
        linkedList.poll();

        // Queue operations.

//        /**   获取但不移除此列表的头（第一个元素）
//         * Retrieves, but does not remove, the head (first element) of this List.
//         *
//         * @return the head of this List, or {@code null} if this List is empty
//         * @since 1.5
//         */
//        public E peek() {
//            final Node<E> f = first;
//            return (f == null) ? null : f.item;
//        }
        linkedList.peek();


//        /**
//         * Retrieves, but does not remove, the head (first element) of this List.
//         *
//         * @return the head of this List
//         * @throws NoSuchElementException if this List is empty
//         * @since 1.5
//         */
//        public E element() {
//            return getFirst();
//        }
//        /**
//         * Returns the first element in this List.
//         *
//         * @return the first element in this List
//         * @throws NoSuchElementException if this List is empty
//         */
//        public E getFirst() {
//            final Node<E> f = first;
//            if (f == null)
//                throw new NoSuchElementException();
//            return f.item;
//        }
        linkedList.element();   //获取但不移除此列表的头（第一个元素） 如果链表为空会报错
    }
}
