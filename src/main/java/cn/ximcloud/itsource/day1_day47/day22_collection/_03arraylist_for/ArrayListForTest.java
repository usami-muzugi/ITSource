package cn.ximcloud.itsource.day1_day47.day22_collection._03arraylist_for;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-08
 * Time: 11:30
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class ArrayListForTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);


        //使用foreach循环来对arraylist的所有的元素遍历一遍并打印输出
        for (Object o : arrayList) {
            System.out.print(o + ",");
        }

        System.out.println("\n-----------------");

        //使用for循环--的来对ArrayList的所有的原属倒序遍历并打印输出
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\n-----------------");

        //使用for循环++的来对ArrayList的所有的原属顺序遍历并打印输出
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }

    }
}
