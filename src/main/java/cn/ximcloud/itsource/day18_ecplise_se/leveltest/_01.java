package cn.ximcloud.itsource.day18_ecplise_se.leveltest;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-03
 * Time: 14:06
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 */

public class _01 {  //第一题没什么问题

    public static void main(String[] args) {
        _01 test = new _01();
        test.print(5);
    }

    /**
     * 打印**num是确定打印行数，然后也是第一行的**的个数
     *
     * @param num 表示用户要求打印的行数，以及第一行的个数
     */
    void print(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
