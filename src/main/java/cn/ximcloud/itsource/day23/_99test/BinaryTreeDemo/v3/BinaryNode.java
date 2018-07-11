package cn.ximcloud.itsource.day23._99test.BinaryTreeDemo.v3;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 13:27
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class BinaryNode<T> implements BinaryNodeInterface<T>, Serializable {
    /*
     *   字段仅需要三个就够了，一个是存放左子节点和一个存放右子节点，还有一个存放数据
     */
    private BinaryNode leftNode;
    private BinaryNode rightNode;
    private T data;

    public BinaryNode() {
        this(null); //调用的是下面的这个构造方法
    }

    public BinaryNode(T data) {
        this(null, null, data); //这个构造方法也是调用的下面的这个构造方法
    }

    public BinaryNode(BinaryNode leftNode, BinaryNode rightNode, T data) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }


    /**
     * 获取节点对象的数据部分的对象
     *
     * @return 节点对象的数据部分的对象
     */
    @Override
    public T getData() {
        return data;
    }

    /**
     * 设置一个节点的数据部分的对象
     *
     * @param data 节点的数据部分的对象
     */
    @Override
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 获取该节点的左子节点
     *
     * @return 获取该节点的左子节点
     */
    @Override
    public BinaryNodeInterface<T> getLeftChild() {
        return leftNode;
    }

    /**
     * 获取该节点的右子节点
     *
     * @return 获取该节点的右子节点
     */
    @Override
    public BinaryNodeInterface<T> getRightChild() {
        return rightNode;
    }

    /**
     * @param leftChild
     */
    @Override
    public void setLeftChild(BinaryNodeInterface<T> leftChild) {
        leftNode = (BinaryNode<T>) leftChild;   //BinaryNode是BinaryNodeInterface的实现类所有可以强制类型转换
    }

    /**
     * @param rightChild
     */
    @Override
    public void setRightChild(BinaryNodeInterface<T> rightChild) {
        rightNode = (BinaryNode) rightChild;
    }

    @Override
    public boolean hasLeftChild() {
        return leftNode != null;
    }

    @Override
    public boolean hasRightChild() {
        return false;
    }

    /**
     * 判断当前节点是否是叶子
     *
     * @return 如果是叶子则返回true
     */
    @Override
    public boolean isLeaf() {
        return leftNode == null && rightNode == null;
    }

    /**
     * 计算以该节点为根的子树的节点数目
     *
     * @return 返回以该节点为根的子树的节点数目
     */
    @Override
    public int getNumberOfNodes() {
        return 0;
    }

    /**
     * 计算以该节点为根的子树的节点高度
     *
     * @return 返回以该节点为根的子树的节点高度
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * 复制以当前节点为根的子树,这个不包含自己本身
     *
     * @return 返回以当前节点为根的子树
     */
    @Override
    public BinaryNodeInterface<T> copy() {
        BinaryNode<T> newNode = new BinaryNode<>(data);
        if (leftNode != null) {
            newNode.leftNode = (BinaryNode<T>) leftNode.copy();
        }
        if (rightNode != null) {
            newNode.rightNode = (BinaryNode) rightNode.copy();
        }
        return newNode;
    }
}
