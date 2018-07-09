package cn.ximcloud.itsource.day23._99test.BinaryTreeDemo.v2;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-09
 * Time: 11:46
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            binaryTree.add(random.nextInt());
        }
        System.out.println(binaryTree.firstNode);
        System.out.println(binaryTree.firstNode.getLeftNode());
        System.out.println(binaryTree.firstNode.getRightNode());
    }
}
