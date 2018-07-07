package cn.ximcloud.itsource.day21._02chainList;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-07
 * Time: 14:26
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class LinkedList {
    private Node first;
    private int size;

    public LinkedList() {

    }

    /**     创建链表，初始化first，传入存储的对象
     *
     * @param object 传入一个存储的对象
     */
    public LinkedList(Object object) {
        first = new Node();
        first.object=object;
        size++;
    }

    @Override
    public String toString() {
        Node temp = first;
        StringBuilder stringBuilder = new StringBuilder("[");
        while (temp != null) {
            if (temp.nextNode != null) {
                stringBuilder.append(temp.object + ",");
            } else {
                stringBuilder.append(temp.object + "]");
            }
            temp = temp.nextNode;
        }
        return stringBuilder.toString();
    }

    public int getSize() {
        return size;
    }


    /**在链表的末尾插入一个node
     *
     * @param object 传入一个对象
     */
    public void add(Object object) {
        if (first == null) {
            first = new Node(object);
        } else {
            Node temp = first;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = new Node(object);
        }
        size++;
    }

    /**在一个索引位置的前面插入一个node
     *
     * @param index     索引位置
     * @param object    传入的对象
     */
    public void add(int index, Object object) {
        if (first == null && index != 0) throw new IndexOutOfBoundsException("新的链表不能在下标为0以外的地方添加");
        Node temp = first;
        Node addNode = new Node(object);
        if (index == 0) {
            addNode.nextNode = temp;
            first = addNode;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.nextNode;
            }
            addNode.nextNode = temp.nextNode;
            temp.nextNode = addNode;
        }
    }

    /**在一个链表删除一个节点
     *
     * @param index 删除的节点的索引
     */
    public void del(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("下标越界");

        if (index == 0) {
            first = first.nextNode;
        } else {
            Node temp = first;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.nextNode;
            }
            temp.nextNode = temp.nextNode.nextNode;
        }
    }

    /** 把一个节点存储的对象修改
     *
     * @param index     一个节点的索引
     * @param object    一个存储的对象
     */
    public void arlert(int index, Object object) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
        }
        temp.object = object;
    }

    /** 在一个链表顺序查找这个存储的对象
     *
     * @param object    一个存储的对象
     * @return 返回该对象在这个链表的第一的索引，没找到返回-1
     */
    public int select(Object object) {
        if (object == null) throw new NullPointerException("不能传入null吧");
        Node temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.object.equals(object)) return i;
            temp = temp.nextNode;
        }
        return -1;
    }

    protected class Node {
        protected Object object;
        protected Node nextNode;

        protected Node(Object object) {
            this.object = object;
        }

        protected Node() {
        }
    }
}

