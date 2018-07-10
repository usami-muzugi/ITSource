package cn.ximcloud.itsource.day23.zixi;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 10:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 *
 *6，各种类型的几何图形都有自己的面积计算公式，但在一个CAD（计算机辅助设计）软件中，
 *   图形的种类非常多，如果程序需要计算出任何一种图形的面积，
 *   最简单的想法是使用条件判断语句根据图形类型来选择相应的计算公式。
 *   然而，这种方法不太好，可能会导致嵌套层次很深的条件判断语句。另外，如果软件要扩充功能以 支持新的图形种类，
 *   则又不得不修改调用不同公式计算图形面积的代码。在学习了面向对象技术之后，
 *   你能对上述问题给出一个较好解决方案来吗？请以计算圆形(πr2)、矩形（长*宽）和三角形（低*高/2）
 *   三种几何图形的面积为例，列出关键代码。
 **/

public class cuoti {
    public static void main(String[] args) {
        Yuan yuan = new Yuan(10);
        System.out.println(yuan.getResult());
        JuXin juXin = new JuXin(3,200);
        System.out.println(juXin.getResult());
        SanJiaoXin sanJiaoXin = new SanJiaoXin(100, 40);
        System.out.println(sanJiaoXin.getResult());
    }








    static class Yuan implements Result{
        private int r;

        public Yuan() {
        }

        public Yuan(int r) {
            this.r = r;
        }

        @Override
        public double getResult() {
            return Math.PI * r * r;
        }
    }
    static class SanJiaoXin implements Result{
        private int di;
        private int gao;

        public SanJiaoXin() {
        }

        public SanJiaoXin(int di, int gao) {
            this.di = di;
            this.gao = gao;
        }

        @Override
        public double getResult() {
            return di * gao / 2;
        }
    }

    static class JuXin implements Result{
        private int di;
        private int gao;

        public JuXin() {
        }

        public JuXin(int di, int gao) {
            this.di = di;
            this.gao = gao;
        }

        @Override
        public double getResult() {
            return di * gao;
        }
    }

}
interface Result{
    double getResult();
}