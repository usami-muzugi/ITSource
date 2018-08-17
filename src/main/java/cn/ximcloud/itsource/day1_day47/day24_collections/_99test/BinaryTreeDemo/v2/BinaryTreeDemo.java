package cn.ximcloud.itsource.day1_day47.day24_collections._99test.BinaryTreeDemo.v2;

import java.util.Random;

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
        Random random = new Random();
        for (int i = 0; i < 200000; i++) {
            binaryTree.add(random.nextInt(), "Value:" + i);
        }
        System.out.println(binaryTree.firstNode);
    }
}
