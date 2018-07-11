package cn.ximcloud.itsource.day24._06generic;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-11
 * Time: 18:58
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 *
 *  什么是泛型，泛型,就是在设计一个类[方法],定义一个类的时候,声明了泛型，在具体的使用的时候在指定类型
 *
 *  类设计 泛型使用 之 使用泛型
 **/

public class WhatIsGenericTest {

    @Test
    public void GenericTest() {
        /*public class ArrayList<E> extends AbstractList<E>
                implements List<E>, RandomAccess, Cloneable, java.io.Serializable*/
        ArrayList<String> arrayList = new ArrayList<>();    //在类型的后面跟上<泛型>
        arrayList.add("");
    }
}
