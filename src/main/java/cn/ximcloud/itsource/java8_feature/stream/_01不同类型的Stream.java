package cn.ximcloud.itsource.java8_feature.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: wzard
 * @date: 2018-09-04
 * Time: 00:37
 * ProjectName: itsource.cn.ximcloud.itsource.java8_feature.stream
 * To change this template use File | Settings | Editor | File and Code Templates.
 * <p>
 * you are not expected to understand this.
 * <p>
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/

public class _01不同类型的Stream {

    private Stream stream;

    /**
     * List 的stream
     */
    @Test
    public void test1() {
//        list有stream()方法
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::print);
//        set有
        Set hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.stream().forEach(System.out::print);
//        map 没有
        Map hashMap = new HashMap<>(16);
        hashMap.put(1, 2);
        hashMap.put(2, 2);
        hashMap.put(3, 2);
        hashMap.put(4, 2);
        hashMap.put(5, 2);
        hashMap.put(6, 2);
        hashMap.forEach((x, y) -> System.out.println(x + "  " + y));
    }

    /**
     * 常规Stream
     */
    @Test
    public void test2() {

        Integer integer = Stream.of(1, 2, 3, 4, 5, 6).findFirst().get();
        System.out.println(integer);

        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        integerStream.sorted().forEach(x -> System.out.print(x + " "));
    }

    /**
     * 常规stream 倒叙
     */
    @Test
    public void test3() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        integerStream.sorted((x, y) -> {
            if (x > y) {
                return -1;
            } else if (x < y) {
                return 1;
            } else {
                return 0;
            }

        }).forEach(x -> System.out.print(x + " "));
    }

    /**
     * 个数
     */
    @Test
    public void test4() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        long count = integerStream.count();
        System.out.println(count);
    }

    /**
     * 打开Stream流，然后过滤出大于100的然后再找到第一个，然后如果存在就打印
     */
    @Test
    public void test5() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        integerStream.filter(x -> x > 100).findFirst().ifPresent(System.out::print);
//        ifPresent的意思就是是否存在
        System.out.println();
        integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        integerStream.filter(x -> x.toString().startsWith("1")).findFirst().ifPresentOrElse(System.out::println,() -> System.out.println("没得！"));
//        ifPresentOrElse
//        这个方法是如果存在就执行前面的表达式，如果不存在就执行后面的这个表达式
    }

    /**
     * 匹配所有，并且看是否存在已a开头的数字.....
     *
     */
    @Test
    public void testAnyMatch() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        boolean a = integerStream.anyMatch(x -> x.toString().startsWith("a"));
        System.out.println(a);
    }

    /**
     * 匹配所有，并且是否每一个都是以a开头的
     */
    @Test
    public void testAllMatch() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        boolean a = integerStream.allMatch(x -> x.toString().startsWith("a"));
        System.out.println(a);
    }

    /**
     * 匹配是否有a结尾的
     */
    @Test
    public void testNoneMatch() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
        boolean a = integerStream.noneMatch(x -> x.toString().endsWith("a"));
        System.out.println(a);
    }

    /**
     * 除了常规的对象Stream，JAVA8还有特殊类型的Stream，用于处理基本数据类型int、long、double
     */
    @Test
    public void test6() {
//        以后做循环这样子来
        IntStream.range(1, 4).forEach(System.out::print);
        System.out.println();
//        左关右开

//        打印1-100的所有数字
        IntStream.range(1, 101).forEach(x -> System.out.print(x + " "));
        System.out.println();

//        求和1-100
        long sum = IntStream.range(1, 101).sum();
        System.out.println(sum);
    }

    /**
     * 个数
     */
    @Test
    public void test7() {
        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7).sum();
        System.out.println(sum);
    }

    /**
     * map -- reduce :map 将这个stream的元素进行绘制
     */
    @Test
    public void test8() {
        int sum = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).map(x -> 2 * x).sum();
        System.out.println(sum);
    }

    /**
     * 求平均值
     * ifPresentOrElse(a,b)
     */
    @Test
    public void test9() {
        IntStream.of(1, 2, 3, 4, 5, 6, 7).average().ifPresentOrElse(System.out::print, () -> System.out.println("NaN"));
    }

    /**
     * 原生Stream可以通过mapToObj()转换为对象Stream
     */
    @Test
    public void test10() {
//        绘制成对象
        IntStream.range(1, 100).mapToObj(x -> "x:" + x).forEach(System.out::print);
//        绘制成Double类型
        Stream.of(1, 2, 3, 4, 5, 6, 7).mapToDouble(x -> x).forEach(System.out::print);


        System.out.println();

        /**
         * 把对象绘制成int类型
         */
        Stream.of("a1", "a2", "a3", "a4", "a5", "a6", "a7", "a8").mapToInt(x -> {
            return Integer.valueOf(x.substring(1));
        }).forEach(System.out::print);
    }

    /**
     * 原生Stream也可以map成一个对象
     */
    @Test
    public void test11() {
        IntStream.range(1, 101).mapToObj(x -> "test-" + x).forEach(System.out::print);
    }

    /**
     * 组合map
     * 先map成一个int然后再map成一个字符串对象
     */
    @Test
    public void test12() {
        Stream.of(1.0, 2.0, 3.0, 4.0).mapToInt(Double::intValue).mapToObj(x -> "test12-" + x).forEach(System.out::println);
    }
    /**
     * 组合reduce
     * 先map成一个int然后再map成一个字符串对象
     */
    @Test
    public void test13() {
        Stream<Integer> integerStream = Stream.of(1, 3, 5, 4, 2, 2, 1, 2, 2, 2123, 123, 6, 7, 82, 1, 3, 34, 123123, 56, 25, 234, 23);
//        integerStream.map(x -> x).reduce(() ->{});
    }
}
