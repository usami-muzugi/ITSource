package cn.ximcloud.itsource.day24_collections._08GenericMethods;


import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-11
 * Time: 16:33
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * <p>
 * 方法使用泛型
 **/

public class GenericMethodsTest<T> {

    public static <T> T[] sortAndGetArray(T[] arr) {
        Object[] objects = Arrays.copyOf(arr, arr.length, arr.getClass());
        Arrays.sort(objects);
        return (T[]) objects;
    }

    /**
     * 测试自己写的泛型方法
     * 泛型方法，声明泛型的时候，需要在方法修饰符与返回值类型中间，用<>写上泛型
     * 泛型方法只能用以上的方法声明
     */
    @Test
    public void test() {
        Integer[] integers = new Integer[]{9, 9, 9, 8, 7, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 9, 87, 6, 5, 4, 4, 567, 8, 76, 54, 34, 567, 654, 45, 678, 7, 65};
        Integer[] integer = sortAndGetArray(integers);
        System.out.println(Arrays.toString(integer));
    }
}
