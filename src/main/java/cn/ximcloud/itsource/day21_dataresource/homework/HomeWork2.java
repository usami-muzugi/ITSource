package cn.ximcloud.itsource.day21_dataresource.homework;

/**
 * Created by IntelliJ IDEA.
 * User: Wizard
 * Date: 2018-07-07
 * Time: 23:51
 * ProjectName: itsource
 * To change this template use File | Settings | File Templates.
 * <p>
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑          永无BUG     永不修改                  //
 * ////////////////////////////////////////////////////////////////////
 **/
public class HomeWork2 {
    /*
    第二题：基于链表方式实现的自定义容器类MyLinkedList代码：包含以下功能：(选做)
	add(Integer  obj) 分析上述两种数据存储方式的优缺点。（面试题）
     */

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf("123123"));
        System.out.println(linkedList);
    }
}

class LinkedList {
    /*
     *  链表实现，Node类，存放当前存储的数据和一个下一个Node的对象
     * */
    private Node first; //LinkedList这个存放的是第一个节点
    private int size;

    public LinkedList() {

    }

    /**
     * 创建链表，初始化first，传入存储的对象
     *
     * @param object 传入一个存储的对象
     */
    public LinkedList(Object object) {
        first = new Node();
        first.object = object;
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


    /**
     * 在链表的末尾插入一个node
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

    /**
     * 在链表的末尾插入一个node
     *
     * @param object 传入一个对象
     */
    public void add(Integer object) {
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

    /**
     * 在一个索引位置的前面插入一个node
     *
     * @param index  索引位置
     * @param object 传入的对象
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

    /**
     * 在一个链表删除一个节点
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

    /**
     * 把一个节点存储的对象修改
     *
     * @param index  一个节点的索引
     * @param object 一个存储的对象
     */
    public void arlert(int index, Object object) {
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
        }
        temp.object = object;
    }

    /**
     * 在一个链表顺序查找这个存储的对象
     *
     * @param object 一个存储的对象
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
