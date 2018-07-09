package cn.ximcloud.itsource.day23._0hashset;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 10:25
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class HashSetTest {
    public static void main(String[] args) {
//        public class HashSet<E>
//                extends AbstractSet<E>    继承抽象集
//                implements Set<E>, Cloneable, java.io.Serializable    实现Set 克隆    序列化
//        /**
//         * Constructs a new, empty set; the backing {@code HashMap} instance has
//         * default initial capacity (16) and load factor (0.75).
//         */
//    public HashSet() {
//            map = new HashMap<>();
//        }
//
//        /**
//         * Constructs a new set containing the elements in the specified
//         * collection.  The {@code HashMap} is created with default load factor
//         * (0.75) and an initial capacity sufficient to contain the elements in
//         * the specified collection.
//         *
//         * @param c the collection whose elements are to be placed into this set
//         * @throws NullPointerException if the specified collection is null
//         */
//    public HashSet(Collection<? extends E> c) {
//            map = new HashMap<>(Math.max((int) (c.size()/.75f) + 1, 16));
//            addAll(c);
//        }
//
//        /**
//         * Constructs a new, empty set; the backing {@code HashMap} instance has
//         * the specified initial capacity and the specified load factor.
//         *
//         * @param      initialCapacity   the initial capacity of the hash map
//         * @param      loadFactor        the load factor of the hash map
//         * @throws     IllegalArgumentException if the initial capacity is less
//         *             than zero, or if the load factor is nonpositive
//         */
//    public HashSet(int initialCapacity, float loadFactor) {
//            map = new HashMap<>(initialCapacity, loadFactor);
//        }
//
//        /**
//         * Constructs a new, empty set; the backing {@code HashMap} instance has
//         * the specified initial capacity and default load factor (0.75).
//         *
//         * @param      initialCapacity   the initial capacity of the hash table
//         * @throws     IllegalArgumentException if the initial capacity is less
//         *             than zero
//         */
//    public HashSet(int initialCapacity) {
//            map = new HashMap<>(initialCapacity);
//        }

        HashSet hashSet = new HashSet();
        hashSet.add("usamimizugi");
        hashSet.add("ourinsama");
        hashSet.add("jestom");
        hashSet.add('A');
        hashSet.add('A');
        hashSet.add('A');
        hashSet.add('A');   //连续添加不会报错，但是一个hashset只有一个该对象
        System.out.println(hashSet.add('A'));

//        public boolean add(E e) { //add方法实质上是调用字段 map.put()方法，返回一个bolean,如果已经添加过了，就返回false
//            return map.put(e, PRESENT)==null;
//        }
//        private static final Object PRESENT = new Object();   添加的这个PRESENT是一个private static final修饰的对象常量
//        private transient HashMap<E,Object> map; 这个map是HashMap的里面的一个字段
//
//        public V put(K key, V value) {    ///key就是传入的这个要添加的对象，value是这个常量PRESENT
//            return putVal(hash(key), key, value, false, true);
//        }
//
//        /**
//         * Implements Map.put and related methods.
//         *
//         * @param hash hash for key
//         * @param key the key
//         * @param value the value to put
//         * @param onlyIfAbsent if true, don't change existing value
//         * @param evict if false, the table is in creation mode.
//         * @return previous value, or null if none
//         */
//        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
//        boolean evict) {
//            Node<K,V>[] tab; Node<K,V> p; int n, i;
//            if ((tab = table) == null || (n = tab.length) == 0)
//                n = (tab = resize()).length;
//            if ((p = tab[i = (n - 1) & hash]) == null)
//                tab[i] = newNode(hash, key, value, null);
//            else {
//                Node<K,V> e; K k;
//                if (p.hash == hash &&
//                        ((k = p.key) == key || (key != null && key.equals(k))))
//                    e = p;
//                else if (p instanceof TreeNode)
//                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
//                else {
//                    for (int binCount = 0; ; ++binCount) {
//                        if ((e = p.next) == null) {
//                            p.next = newNode(hash, key, value, null);
//                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
//                                treeifyBin(tab, hash);
//                            break;
//                        }
//                        if (e.hash == hash &&
//                                ((k = e.key) == key || (key != null && key.equals(k))))
//                            break;
//                        p = e;
//                    }
//                }
//                if (e != null) { // existing mapping for key
//                    V oldValue = e.value;
//                    if (!onlyIfAbsent || oldValue == null)
//                        e.value = value;
//                    afterNodeAccess(e);
//                    return oldValue;
//                }
//            }
//            ++modCount;
//            if (++size > threshold)
//                resize();
//            afterNodeInsertion(evict);
//            return null;
//        }

        System.out.println(hashSet.size());
        System.out.println(hashSet);
    }

}
