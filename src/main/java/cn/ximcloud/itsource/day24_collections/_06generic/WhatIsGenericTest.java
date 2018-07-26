package cn.ximcloud.itsource.day24_collections._06generic;

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
 * <p>
 * 什么是泛型，泛型,就是在设计一个类[方法],定义一个类的时候,声明了泛型，在具体的使用的时候在指定类型
 * <p>
 * 类设计 泛型使用 之 使用泛型
 * <p>
 * 用法 在实现了泛型的类的变量声明的时候，写明泛型的具体类型。  ArrayList<String> ,写明！写明！写明!
 * <p>
 * 值得注意的是，泛型不能写基本数据类型，如果需求是添加基本数据类型的变量，可以使用其对应的包装类
 **/

public class WhatIsGenericTest {

    /**
     * 测试：
     * <p>
     * 如果使用别人写的有泛型的类，类名<泛型所实现的类型> 变量名 = new 类名<这个地方，在JAVA1.7之后可以不写>();
     */
    @Test
    public void GenericTest() {
        /*public class ArrayList<E> extends AbstractList<E>
                implements List<E>, RandomAccess, Cloneable, java.io.Serializable*/
        ArrayList<String> arrayList = new ArrayList<>();    //在类型的后面跟上<泛型>
        arrayList.add("");
    }
}
