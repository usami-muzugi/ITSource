package cn.ximcloud.itsource.day17_exception._01exception;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
public class _04ExceptionMsg {
    /*
        *异常信息的获取方式练习*
           分析:怎么捕获到的异常类型？
           本质是可能发生异常的代码块儿
           *产生了异常对象* JAVA万事万物皆对象
           一生汇编，汇编生B，B生C，C生万物，万物皆对象。
           当一个代码块产生了异常，只能产生一个异常对象


           自己处理异常的代码块儿，抛出了一个异常对象，自己的catch代码块儿捕获到了异常，
           保存了形式参数e，供结构体使用
       1.打印获得的异常对象.getMessage();
       2.异常对象.printStackTrace();
     */
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
            String string = null;
            string.length();
        } catch (ArithmeticException e) {//捕获异常
            System.out.println(e.getMessage());/// by zero
            e.printStackTrace();/*java.lang.ArithmeticException: / by zero
            public void printStackTrace() {
                printStackTrace(System.err);
            }
            at cn.ximcloud.itsource.day17_exception._01exception._04ExceptionMsg.main(_04ExceptionMsg.java:29)*/
            System.out.println("ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {//终极大杀器，千千万万异常直接捕获在此
            System.out.println("Exception");
        }

    }
}
