package cn.ximcloud.itsource.day21_dataresource._01IntArray.v5;

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

    private Object[] data;    //Object[]也是一个类，也是Object的子类
    private int sum;    //数组的元素数

    public AllTypeArray() {
        this(5);
    }

    public AllTypeArray(int length) {
        data = new Object[length];
    }

    public int getSum() {
        return sum;
    }

    public AllTypeArray add(Object i) {
        if (data.length == sum) {
            Object[] temp = new Object[sum + 20];
            System.arraycopy(data, 0, temp, 0, sum);
            data = temp;
        }
        data[sum] = i;
        sum++;
        return this;
    }

    @Override
    public String toString() {
        Object[] temp = new Object[sum];
        System.arraycopy(data, 0, temp, 0, sum);
        return Arrays.toString(temp);
    }

    public Object getElementByIndex(int index) {
        if (index >= sum || index < 0) {
            throw new IndexOutOfBoundsException("Indenx Value can't was" + index);
        }
        return data[index];
    }

    public int getIndexByElement(Object object) {
        if (!(object == null)) {
            for (int i = 0; i < sum; i++) {
                if (data[i].equals(object)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
