package cn.ximcloud.itsource.day23._99test.BinaryTreeDemo.v3;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 13:14
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
 * Version 0.0.3
 **/

public interface BinaryNodeInterface<T> {   //T BinaryNode存储的对象的类型 T
    /**
     * 获取节点对象的数据部分的对象
     *
     * @return 节点对象的数据部分的对象
     */
    public T getData();

    /**
     * 设置一个节点的数据部分的对象
     *
     * @param data 节点的数据部分的对象
     */
    public void setData(T data);

    /**
     * 获取该节点的左子节点
     *
     * @return 获取该节点的左子节点
     */
    public BinaryNodeInterface<T> getLeftChild();

    /**
     * 获取该节点的右子节点
     *
     * @return 获取该节点的右子节点
     */
    public BinaryNodeInterface<T> getRightChild();

    /**
     * 设置左子节点
     *
     * @param leftChild
     */
    public void setLeftChild(BinaryNodeInterface<T> leftChild);

    /**
     * 设置右子节点
     *
     * @param rightChild
     */
    public void setRightChild(BinaryNodeInterface<T> rightChild);


    public boolean hasLeftChild();

    public boolean hasRightChild();

    /**
     * 判断当前节点是否是叶子
     *
     * @return 如果是叶子则返回true
     */
    public boolean isLeaf();

    /**
     * 计算以该节点为根的子树的节点数目
     *
     * @return 返回以该节点为根的子树的节点数目
     */
    public int getNumberOfNodes();

    /**
     * 计算以该节点为根的子树的节点高度
     *
     * @return 返回以该节点为根的子树的节点高度
     */
    public int getHeight();

    /**
     * 复制以当前节点为根的子树
     *
     * @return 返回以当前节点为根的子树
     */
    public BinaryNodeInterface<T> copy();


}
