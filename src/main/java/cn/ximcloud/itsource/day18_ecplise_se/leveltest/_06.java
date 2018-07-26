package cn.ximcloud.itsource.day18_ecplise_se.leveltest;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-03
 * Time: 14:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class _06 {  //这个是最后的修改的代码，抽象这个概念还是领悟地不够透彻，很多时候都是用的笨办法来实现。抽象的概念需要强加练习
    /*
    6，各种类型的几何图形都有自己的面积计算公式，但在一个CAD（计算机辅助设计）软件中，
    图形的种类非常多，如果程序需要计算出任何一种图形的面积，最简单 的想法是使用条件判断语句根据图形类型来选择相应的计算公式。
    然而，这种方法不太好，可能会导致嵌套层次很深的条件判断语句。另外，如果软件要扩充功能以 支持新的图形种类，
    则又不得不修改调用不同公式计算图形面积的代码。在学习了面向对象技术之后，
    你能对上述问题给出一个较好解决方案来吗？请以计算圆形(πr2)、矩形（长*宽）和三角形（低*高/2）三种几何图形的面积为例，列出关键代码。
     */
    public static void main(String[] args) {
        Juxin juxin = new Juxin(3, 4);
        System.out.println(juxin.mj());
        Yuan yuan = new Yuan(5);
        System.out.println(yuan.mj());
        SanJiaoXin sanJiaoXin = new SanJiaoXin(3, 1);
        System.out.println(sanJiaoXin.mj());
    }
}

abstract class Graph {
    double mj;

    abstract double mj();

}

class Juxin extends Graph {
    private double x;
    private double y;

    public Juxin(double x, double y) {
        this.x = x;
        this.y = y;
        super.mj = x * y;
    }

    @Override
    double mj() {
        return mj;
    }
}

class Yuan extends Graph {
    private double x;

    public Yuan(double x) {
        this.x = x;
        super.mj = Math.PI * x * x;
    }

    @Override
    double mj() {
        return mj;
    }
}

class SanJiaoXin extends Graph {
    private double x;
    private double y;

    public SanJiaoXin(double x, double y) {
        this.x = x;
        this.y = y;
        super.mj = x * y / 2;
    }

    @Override
    double mj() {
        return mj;
    }
}