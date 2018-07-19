package cn.ximcloud.itsource.day30.leveltest;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-19
 * Time: 14:06
 * ProjectName: ITSource.cn.ximcloud.itsource.day30.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 2.	定义一个方法：判断3个int值的大小，返回最小的那个数；
 **/

public class Test_2 {
    /**
     * 传入三个int类型的变量，返回最小值
     *
     * @param a a
     * @param b b
     * @param c c
     * @return 返回最小值
     */
    public int solution(int a, int b, int c) {
        int minVal = a;
        if (b < minVal) minVal = b;
        if (c < minVal) minVal = c;
        return minVal;
    }

    @Test
    public void test() {
        System.out.println(solution(7, 2, 9));
    }
}
