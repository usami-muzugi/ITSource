package cn.ximcloud.itsource.day24_collections._01hashmap;


import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-07-11
 * Time: 10:36
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * HashMap 中获得Key 和Values 的方法
 * 获取Key的方法，只能是获取Entry然后再获取Key
 * 获取Values的方法有两种
 * 一种是通过调用父类AbstactMap的values()方法来获取所有的values 该方法返回的对象是Collection 是一个集合，但是Collection<V>是一个接口，因为Collection是实现了It...(迭代器)的所以，可以使用迭代器把values的值获取
 * 二一种是通过Entry然后获取 K V ， 然后再遍历V 得到
 * <p>
 * <p>
 * 得到的集合，可以使用foreach来循环遍历，
 * 也可以是使用得到的这个Key然后获取values，因为Key是唯一的，所以能找到。
 * 还可以是通过迭代器来获取。
 * for循环是不可以的，得不到这个索引。
 **/

public class HashMapGetAll {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("彭睿", "睿智");
        hashMap.put("你好", "彭瑞");
        hashMap.put("ciao", "彭瑞");
        hashMap.put("こんにちは", "彭瑞");
        hashMap.put("holla", "彭瑞");
        hashMap.put("hello", "彭瑞");

        System.out.println("------------------values--------------------");
        //values    获取的是hashmap的所有Value的值
        //直接打印
        Collection<String> collection = hashMap.values();
        System.out.println(collection);

        //使用foreach循环遍历打印
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Object o : collection) {
            stringBuilder.append(o).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());

        //使用for循环遍历打印,不行
//        stringBuilder = new StringBuilder("[");
//        for (int i = 0; i < collection.size(); i++) {
//            System.out.print(collection + " ,");
//        }

        //使用迭代器循环遍历打印
        stringBuilder = new StringBuilder("[");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next()).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());


        System.out.println("------------------keyset--------------------");
        //KeySet    获取得是所有的Key作为一个set返回出来
        stringBuilder = new StringBuilder("[");
        Set<String> set = hashMap.keySet();
        for (Object o : set) {
            stringBuilder.append(o).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());

        //无法使用for循环遍历打印
//        stringBuilder = new StringBuilder("[");
//        for (int i = 0; i < set.size(); i++) {
//
//        }

        //使用迭代器遍历ketset打印
        stringBuilder = new StringBuilder("[");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            stringBuilder.append(iterator1.next()).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());


        System.out.println("------------------Entry--------------------");
        //Entry     返回的是每一行字段包含了Key Value
        //使用foreach 循环遍历打印
        stringBuilder = new StringBuilder("[");
        Set<Map.Entry<String, String>> set1 = hashMap.entrySet();
        for (Map.Entry<String, String> o : set1) {
//            stringBuilder.append(o + " ");
            stringBuilder.append(o.getKey()).append("=").append(o.getValue()).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());

        //使用迭代器循环遍历打印
        stringBuilder = new StringBuilder("[");
        Iterator<Map.Entry<String, String>> iterator2 = set1.iterator();
        while (iterator2.hasNext()) {
            stringBuilder.append(iterator2.next()).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());


        System.out.println("-------能获取key和Value映射的只有Entry和KetSet------------");
        stringBuilder = new StringBuilder("[");
        Set<String> set2 = hashMap.keySet();
        for (Object o : set2) {
            stringBuilder.append(o).append("=").append(hashMap.get(o)).append(" ");
        }
        System.out.println(stringBuilder.append("]").toString());
    }
}
