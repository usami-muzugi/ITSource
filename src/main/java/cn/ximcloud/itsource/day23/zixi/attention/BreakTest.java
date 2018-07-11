package cn.ximcloud.itsource.day23.zixi.attention;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 14:15
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 99) {
                break;
            }
        }


    }


    void test() {

    }

    void test(int i) {

    }

    int test(int... ints) {
        return 1;
    }

    int test(int i, int... ints) {
        return 1;
    }


}
