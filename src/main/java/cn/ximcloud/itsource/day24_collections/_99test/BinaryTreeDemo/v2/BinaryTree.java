package cn.ximcloud.itsource.day24_collections._99test.BinaryTreeDemo.v2;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 11:07
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 二叉树的模仿实现
 * Version 0.0.1
 * 添加了三个Node，用于指向父节点，左节点，右节点。
 * 添加了add方法，实现了传入一个值，可以添加到正确的位置
 * Vrsion 0.0.2
 * 删除了父节点，无意义的父节点。（暂时）
 * 重写了add方法，方法优化。
 **/

public class BinaryTree {
    BinaryNode firstNode;
    private int size;

    BinaryTree() {
        firstNode = new BinaryNode();
    }

    public BinaryTree(int key) {
        this();
        firstNode.key = key;
        size++;
    }

    public BinaryTree add(int key) {
        if (firstNode.key == 0) {
            firstNode.key = key;
        } else {
            BinaryNode temp = firstNode;
            while (true) {
                if (temp.key > key) {
                    if (temp.leftNode == null) {
                        temp.leftNode = new BinaryNode(key);
                        break;
                    } else {
                        temp = temp.leftNode;
                    }
                } else {
                    if (temp.rightNode == null) {
                        temp.rightNode = new BinaryNode(key);
                        break;
                    } else {
                        temp = temp.rightNode;
                    }
                }
            }
        }
        size++;
        return this;
    }

    public BinaryTree add(int key, Object value) {
        if (firstNode.key == 0) {
            firstNode.key = key;
        } else {
            BinaryNode temp = firstNode;
            while (true) {
                if (temp.key > key) {
                    if (temp.leftNode == null) {
                        temp.leftNode = new BinaryNode(key);
                        temp.leftNode.value = value;
                        break;
                    } else {
                        temp = temp.leftNode;
                    }
                } else {
                    if (temp.rightNode == null) {
                        temp.rightNode = new BinaryNode(key);
                        temp.rightNode.value = value;
                        break;
                    } else {
                        temp = temp.rightNode;
                    }
                }
            }
        }
        size++;
        return this;
    }

    @Override
    public String toString() {

        return "";
    }

    public int getSize() {
        return size;
    }

    class BinaryNode {
        private BinaryNode leftNode;    //左节点
        private BinaryNode rightNode;   //右节点
        private int key;    //这个Key应该实现了Comparable 或者是Comparator
        private Object value = new Object();

        BinaryNode() {

        }

        public BinaryNode(int key) {
            this.key = key;
        }

        public BinaryNode(int key, Object value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

    }

}



