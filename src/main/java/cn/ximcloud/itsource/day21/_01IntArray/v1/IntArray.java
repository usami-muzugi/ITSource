package cn.ximcloud.itsource.day21._01IntArray.v1;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-07
 * Time: 11:11
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class IntArray {
    /*
        实现固定长度，固定类型的一个Array
     */
    private int[] arr;  //arr代表这个数组，
    private int sum;

    public IntArray() {
        this(10);   //无参构造器设置默认长度为10
    }

    public IntArray(int length) {
        arr = new int[length];  //有参构造方法可以设置默认长度
    }

    public int getSum() {
        return sum;
    }

    /**
     * 固定长度固定类型数组添加一元素操作
     *
     * @param i 被添加的一个元素
     */
    public void add(int i) {
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
