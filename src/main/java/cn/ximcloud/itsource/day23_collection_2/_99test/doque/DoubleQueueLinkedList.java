package cn.ximcloud.itsource.day23_collection_2._99test.doque;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 15:02
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class DoubleQueueLinkedList {
    /*
        实现一个双端队列
     */

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addAtNext(1);
        doubleLinkedList.addAtNext(1);
        doubleLinkedList.addAtNext(1);
        doubleLinkedList.addAtNext(1);
        doubleLinkedList.addAtPervious(2);
        doubleLinkedList.addAtPervious(2);
        doubleLinkedList.addAtPervious(2);
        doubleLinkedList.addAtPervious(2);
        System.out.println(doubleLinkedList);

    }

}

class DoubleLinkedList {
    private Node thisNode;
    private int sum;

    DoubleLinkedList() {
        this(null);
    }

    DoubleLinkedList(Object object) {
        if (thisNode == null) {
            thisNode = new Node(object);
        }
    }

    DoubleLinkedList addAtPervious(Object object) {
        Node temp = thisNode;
        while (temp.perviousNode != null) {
            temp = temp.perviousNode;
        }
        temp.perviousNode = new Node(object);
        temp.nextNode = temp;
        sum++;
        return this;
    }

    void addAtNext(Object object) {
        Node temp = thisNode;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = new Node(object);
        temp.perviousNode = temp;
        //sum++;
        //return this;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        Node temp = thisNode;
        while (temp.perviousNode != null) {
            temp = temp.perviousNode;
        }
        while (temp != null) {
            stringBuffer.append(temp.object + ",");
            temp = temp.nextNode;
        }
        return stringBuffer.append("]").toString();
    }

    private class Node {
        Node perviousNode;
        Node nextNode;
        Object object;

        public Node(Object object) {
            this.object = object;
        }
    }
}
