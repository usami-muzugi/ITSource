package cn.ximcloud.itsource.before.day23_collection_2._99test.BinaryTreeDemo.v1;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-09
 * Time: 11:07
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 二叉树的模仿实现
 * Version 0.0.1
 * 添加了三个Node，用于指向父节点，左节点，右节点。
 * 添加了add方法，实现了传入一个值，可以添加到正确的位置
 **/

public class BinaryTree {

    BinaryNode firstNode;
    private int size;

    BinaryTree() {
        firstNode = new BinaryNode();
    }

    public BinaryTree(int number) {
        this();
        firstNode.number = number;
        size++;
    }

    public BinaryTree add(int number) {
        if (firstNode.number == 0) {
            firstNode.number = number;
        } else {
            BinaryNode temp = firstNode;
            BinaryNode fatherNode = null;
            while (true) {
                fatherNode = temp;
                if (temp.number > number) {
                    if (temp.leftNode == null) {
                        temp.fathreNode = fatherNode;
                        temp.leftNode = new BinaryNode(number);
                        return this;
                    } else {
                        temp = temp.leftNode;
                    }
                } else {
                    if (temp.rightNode == null) {
                        temp.fathreNode = fatherNode;
                        temp.rightNode = new BinaryNode(number);
                        return this;
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
        private final Object object = new Object();
        private BinaryNode fathreNode;
        private BinaryNode leftNode;
        private BinaryNode rightNode;
        private int number;

        BinaryNode() {

        }

        BinaryNode(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return number + "";
        }

        public BinaryNode getFathreNode() {
            return fathreNode;
        }

        public void setFathreNode(BinaryNode fathreNode) {
            this.fathreNode = fathreNode;
        }

        public BinaryNode getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(BinaryNode leftNode) {
            this.leftNode = leftNode;
        }

        public BinaryNode getRightNode() {
            return rightNode;
        }

        public void setRightNode(BinaryNode rightNode) {
            this.rightNode = rightNode;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

}



