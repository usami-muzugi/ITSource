package cn.ximcloud.itsource.day21._02chainList;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-07
 * Time: 15:10
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("文国印");
        linkedList.add(1, "牛逼");
        linkedList.arlert(0,"usamimizugi");
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.del(1);
        System.out.println(linkedList.select("usamimizugi"));
        System.out.println(linkedList.select(312312));
        System.out.println(linkedList);
        System.out.println(linkedList.getSize());


    }
}
