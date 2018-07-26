package cn.ximcloud.itsource.day24_collections._08GenericMethods;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 16:45
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{9, 9, 9, 8, 7, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 9, 87, 6, 5, 4, 4, 567, 8, 76, 54, 34, 567, 654, 45, 678, 7, 65};
        Integer[] integer = method(integers);
        System.out.println(Arrays.toString(integer));

    }

    /**
     * 泛型的声明再static和 返回值类型的中间声明，只能这样声明
     *
     * @param arr 源数组
     * @param <T> 泛型类型
     * @return 返回一个泛型类型的数组
     */
    public static <T> T[] method(T[] arr) {
        Object[] object = Arrays.copyOf(arr, arr.length, arr.getClass());
        Arrays.sort(object);
        return (T[]) object;
    }
}
