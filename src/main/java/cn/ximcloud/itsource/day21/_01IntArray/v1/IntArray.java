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
    private int[] arr;
    private int sum;
    public IntArray() {
        this(10);
    }

    public IntArray(int length) {
        arr = new int[length];
    }

    public int getSum() {
        return sum;
    }
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
