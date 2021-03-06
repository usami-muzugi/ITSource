package cn.ximcloud.itsource.before.day21_dataresource._01IntArray.v3;

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

public class AllTypeArray {
    /*
        实现可变长度，可变类型的一个Array
    */

    private Object data;    //Object[]也是一个类，也是Object的子类
    private int sum;

    public AllTypeArray() {
        this(5);
    }

    public AllTypeArray(int length) {
        data = new Object[length];
    }

    public int getSum() {
        return sum;
    }


    /**
     * Objetc类型可变长度添加一元素操作
     *
     * @param i 被添加的一个元素
     */
    public void add(Object i) {
        if (((Object[]) data).length == sum) {
            Object[] temp = new Object[sum + 20];   //可变长度
            System.arraycopy(data, 0, temp, 0, sum);
            data = temp;
        }
        ((Object[]) data)[sum] = i;
        sum++;
    }

    @Override
    public String toString() {
        Object[] temp = new Object[sum];
        System.arraycopy(data, 0, temp, 0, sum);

        return Arrays.toString(temp);

    }
}
