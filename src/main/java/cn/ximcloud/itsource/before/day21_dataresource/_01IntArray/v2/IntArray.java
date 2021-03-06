package cn.ximcloud.itsource.before.day21_dataresource._01IntArray.v2;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-07
 * Time: 11:11
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class IntArray {
    /*
        实现可变长度，固定类型的一个Array
    */
    private int[] arr;
    private int sum;    //sum是数据类存在的元素的个数

    public IntArray() {
        this(5);
    }

    public IntArray(int length) {
        arr = new int[length];
    }

    public int getSum() {
        return sum;
    }

    /**
     * 可变长度固定类型数组添加一元素操作
     *
     * @param i 被添加的一个元素
     */
    public void add(int i) {
        if (arr.length == sum) {
            int[] temp = new int[sum + 20]; //可变长度体现在这
            System.arraycopy(arr, 0, temp, 0, sum);
            arr = temp;
        }
        arr[sum] = i;
        sum++;
    }

    @Override
    public String toString() {
        int[] temp = new int[sum];
        System.arraycopy(arr, 0, temp, 0, sum);

        return Arrays.toString(temp);

    }
}
