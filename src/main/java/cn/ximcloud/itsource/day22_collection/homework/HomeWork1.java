package cn.ximcloud.itsource.day22_collection.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-08
 * Time: 12:34
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        有如下代码，请用3中以上的方式遍历该集合中的数据
        ArrayList list = new ArrayList();
        list.add(2013);
        list.add("基于数组的集合");
        list.add(true);
        list.add('I');
        list.add('T');
         */
        ArrayList list = new ArrayList();
        list.add(2013);
        list.add("基于数组的集合");
        list.add(true);
        list.add('I');
        list.add('T');

        //第一种
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println("\n--------------------------");

        //第二种
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n--------------------------");

        //第三种
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
