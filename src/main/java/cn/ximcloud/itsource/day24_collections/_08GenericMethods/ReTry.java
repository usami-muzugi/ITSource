package cn.ximcloud.itsource.day24_collections._08GenericMethods;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-11
 * Time: 19:09
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * sortAndGetArray
 **/

public class ReTry {

    /**
     * 由于印象不深刻，再自己重新写一遍
     *
     * @param arr arr是源数组
     * @param <T> 类型是泛型
     * @return 返回的是该泛型的类型的数组
     */
    public static <T> T[] sortAndGetArray(T[] arr) {
        //1.getArray

        Object[] objects = Arrays.copyOf(arr, arr.length, arr.getClass());
        Arrays.sort(objects);
        return (T[]) objects;
    }


    @Test
    public void testTest() {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 65, 4, 23, 142, 1234, 3452436, 5674, 24331, 14234, 124123, 41532, 6456, 6756, 4583546, 23453, 123, 41};
        System.out.println(Arrays.toString(sortAndGetArray(integers)));
    }

}
