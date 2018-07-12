//package cn.ximcloud.itsource.day24._99test.BinaryTreeDemo.v3;
//
///**
// * Created by IntelliJ IDEA.
// * User: wzard
// * Date: 2018-07-10
// * Time: 13:14
// * ProjectName: ITSource
// * To change this template use File | Settings | Editor | File and Code Templates.
// * ////////////////////////////////////////////////////////////////////
// * 二叉树的模仿实现
// * Version 0.0.1
// * 添加了三个Node，用于指向父节点，左节点，右节点。
// * 添加了add方法，实现了传入一个值，可以添加到正确的位置
// * Vrsion 0.0.2
// * 删除了父节点，无意义的父节点。（暂时）
// * 重写了add方法，方法优化。
// * Version 0.0.3
// * 向Map方向实现
// * 重写了BinaryNode 使用泛型
// * 新增BinaryTree 构造方法
// * 问题:K 继承了 Number但是不能Number没有实现Comparable接口，没有ComaraTo()方法，不能对数字进行比较，
// **/
//
//public interface BinaryNodeInterface<K,V> {   //V BinaryNode存储的对象的类型 V
//    /**
//     * 获取节点对象的数据部分的对象
//     *
//     * @return 节点对象的数据部分的对象
//     */
//    public V getData();
//
//    /**
//     * 设置一个节点的数据部分的对象
//     *
//     * @param data 节点的数据部分的对象
//     */
//    public void setData(V data);
//
//    /**
//     * 获取该节点的左子节点
//     *
//     * @return 获取该节点的左子节点
//     */
//    public BinaryNodeInterface<K,V> getLeftChild();
//
//    /**
//     * 获取该节点的右子节点
//     *
//     * @return 获取该节点的右子节点
//     */
//    public BinaryNodeInterface<K,V> getRightChild();
//
//    /**
//     * 设置左子节点
//     *
//     * @param leftChild
//     */
//    public void setLeftChild(BinaryNodeInterface<K,V> leftChild);
//
//    /**
//     * 设置右子节点
//     *
//     * @param rightChild
//     */
//    public void setRightChild(BinaryNodeInterface<K,V> rightChild);
//
//
//    public boolean hasLeftChild();
//
//    public boolean hasRightChild();
//
//    /**
//     * 判断当前节点是否是叶子
//     *
//     * @return 如果是叶子则返回true
//     */
//    public boolean isLeaf();
//
//    /**
//     * 计算以该节点为根的子树的节点数目
//     *
//     * @return 返回以该节点为根的子树的节点数目
//     */
//    public int getNumberOfNodes();
//
//    /**
//     * 计算以该节点为根的子树的节点高度
//     *
//     * @return 返回以该节点为根的子树的节点高度
//     */
//    public int getHeight();
//
//    /**
//     * 复制以当前节点为根的子树
//     *
//     * @return 返回以当前节点为根的子树
//     */
//    public BinaryNodeInterface<K,V> copy();
//
//
//}
