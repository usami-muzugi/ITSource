package cn.ximcloud.itsource.day1_day47.day24_collections._99test;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-11
 * Time: 10:09
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class test {


    @Before
    public void doBefore() {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);
        first.next.next.next = new ListNode(4);
        first.next.next.next.next = new ListNode(4);
    }

    @Test
    public void removeElements() {

    }


    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
