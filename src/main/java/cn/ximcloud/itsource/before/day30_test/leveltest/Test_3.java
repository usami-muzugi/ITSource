package cn.ximcloud.itsource.before.day30_test.leveltest;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * Student: wizard
 * Date: 2018-07-19
 * Time: 14:11
 * ProjectName: ITSource.cn.ximcloud.itsource.before.day30_test.leveltest
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 3.	定一个求多个整数积的方法（使用可变参数）
 **/

public class Test_3 {
    /**
     * 定一个求多个整数积的方法
     *
     * @param var 可变参数
     * @return 返回这些值得积
     */
    public int solution(int... var) {
        int outVal = 1;
        for (int i : var) {
            outVal *= i;
        }
        return outVal;
    }

    @Test
    public void test() {
        System.out.println(solution(1, 2, 3, 4, 5));
    }
}
