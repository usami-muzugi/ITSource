package cn.ximcloud.itsource.before.day21_dataresource.homework;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * Student: Wizard
 * Date: 2018-07-07
 * Time: 23:06
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
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
public class HomeWork1 {
    /*
    第一题：设计一个基于数组的容器类MyArrayList ，在该类内部封装一个Object类型数组，需要提供一些方法完成以下功能：
    >1 能把任意元素对象添加到MyArrayList中的数组中，每添加一次不能覆盖前一次添加的元素，给调用者反馈信息是否添加成功；
    >2 从MyArrayList中删除指定Object对象，如果删除成功返回被删除对象在数组中的脚标，如果没有找到该对象则返回-1，注意，每删除一个元素，该元素后面的所有元素应该向前整体移动一个位置；
    >3 给定一个Object对象，查询该对象在数组中第一次出现的脚标，如果一个都没有找到则返回-1；
    >4 给定一个脚标，查询并返回出这个脚标处的Object对象，如果脚标越界了则自定义抛出一个新的异常，异常信息为“亲，您传入的脚标超出了查询范围，请重新输入，[0,n]之间的数 n代表最大值”；
     */
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("0");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.add("5");
        myArrayList.add("5");
        myArrayList.add("5");
        myArrayList.add("5");
        myArrayList.add("5");
        System.out.println(myArrayList.del("0"));
        System.out.println(myArrayList);
        System.out.println(myArrayList.found(4));
        System.out.println(myArrayList.getSum());
    }
}

class MyArrayList {
    private Object[] object;
    private int sum;

    public MyArrayList() {
        this(10);
    }

    /**
     * MyArrayList构造器，传入一个ind类型的值设置为这个数组的长度
     *
     * @param length 设置数组的长度
     */
    public MyArrayList(int length) {
        object = new Object[length];
    }

    /**
     * 在数组的末尾添加一个元素
     *
     * @param object 被添加的元素
     */
    public void add(Object object) {
        if (sum == this.object.length) {
            Object[] temp = new Object[sum + 20];
            System.arraycopy(this.object, 0, temp, 0, sum);
            this.object = temp;
        }
        this.object[sum] = object;
        sum++;
        System.out.println("addition success!");
//        this.object[sum] = object;
//        sum++;
//        System.out.println("addition success!");
    }

    /**
     * 删除一个元素，如果有返回这个被删除的元素的索引，没有返回-1
     *
     * @param object 需要删除的对象
     * @return 返回被删除的元素的索引
     */
    public int del(Object object) {
        if (sum == 0) throw new NullPointerException("数组为空");
        for (int i = 0; i < sum; i++) {
            if (this.object[i].equals(object)) {
                Object[] temp = new Object[sum - 1];
                System.arraycopy(this.object, 0, temp, 0, i);   //123456
                System.arraycopy(this.object, i + 1, temp, i, sum - 1); //sum -2 一个是减去然后获得真实下标，另一个是减去一个元素
                this.object = temp;
                sum--;
                return i;
            }
        }
        return -1;
    }

    /**
     * 给定一个脚标，查询并返回出这个脚标处的Object对象，如果脚标越界了则自定义抛出一个新的异常，异常信息为“亲，您传入的脚标超出了查询范围，请重新输入，[0,n]之间的数 n代表最大值”
     *
     * @param index 索引位置
     * @return 返回这个索引位置的对象
     */
    public Object found(int index) {
        if (index < 0 || index >= sum)
            throw new IndexOutOfBoundsException("亲，您传入的脚标超出了查询范围，请重新输入，[0," + (sum - 1) + "]之间的数 " + (sum - 1) + "代表最大值");
        return object[index];
    }

    @Override
    public String toString() {
        Object[] temp = new Object[sum];
        System.arraycopy(object, 0, temp, 0, sum);
        return Arrays.toString(temp);
    }

    public int getSum() {
        return sum;
    }
}