package cn.ximcloud.itsource.day1_day47.day19_thread._99test;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-04
 * Time: 15:00
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {
    /*
        解释为什么几个线程能共享
        因为这几个对象都是操作的是同一个对象 stringBuffer，所以得到的是同一个对象的引用地址。
        所以能共享
     */
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("123");
        The the1 = new The(stringBuffer);
        The the2 = new The(stringBuffer);
        The the3 = new The(stringBuffer);
        the1.stringBuffer.append("aaa");
        System.out.println(the3.stringBuffer.toString());

    }
}

class The {
    public StringBuffer stringBuffer;

    public The(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }
}

