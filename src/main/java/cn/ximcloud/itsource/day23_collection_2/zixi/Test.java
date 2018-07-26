package cn.ximcloud.itsource.day23_collection_2.zixi;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-10
 * Time: 14:32
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 基本数据类型和引用数据类型得值的操作的回顾加强
 **/

public class Test {
    public static void main(String[] args) {
        String[] string = new String[2];
        int i = 1;
        test(string);
        System.out.println(string[0]);

        test(i);
        System.out.println(i);
    }

    static void test(String[] string) {
        string[0] = "1312312";  //引用类型传入的是变量的地址值，这里传入了string的对象的地址值，然后修改这个对象的[0]，所以这里的变量引用地址并没有变化，但是内部的值却发生了变化。体现了引用类型传递的是对象的地址值

    }

    static void test(int i) {
        i = 8;      //由于就近原则，这里的i就是指代的是test方法里的i然后将外部的变量i的值传递给方法类的局部变量i中
        //最后执行完方法，test内的i变量被销毁。所以这个并没有修改外部的局部变量。

    }
}
