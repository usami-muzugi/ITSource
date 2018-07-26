package cn.ximcloud.itsource.day24_collections._10GenericLimit;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 19:09
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class GenericLimit {

/*
 * 泛型的上限,下限
 *
 * 		？ 号  ：表示通配符，不确定的类型，可以表示任意类型【? extends Object】 ；
        ?  extends　Number ：表示通配符？的上限 ，必须是Number及Number的子类
        ？  super    Number: 表示通配符 ？的下限，必须是Number及Number的父类
 *
 * */

    public static void main(String[] args) {
        ArrayList<Number> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        limit1(list1);
//        limit1(list2);    这里的报错能理解
        limit1(list3);
//        limit1(list4);
        limit1(list5);

        limit2(list1);
        limit2(list2);
//        limit2(list3);    这里也能理解
//        limit2(list4);
//       limit2(list5);

        Number number = 1;
        Object object = new Object();
        Double d = 3d;
        String string = "";
        Integer integer = 5;


        //这里开始准备复制创建对象，需要指明其类型
//        ArrayList<? extends Number> arrayList = new ArrayList<>();
//        arrayList.add(number);    //这下面为什么啊
//        arrayList.add(object);
//        arrayList.add(d);
//        arrayList.add(string);
//        arrayList.add(integer);

        //这样写虽然不会报错，但是原则上不推荐这样写
        ArrayList<? super Number> arrayList1 = new ArrayList<>();
        arrayList1.add(number);
//        arrayList1.add(object);       //这里也是，很迷
        arrayList1.add(d);
//        arrayList1.add(string);       //还有这
        arrayList1.add(integer);

    }

    //上限
    public static void limit1(ArrayList<? extends Number> list) {

    }

    //下限
    public static void limit2(ArrayList<? super Number> list) {

    }

}
