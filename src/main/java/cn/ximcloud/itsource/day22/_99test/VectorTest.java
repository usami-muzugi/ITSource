package cn.ximcloud.itsource.day22._99test;

import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-08
 * Time: 14:01
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class VectorTest {
    public static void main(String[] args) {
//      Vector是ArrayList的线程安全的类
//        /**
//         * Constructs an empty vector with the specified initial capacity and
//         * with its capacity increment equal to zero.
//         *
//         * @param   initialCapacity   the initial capacity of the vector
//         * @throws IllegalArgumentException if the specified initial capacity
//         *         is negative
//         */
//    public Vector(int initialCapacity) {
//            this(initialCapacity, 0);
//        }
//
//        /**
//         * Constructs an empty vector so that its internal data array
//         * has size {@code 10} and its standard capacity increment is
//         * zero.
//         */
//    public Vector() {
//            this(10);
//        }
        Vector vector = new Vector();
        vector.add("");

    }

}
