package cn.ximcloud.itsource.day17._01exception;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-07-01
 * Time: 16:17
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
public class _03throws {
    public static void main(String[] args) {

        /*
            *抛出异常*
            自己不处理，抛出异常
            用throws
            这个异常后面的代码不重要，如果产生异常后面的代码就不需要运行
            自己不使用try...catch处理异常而是使用throws来抛出异常
            在方法头，抛出异常 throws 指定异常类型
            多个异常可以直接用逗号连接多个类型抛出
            我可以直接抛出一个Exception
            所有类型的异常我都可以抛出的或者是catch的

    异常分析:
        1，运行时异常RuntimeException
                虚拟机无法发现的，非语法错误的异常，运行时的，在编译时期是不会提示异常的
        2，编译时异常非运行时异常
                虚拟机在遍历检查语法时发现的异常
                编译时异常在写代码的时候会提示你需要立即处理这个异常
         */

        try {
            print(1, 0);    //方法的独立的调用
            System.out.println("其实我也不想处理异常，但是有特效");
        } catch (ArithmeticException e) {
            System.out.println("异常啦！啦啦啦！");
        }
        System.out.println("雅儿哟，哪里来的异常");

    }



    /**
     *
     * @param a 被除数
     * @param b 除数，不能等于0
     */
    //这个代码可能是别人开发的，没有写明这个方法的操作
    public static void print(int a, int b) throws ArithmeticException{
        System.out.println(a / b);//这个异常后面的代码如果遇到异常就不会执行，而且把异常这个锅丢给调用他的方法
        System.out.println("老子就是不处理异常!");
    }


    public static void print(int a, int b,int c) throws ArithmeticException,Exception{
        System.out.println(a / b);//这个异常后面的代码如果遇到异常就不会执行，而且把异常这个锅丢给调用他的方法
        System.out.println("老子就是不处理异常!");
    }
}
