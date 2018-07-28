package cn.ximcloud.itsource.day22_collection.homework;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-08
 * Time: 12:41
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class HomeWork3 {
    /*
    ArrayList 和LinkedList的区别（面试题）


    ArrayList
    添加add消耗的时间:139568430
    查消耗的时间:887728238
    改消耗的时间:359112261
    删除del消耗的时间:18631150507
    LinkedList
    添加add消耗的时间:22858485
    查消耗的时间:979787405
    改消耗的时间:1624851604
    删除del消耗的时间:3084993055
    --------------------
    arr-link add : 116709945        消耗时间 arr>link   link添加快
    arr-link indexOf : -92059167    消耗时间 arr<link   arr查找快
    arr-link set : -1265739343      消耗时间 arr<link   arr修改快
    arr-link del : 15546157452      消耗时间 arr>link   link删除快


    1)	添加： 数组复制创建新数组，  链表直接挂在尾端 ：基于数组慢，变量链表快
    2)	删除： 数组需要复制数据      链表直接改变链接 ： 基于数组慢，变量链表快
    3)	修改： 数组直接找到索引位置  链表需要遍历链表 ： 基于数组快，变量链表慢
    4)	查找： 数组直接找到索引位置  链表需要遍历链表 ： 基于数组快，变量链表慢

                增加   删除    修改    查找
    基于数组     慢     慢      快      快
    变量链表     快     快      慢      慢

    在1W之后，时间就呈指数级增加

    所以，老老实实，选择MySQL

    ArrayList
添加add消耗的时间:25991977
查消耗的时间:223409375
改消耗的时间:336963409
删除del消耗的时间:5304991186
LinkedList
添加add消耗的时间:2101467
查消耗的时间:400177260
改消耗的时间:645772421
删除del消耗的时间:1051243938
--------------------
arr-link add : 23890510
arr-link indexOf : -176767885
arr-link set : -308809012
arr-link del : 4253747248

我选择I7-8700K
     */
    public static void main(String[] args) {
        System.out.println("ArrayList");
        Long time = System.nanoTime();
        Long[] times = new Long[8];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            arrayList.add(i + "");
        }
        System.out.println("添加add消耗的时间:" + (times[0] = (System.nanoTime() - time)));


        time = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.indexOf(i + "");
        }
        System.out.println("查消耗的时间:" + (times[1] = (System.nanoTime() - time)));

        time = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.set(arrayList.indexOf(i), null);
        }
        System.out.println("改消耗的时间:" + (times[2] = (System.nanoTime() - time)));


        time = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(Integer.valueOf(i));
            arrayList.remove(i + "");
        }
        System.out.println("删除del消耗的时间:" + (times[3] = (System.nanoTime() - time)));


        System.out.println("LinkedList");
        time = System.nanoTime();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
            linkedList.add(i + "");
        }
        System.out.println("添加add消耗的时间:" + (times[4] = (System.nanoTime() - time)));


        time = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.indexOf(i + "");
        }
        System.out.println("查消耗的时间:" + (times[5] = (System.nanoTime() - time)));

        time = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.set(linkedList.indexOf(i), null);
        }
        System.out.println("改消耗的时间:" + (times[6] = (System.nanoTime() - time)));


        time = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(Integer.valueOf(i));
            linkedList.remove(i + "");
        }
        System.out.println("删除del消耗的时间:" + (times[7] = (System.nanoTime() - time)));


        System.out.println("--------------------");
        System.out.println("arr-link add : " + (times[0] - times[4]));
        System.out.println("arr-link indexOf : " + (times[1] - times[5]));
        System.out.println("arr-link set : " + (times[2] - times[6]));
        System.out.println("arr-link del : " + (times[3] - times[7]));
    }
}
