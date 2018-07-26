package cn.ximcloud.itsource.day17_exception._01exception;

import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
public class _08Review {


    /*
    自行测试 RuntimeException不会在编译时提示要求手动捕获或抛出
    Exception的子类除了RuntimeException之外的都是会在编译时提示要求手动捕获或抛出

    Throwable
    |----Error(错误，不能被程序猿捕获的，JVM级别的)
    |----Exception（异常，可以被程序猿捕获的，能够处理的）
            |
            |--RuntimeException(UncheckedException非检查异常)
            |--CheckedException（编译时异常）
     常见的异常有
     NullPointException ArrayIndexOfBoundsException ...

      Java里面异常分为两大类:checkedexception(检查异常)和unchecked exception(未检查异常)，
      对于未检查异常也叫RuntimeException(运行时异常),对于运行时异常，java编译器不要求你一定要把它捕获或者一定要继续抛出，
      但是对checkedexception(检查异常)要求你必须要在方法里面或者捕获或者继续抛出。
      也就是说，直接继承Exception的就是检查异常，而直接继承了RunTimeException的就是运行时异常（非检查异常）
     */
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test1() throws TestException {
        throw new TestException();
    }

    public static void test2() {
        throw new TestRunTimeException();
    }
}

class TestException extends Exception {

}

class TestRunTimeException extends RuntimeException {
    //重写父类getMessage()方法
    @Override
    public String getMessage() {
        return "打印信息13132";
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }
}
