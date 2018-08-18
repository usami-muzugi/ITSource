package cn.ximcloud.itsource.before.day24_collections._99test.BinaryTreeDemo.v1;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-09
 * Time: 11:46
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(12313).add(31313);
        System.out.println(binaryTree.firstNode);
        System.out.println(binaryTree.firstNode.getLeftNode());
        System.out.println(binaryTree.firstNode.getRightNode());
    }
}
