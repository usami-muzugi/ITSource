package cn.ximcloud.itsource.day19.homework;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-04
 * Time: 18:34
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 **/

public class HomeWork2 {
    /*
        1.	设计一个求和方法，接收参数使用可变参数
     */
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,3,5,7,9}));
    }

    public static int sum(int... ints) {
        int i = 0;
        for (int index:ints
             ) {
            i += index;
        }
        return i;
    }
}
