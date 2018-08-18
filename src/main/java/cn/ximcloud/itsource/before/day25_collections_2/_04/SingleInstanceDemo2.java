package cn.ximcloud.itsource.before.day25_collections_2._04;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-12
 * Time: 14:52
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class SingleInstanceDemo2 {
    private static SingleInstanceDemo2 singleInstanceDemo2;


    private SingleInstanceDemo2() {
    }

    public synchronized static SingleInstanceDemo2 getInstance() {
        if (singleInstanceDemo2 == null) {
            singleInstanceDemo2 = new SingleInstanceDemo2();
        }
        return singleInstanceDemo2;
    }
}
