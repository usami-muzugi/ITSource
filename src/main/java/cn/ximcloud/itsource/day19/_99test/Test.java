package cn.ximcloud.itsource.day19._99test;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 15:00
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class Test {
    /*
        解释为什么几个线程能共享
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

class The{
    public StringBuffer stringBuffer;
    public The(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }
}

